//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.fbe

// Fast Binary Encoding Long field model
class FieldModelInt64(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 8

    // Get the value
    fun get(defaults: Long = 0L): Long
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return defaults

        return readInt64(fbeOffset)
    }

    // Set the value
    fun set(value: Long)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        write(fbeOffset, value)
    }
}
