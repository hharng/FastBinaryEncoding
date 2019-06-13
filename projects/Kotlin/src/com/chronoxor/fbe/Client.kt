// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding base client
@Suppress("MemberVisibilityCanBePrivate")
abstract class Client
{
    // Get the send bytes buffer
    var sendBuffer: Buffer = Buffer()
        private set
    // Get the receive bytes buffer
    var receiveBuffer: Buffer = Buffer()
        private set
    // Enable/Disable logging
    var logging: Boolean = false
    // Get the final protocol flag
    var final: Boolean = false
        private set

    protected constructor(final: Boolean) { this.final = final }
    protected constructor(receiveBuffer: Buffer, sendBuffer: Buffer, final: Boolean) { this.receiveBuffer = receiveBuffer; this.sendBuffer = sendBuffer; this.final = final }

    // Reset the client buffers
    fun reset() { receiveBuffer.reset(); sendBuffer.reset() }

    // Send serialized buffer.
    // Direct call of the method requires knowledge about internals of FBE models serialization.
    // Use it with care!
    fun sendSerialized(serialized: Long): Long
    {
        assert(serialized > 0) { "Invalid size of the serialized buffer!" }
        if (serialized <= 0)
            return 0

        // Shift the send buffer
        sendBuffer.shift(serialized)

        // Send the value
        val sent = onSend(sendBuffer.data, 0, sendBuffer.size)
        sendBuffer.remove(0, sent)
        return sent
    }

    // Send message handler
    protected abstract fun onSend(buffer: ByteArray, offset: Long, size: Long): Long

    // Send log message handler
    @Suppress("UNUSED_PARAMETER")
    protected open fun onSendLog(message: String) {}

    // Receive data
    fun receive(buffer: Buffer) { receive(buffer.data, 0, buffer.size) }
    fun receive(buffer: ByteArray, offset: Long = 0, size: Long = buffer.size.toLong())
    {
        assert((offset + size) <= buffer.size) { "Invalid offset & size!" }
        if ((offset + size) > buffer.size)
            throw IllegalArgumentException("Invalid offset & size!")

        if (size == 0L)
            return

        // Storage buffer
        var offset0 = this.receiveBuffer.offset
        var offset1 = this.receiveBuffer.size
        var size1 = this.receiveBuffer.size

        // Receive buffer
        var offset2: Long = 0

        // While receive buffer is available to handle...
        while (offset2 < size)
        {
            var messageBuffer: ByteArray? = null
            var messageOffset: Long = 0
            var messageSize: Long = 0

            // Try to receive message size
            var messageSizeCopied = false
            var messageSizeFound = false
            while (!messageSizeFound)
            {
                // Look into the storage buffer
                if (offset0 < size1)
                {
                    var count = Math.min(size1 - offset0, 4)
                    if (count == 4L)
                    {
                        messageSizeCopied = true
                        messageSizeFound = true
                        messageSize = Buffer.readUInt32(this.receiveBuffer.data, offset0).toLong()
                        offset0 += 4
                        break
                    }
                    else
                    {
                        // Fill remaining data from the receive buffer
                        if (offset2 < size)
                        {
                            count = Math.min(size - offset2, 4 - count)

                            // Allocate and refresh the storage buffer
                            this.receiveBuffer.allocate(count)
                            size1 += count

                            System.arraycopy(buffer, (offset + offset2).toInt(), this.receiveBuffer.data, offset1.toInt(), count.toInt())
                            offset1 += count
                            offset2 += count
                            continue
                        }
                        else
                            break
                    }
                }

                // Look into the receive buffer
                if (offset2 < size)
                {
                    val count = Math.min(size - offset2, 4)
                    if (count == 4L)
                    {
                        messageSizeFound = true
                        messageSize = Buffer.readUInt32(buffer, offset + offset2).toLong()
                        offset2 += 4
                        break
                    }
                    else
                    {
                        // Allocate and refresh the storage buffer
                        this.receiveBuffer.allocate(count)
                        size1 += count

                        System.arraycopy(buffer, (offset + offset2).toInt(), this.receiveBuffer.data, offset1.toInt(), count.toInt())
                        offset1 += count
                        offset2 += count
                        continue
                    }
                }
                else
                    break
            }

            if (!messageSizeFound)
                return

            // Check the message full size
            assert(messageSize >= (4 + 4 + 4 + 4)) { "Invalid receive data!" }
            if (messageSize < (4 + 4 + 4 + 4))
                return

            // Try to receive message body
            var messageFound = false
            while (!messageFound)
            {
                // Look into the storage buffer
                if (offset0 < size1)
                {
                    var count = Math.min(size1 - offset0, messageSize - 4)
                    if (count == (messageSize - 4))
                    {
                        messageFound = true
                        messageBuffer = this.receiveBuffer.data
                        messageOffset = offset0 - 4
                        offset0 += messageSize - 4
                        break
                    }
                    else
                    {
                        // Fill remaining data from the receive buffer
                        if (offset2 < size)
                        {
                            // Copy message size into the storage buffer
                            if (!messageSizeCopied)
                            {
                                // Allocate and refresh the storage buffer
                                this.receiveBuffer.allocate(4)
                                size1 += 4

                                Buffer.write(this.receiveBuffer.data, offset0, messageSize.toUInt())
                                offset0 += 4
                                offset1 += 4

                                messageSizeCopied = true
                            }

                            count = Math.min(size - offset2, messageSize - 4 - count)

                            // Allocate and refresh the storage buffer
                            this.receiveBuffer.allocate(count)
                            size1 += count

                            System.arraycopy(buffer, (offset + offset2).toInt(), this.receiveBuffer.data, offset1.toInt(), count.toInt())
                            offset1 += count
                            offset2 += count
                            continue
                        }
                        else
                            break
                    }
                }

                // Look into the receive buffer
                if (offset2 < size)
                {
                    val count = Math.min(size - offset2, messageSize - 4)
                    if (!messageSizeCopied && (count == (messageSize - 4)))
                    {
                        messageFound = true
                        messageBuffer = buffer
                        messageOffset = offset + offset2 - 4
                        offset2 += messageSize - 4
                        break
                    }
                    else
                    {
                        // Copy message size into the storage buffer
                        if (!messageSizeCopied)
                        {
                            // Allocate and refresh the storage buffer
                            this.receiveBuffer.allocate(4)
                            size1 += 4

                            Buffer.write(this.receiveBuffer.data, offset0, messageSize.toUInt())
                            offset0 += 4
                            offset1 += 4

                            messageSizeCopied = true
                        }

                        // Allocate and refresh the storage buffer
                        this.receiveBuffer.allocate(count)
                        size1 += count

                        System.arraycopy(buffer, (offset + offset2).toInt(), this.receiveBuffer.data, offset1.toInt(), count.toInt())
                        offset1 += count
                        offset2 += count
                        continue
                    }
                }
                else
                    break
            }

            if (!messageFound)
            {
                // Copy message size into the storage buffer
                if (!messageSizeCopied)
                {
                    // Allocate and refresh the storage buffer
                    this.receiveBuffer.allocate(4)
                    size1 += 4

                    Buffer.write(this.receiveBuffer.data, offset0, messageSize.toUInt())
                    offset0 += 4
                    offset1 += 4

                    @Suppress("UNUSED_VALUE")
                    messageSizeCopied = true
                }
                return
            }

            if (messageBuffer != null)
            {
                @Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")
                val fbeStructSize: Long
                val fbeStructType: Long

                // Read the message parameters
                if (final)
                {
                    @Suppress("UNUSED_VALUE")
                    fbeStructSize = Buffer.readUInt32(messageBuffer, messageOffset).toLong()
                    fbeStructType = Buffer.readUInt32(messageBuffer, messageOffset + 4).toLong()
                }
                else
                {
                    val fbeStructOffset = Buffer.readUInt32(messageBuffer, messageOffset + 4).toLong()
                    @Suppress("UNUSED_VALUE")
                    fbeStructSize = Buffer.readUInt32(messageBuffer, messageOffset + fbeStructOffset).toLong()
                    fbeStructType = Buffer.readUInt32(messageBuffer, messageOffset + fbeStructOffset + 4).toLong()
                }

                // Handle the message
                onReceive(fbeStructType, messageBuffer, messageOffset, messageSize)
            }

            // Reset the storage buffer
            this.receiveBuffer.reset()

            // Refresh the storage buffer
            offset0 = this.receiveBuffer.offset
            offset1 = this.receiveBuffer.size
            size1 = this.receiveBuffer.size
        }
    }

    // Receive message handler
    abstract fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean

    // Receive log message handler
    @Suppress("UNUSED_PARAMETER")
    protected open fun onReceiveLog(message: String) {}
}
