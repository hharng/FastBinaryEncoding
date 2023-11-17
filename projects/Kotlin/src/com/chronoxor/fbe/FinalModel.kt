//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding base final model
@Suppress("MemberVisibilityCanBePrivate")
abstract class FinalModel protected constructor(protected var _buffer: Buffer, protected var _offset: Long)
{
    // Final offset
    var fbeOffset: Long
        get() = _offset
        set(value) { _offset = value }
    // Final size
    open val fbeSize: Long = 0
    // Final extra size
    open val fbeExtra: Long = 0

    // Shift the current final offset
    fun fbeShift(size: Long) { _offset += size }
    // Unshift the current final offset
    fun fbeUnshift(size: Long) { _offset -= size }

    // Check if the value is valid
    abstract fun verify(): Long

    // Buffer I/O methods
    protected fun readBoolean(offset: Long): Boolean { return Buffer.readBoolean(_buffer.data, _buffer.offset + offset) }
    protected fun readByte(offset: Long): Byte { return Buffer.readByte(_buffer.data, _buffer.offset + offset) }
    protected fun readChar(offset: Long): Char { return Buffer.readChar(_buffer.data, _buffer.offset + offset) }
    protected fun readWChar(offset: Long): Char { return Buffer.readWChar(_buffer.data, _buffer.offset + offset) }
    protected fun readInt8(offset: Long): Byte { return Buffer.readInt8(_buffer.data, _buffer.offset + offset) }
    protected fun readUInt8(offset: Long): UByte { return Buffer.readUInt8(_buffer.data, _buffer.offset + offset) }
    protected fun readInt16(offset: Long): Short { return Buffer.readInt16(_buffer.data, _buffer.offset + offset) }
    protected fun readUInt16(offset: Long): UShort { return Buffer.readUInt16(_buffer.data, _buffer.offset + offset) }
    protected fun readInt32(offset: Long): Int { return Buffer.readInt32(_buffer.data, _buffer.offset + offset) }
    protected fun readUInt32(offset: Long): UInt { return Buffer.readUInt32(_buffer.data, _buffer.offset + offset) }
    protected fun readInt64(offset: Long): Long { return Buffer.readInt64(_buffer.data, _buffer.offset + offset) }
    protected fun readUInt64(offset: Long): ULong { return Buffer.readUInt64(_buffer.data, _buffer.offset + offset) }
    protected fun readFloat(offset: Long): Float { return Buffer.readFloat(_buffer.data, _buffer.offset + offset) }
    protected fun readDouble(offset: Long): Double { return Buffer.readDouble(_buffer.data, _buffer.offset + offset) }
    protected fun readBytes(offset: Long, size: Long): ByteArray { return Buffer.readBytes(_buffer.data, _buffer.offset + offset, size) }
    protected fun readString(offset: Long, size: Long): String { return Buffer.readString(_buffer.data, _buffer.offset + offset, size) }
    protected fun readUUID(offset: Long): java.util.UUID { return Buffer.readUUID(_buffer.data, _buffer.offset + offset) }
    protected fun write(offset: Long, value: Boolean) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: Byte) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: UByte) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: Short) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: UShort) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: Int) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: UInt) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: Long) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: ULong) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: Float) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: Double) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: ByteArray) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
    protected fun write(offset: Long, value: ByteArray, valueOffset: Long, valueSize: Long) { Buffer.write(_buffer.data, _buffer.offset + offset, value, valueOffset, valueSize) }
    protected fun write(offset: Long, value: Byte, valueCount: Long) { Buffer.write(_buffer.data, _buffer.offset + offset, value, valueCount) }
    protected fun write(offset: Long, value: java.util.UUID) { Buffer.write(_buffer.data, _buffer.offset + offset, value) }
}
