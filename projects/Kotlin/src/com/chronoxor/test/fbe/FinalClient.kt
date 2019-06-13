// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.3.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

// Fast Binary Encoding com.chronoxor.test final client
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class FinalClient : com.chronoxor.fbe.Client, FinalReceiverListener
{
    // Imported senders
    val protoSender: com.chronoxor.proto.fbe.FinalClient

    // Imported receivers
    var protoReceiver: com.chronoxor.proto.fbe.FinalClient? = null

    // Client sender models accessors
    val StructSimpleSenderModel: StructSimpleFinalModel
    val StructOptionalSenderModel: StructOptionalFinalModel
    val StructNestedSenderModel: StructNestedFinalModel
    val StructBytesSenderModel: StructBytesFinalModel
    val StructArraySenderModel: StructArrayFinalModel
    val StructVectorSenderModel: StructVectorFinalModel
    val StructListSenderModel: StructListFinalModel
    val StructSetSenderModel: StructSetFinalModel
    val StructMapSenderModel: StructMapFinalModel
    val StructHashSenderModel: StructHashFinalModel
    val StructHashExSenderModel: StructHashExFinalModel
    val StructEmptySenderModel: StructEmptyFinalModel

    // Client receiver values accessors
    private val StructSimpleReceiverValue: com.chronoxor.test.StructSimple
    private val StructOptionalReceiverValue: com.chronoxor.test.StructOptional
    private val StructNestedReceiverValue: com.chronoxor.test.StructNested
    private val StructBytesReceiverValue: com.chronoxor.test.StructBytes
    private val StructArrayReceiverValue: com.chronoxor.test.StructArray
    private val StructVectorReceiverValue: com.chronoxor.test.StructVector
    private val StructListReceiverValue: com.chronoxor.test.StructList
    private val StructSetReceiverValue: com.chronoxor.test.StructSet
    private val StructMapReceiverValue: com.chronoxor.test.StructMap
    private val StructHashReceiverValue: com.chronoxor.test.StructHash
    private val StructHashExReceiverValue: com.chronoxor.test.StructHashEx
    private val StructEmptyReceiverValue: com.chronoxor.test.StructEmpty

    // Client receiver models accessors
    private val StructSimpleReceiverModel: StructSimpleFinalModel
    private val StructOptionalReceiverModel: StructOptionalFinalModel
    private val StructNestedReceiverModel: StructNestedFinalModel
    private val StructBytesReceiverModel: StructBytesFinalModel
    private val StructArrayReceiverModel: StructArrayFinalModel
    private val StructVectorReceiverModel: StructVectorFinalModel
    private val StructListReceiverModel: StructListFinalModel
    private val StructSetReceiverModel: StructSetFinalModel
    private val StructMapReceiverModel: StructMapFinalModel
    private val StructHashReceiverModel: StructHashFinalModel
    private val StructHashExReceiverModel: StructHashExFinalModel
    private val StructEmptyReceiverModel: StructEmptyFinalModel

    constructor() : super(true)
    {
        protoSender = com.chronoxor.proto.fbe.FinalClient(sendBuffer, receiveBuffer)
        protoReceiver = com.chronoxor.proto.fbe.FinalClient(sendBuffer, receiveBuffer)
        StructSimpleSenderModel = StructSimpleFinalModel(sendBuffer)
        StructSimpleReceiverValue = com.chronoxor.test.StructSimple()
        StructSimpleReceiverModel = StructSimpleFinalModel()
        StructOptionalSenderModel = StructOptionalFinalModel(sendBuffer)
        StructOptionalReceiverValue = com.chronoxor.test.StructOptional()
        StructOptionalReceiverModel = StructOptionalFinalModel()
        StructNestedSenderModel = StructNestedFinalModel(sendBuffer)
        StructNestedReceiverValue = com.chronoxor.test.StructNested()
        StructNestedReceiverModel = StructNestedFinalModel()
        StructBytesSenderModel = StructBytesFinalModel(sendBuffer)
        StructBytesReceiverValue = com.chronoxor.test.StructBytes()
        StructBytesReceiverModel = StructBytesFinalModel()
        StructArraySenderModel = StructArrayFinalModel(sendBuffer)
        StructArrayReceiverValue = com.chronoxor.test.StructArray()
        StructArrayReceiverModel = StructArrayFinalModel()
        StructVectorSenderModel = StructVectorFinalModel(sendBuffer)
        StructVectorReceiverValue = com.chronoxor.test.StructVector()
        StructVectorReceiverModel = StructVectorFinalModel()
        StructListSenderModel = StructListFinalModel(sendBuffer)
        StructListReceiverValue = com.chronoxor.test.StructList()
        StructListReceiverModel = StructListFinalModel()
        StructSetSenderModel = StructSetFinalModel(sendBuffer)
        StructSetReceiverValue = com.chronoxor.test.StructSet()
        StructSetReceiverModel = StructSetFinalModel()
        StructMapSenderModel = StructMapFinalModel(sendBuffer)
        StructMapReceiverValue = com.chronoxor.test.StructMap()
        StructMapReceiverModel = StructMapFinalModel()
        StructHashSenderModel = StructHashFinalModel(sendBuffer)
        StructHashReceiverValue = com.chronoxor.test.StructHash()
        StructHashReceiverModel = StructHashFinalModel()
        StructHashExSenderModel = StructHashExFinalModel(sendBuffer)
        StructHashExReceiverValue = com.chronoxor.test.StructHashEx()
        StructHashExReceiverModel = StructHashExFinalModel()
        StructEmptySenderModel = StructEmptyFinalModel(sendBuffer)
        StructEmptyReceiverValue = com.chronoxor.test.StructEmpty()
        StructEmptyReceiverModel = StructEmptyFinalModel()
    }

    constructor(sendBuffer: com.chronoxor.fbe.Buffer, receiveBuffer: com.chronoxor.fbe.Buffer) : super(sendBuffer, receiveBuffer, true)
    {
        protoSender = com.chronoxor.proto.fbe.FinalClient(sendBuffer, receiveBuffer)
        protoReceiver = com.chronoxor.proto.fbe.FinalClient(sendBuffer, receiveBuffer)
        StructSimpleSenderModel = StructSimpleFinalModel(sendBuffer)
        StructSimpleReceiverValue = com.chronoxor.test.StructSimple()
        StructSimpleReceiverModel = StructSimpleFinalModel()
        StructOptionalSenderModel = StructOptionalFinalModel(sendBuffer)
        StructOptionalReceiverValue = com.chronoxor.test.StructOptional()
        StructOptionalReceiverModel = StructOptionalFinalModel()
        StructNestedSenderModel = StructNestedFinalModel(sendBuffer)
        StructNestedReceiverValue = com.chronoxor.test.StructNested()
        StructNestedReceiverModel = StructNestedFinalModel()
        StructBytesSenderModel = StructBytesFinalModel(sendBuffer)
        StructBytesReceiverValue = com.chronoxor.test.StructBytes()
        StructBytesReceiverModel = StructBytesFinalModel()
        StructArraySenderModel = StructArrayFinalModel(sendBuffer)
        StructArrayReceiverValue = com.chronoxor.test.StructArray()
        StructArrayReceiverModel = StructArrayFinalModel()
        StructVectorSenderModel = StructVectorFinalModel(sendBuffer)
        StructVectorReceiverValue = com.chronoxor.test.StructVector()
        StructVectorReceiverModel = StructVectorFinalModel()
        StructListSenderModel = StructListFinalModel(sendBuffer)
        StructListReceiverValue = com.chronoxor.test.StructList()
        StructListReceiverModel = StructListFinalModel()
        StructSetSenderModel = StructSetFinalModel(sendBuffer)
        StructSetReceiverValue = com.chronoxor.test.StructSet()
        StructSetReceiverModel = StructSetFinalModel()
        StructMapSenderModel = StructMapFinalModel(sendBuffer)
        StructMapReceiverValue = com.chronoxor.test.StructMap()
        StructMapReceiverModel = StructMapFinalModel()
        StructHashSenderModel = StructHashFinalModel(sendBuffer)
        StructHashReceiverValue = com.chronoxor.test.StructHash()
        StructHashReceiverModel = StructHashFinalModel()
        StructHashExSenderModel = StructHashExFinalModel(sendBuffer)
        StructHashExReceiverValue = com.chronoxor.test.StructHashEx()
        StructHashExReceiverModel = StructHashExFinalModel()
        StructEmptySenderModel = StructEmptyFinalModel(sendBuffer)
        StructEmptyReceiverValue = com.chronoxor.test.StructEmpty()
        StructEmptyReceiverModel = StructEmptyFinalModel()
    }

    @Suppress("JoinDeclarationAndAssignment")
    fun send(obj: Any): Long
    {
        when (obj)
        {
            is com.chronoxor.test.StructSimple -> return send(obj)
            is com.chronoxor.test.StructOptional -> return send(obj)
            is com.chronoxor.test.StructNested -> return send(obj)
            is com.chronoxor.test.StructBytes -> return send(obj)
            is com.chronoxor.test.StructArray -> return send(obj)
            is com.chronoxor.test.StructVector -> return send(obj)
            is com.chronoxor.test.StructList -> return send(obj)
            is com.chronoxor.test.StructSet -> return send(obj)
            is com.chronoxor.test.StructMap -> return send(obj)
            is com.chronoxor.test.StructHash -> return send(obj)
            is com.chronoxor.test.StructHashEx -> return send(obj)
            is com.chronoxor.test.StructEmpty -> return send(obj)
        }

        // Try to send using imported clients
        @Suppress("CanBeVal")
        var result: Long
        result = protoSender.send(obj)
        if (result > 0)
            return result

        return 0
    }

    fun send(value: com.chronoxor.test.StructSimple): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructSimpleSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructSimple serialization failed!" }
        assert(StructSimpleSenderModel.verify()) { "com.chronoxor.test.StructSimple validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructOptional): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructOptionalSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructOptional serialization failed!" }
        assert(StructOptionalSenderModel.verify()) { "com.chronoxor.test.StructOptional validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructNested): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructNestedSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructNested serialization failed!" }
        assert(StructNestedSenderModel.verify()) { "com.chronoxor.test.StructNested validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructBytes): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructBytesSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructBytes serialization failed!" }
        assert(StructBytesSenderModel.verify()) { "com.chronoxor.test.StructBytes validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructArray): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructArraySenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructArray serialization failed!" }
        assert(StructArraySenderModel.verify()) { "com.chronoxor.test.StructArray validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructVector): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructVectorSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructVector serialization failed!" }
        assert(StructVectorSenderModel.verify()) { "com.chronoxor.test.StructVector validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructList): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructListSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructList serialization failed!" }
        assert(StructListSenderModel.verify()) { "com.chronoxor.test.StructList validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructSet): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructSetSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructSet serialization failed!" }
        assert(StructSetSenderModel.verify()) { "com.chronoxor.test.StructSet validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructMap): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructMapSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructMap serialization failed!" }
        assert(StructMapSenderModel.verify()) { "com.chronoxor.test.StructMap validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructHash): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructHashSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructHash serialization failed!" }
        assert(StructHashSenderModel.verify()) { "com.chronoxor.test.StructHash validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructHashEx): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructHashExSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructHashEx serialization failed!" }
        assert(StructHashExSenderModel.verify()) { "com.chronoxor.test.StructHashEx validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: com.chronoxor.test.StructEmpty): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructEmptySenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.test.StructEmpty serialization failed!" }
        assert(StructEmptySenderModel.verify()) { "com.chronoxor.test.StructEmpty validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }

    // Send message handler
    override fun onSend(buffer: ByteArray, offset: Long, size: Long): Long { throw UnsupportedOperationException("com.chronoxor.test.fbe.Client.onSend() not implemented!") }
    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: FinalReceiverListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            com.chronoxor.test.fbe.StructSimpleFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructSimpleReceiverModel.attach(buffer, offset)
                assert(StructSimpleReceiverModel.verify()) { "com.chronoxor.test.StructSimple validation failed!" }
                val deserialized = StructSimpleReceiverModel.deserialize(StructSimpleReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructSimple deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructSimpleReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructSimpleReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructOptionalFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructOptionalReceiverModel.attach(buffer, offset)
                assert(StructOptionalReceiverModel.verify()) { "com.chronoxor.test.StructOptional validation failed!" }
                val deserialized = StructOptionalReceiverModel.deserialize(StructOptionalReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructOptional deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructOptionalReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructOptionalReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructNestedFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructNestedReceiverModel.attach(buffer, offset)
                assert(StructNestedReceiverModel.verify()) { "com.chronoxor.test.StructNested validation failed!" }
                val deserialized = StructNestedReceiverModel.deserialize(StructNestedReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructNested deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructNestedReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructNestedReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructBytesFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructBytesReceiverModel.attach(buffer, offset)
                assert(StructBytesReceiverModel.verify()) { "com.chronoxor.test.StructBytes validation failed!" }
                val deserialized = StructBytesReceiverModel.deserialize(StructBytesReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructBytes deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructBytesReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructBytesReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructArrayFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructArrayReceiverModel.attach(buffer, offset)
                assert(StructArrayReceiverModel.verify()) { "com.chronoxor.test.StructArray validation failed!" }
                val deserialized = StructArrayReceiverModel.deserialize(StructArrayReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructArray deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructArrayReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructArrayReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructVectorFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructVectorReceiverModel.attach(buffer, offset)
                assert(StructVectorReceiverModel.verify()) { "com.chronoxor.test.StructVector validation failed!" }
                val deserialized = StructVectorReceiverModel.deserialize(StructVectorReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructVector deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructVectorReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructVectorReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructListFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructListReceiverModel.attach(buffer, offset)
                assert(StructListReceiverModel.verify()) { "com.chronoxor.test.StructList validation failed!" }
                val deserialized = StructListReceiverModel.deserialize(StructListReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructList deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructListReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructListReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructSetFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructSetReceiverModel.attach(buffer, offset)
                assert(StructSetReceiverModel.verify()) { "com.chronoxor.test.StructSet validation failed!" }
                val deserialized = StructSetReceiverModel.deserialize(StructSetReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructSet deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructSetReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructSetReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructMapFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructMapReceiverModel.attach(buffer, offset)
                assert(StructMapReceiverModel.verify()) { "com.chronoxor.test.StructMap validation failed!" }
                val deserialized = StructMapReceiverModel.deserialize(StructMapReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructMap deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructMapReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructMapReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructHashFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructHashReceiverModel.attach(buffer, offset)
                assert(StructHashReceiverModel.verify()) { "com.chronoxor.test.StructHash validation failed!" }
                val deserialized = StructHashReceiverModel.deserialize(StructHashReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructHash deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructHashReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructHashReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructHashExFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructHashExReceiverModel.attach(buffer, offset)
                assert(StructHashExReceiverModel.verify()) { "com.chronoxor.test.StructHashEx validation failed!" }
                val deserialized = StructHashExReceiverModel.deserialize(StructHashExReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructHashEx deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructHashExReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructHashExReceiverValue)
                return true
            }
            com.chronoxor.test.fbe.StructEmptyFinalModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                StructEmptyReceiverModel.attach(buffer, offset)
                assert(StructEmptyReceiverModel.verify()) { "com.chronoxor.test.StructEmpty validation failed!" }
                val deserialized = StructEmptyReceiverModel.deserialize(StructEmptyReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.test.StructEmpty deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = StructEmptyReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(StructEmptyReceiverValue)
                return true
            }
        }

        if ((protoReceiver != null) && protoReceiver!!.onReceiveListener(listener, type, buffer, offset, size))
            return true

        return false
    }
}
