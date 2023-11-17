//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding bytes field model
public final class FieldModelBytes extends FieldModel
{
    public FieldModelBytes(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }
    // Get the field extra size
    @Override
    public long fbeExtra()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeBytesOffset = readInt32(fbeOffset());
        if ((fbeBytesOffset == 0) || ((_buffer.getOffset() + fbeBytesOffset + 4) > _buffer.getSize()))
            return 0;

        int fbeBytesSize = readInt32(fbeBytesOffset);
        return 4 + fbeBytesSize;
    }

    // Check if the bytes value is valid
    @Override
    public boolean verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return true;

        int fbeBytesOffset = readInt32(fbeOffset());
        if (fbeBytesOffset == 0)
            return true;

        if ((_buffer.getOffset() + fbeBytesOffset + 4) > _buffer.getSize())
            return false;

        int fbeBytesSize = readInt32(fbeBytesOffset);
        if ((_buffer.getOffset() + fbeBytesOffset + 4 + fbeBytesSize) > _buffer.getSize())
            return false;

        return true;
    }

    // Get the bytes value
    public java.nio.ByteBuffer get() { return get(java.nio.ByteBuffer.allocate(0)); }
    public java.nio.ByteBuffer get(java.nio.ByteBuffer defaults)
    {
        assert (defaults != null) : "Invalid default bytes value!";
        if (defaults == null)
            throw new IllegalArgumentException("Invalid default bytes value!");

        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return defaults;

        int fbeBytesOffset = readInt32(fbeOffset());
        if (fbeBytesOffset == 0)
            return defaults;

        assert ((_buffer.getOffset() + fbeBytesOffset + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeBytesOffset + 4) > _buffer.getSize())
            return defaults;

        int fbeBytesSize = readInt32(fbeBytesOffset);
        assert ((_buffer.getOffset() + fbeBytesOffset + 4 + fbeBytesSize) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeBytesOffset + 4 + fbeBytesSize) > _buffer.getSize())
            return defaults;

        return java.nio.ByteBuffer.wrap(readBytes(fbeBytesOffset + 4, fbeBytesSize));
    }

    // Set the bytes value
    public void set(java.nio.ByteBuffer value)
    {
        assert (value != null) : "Invalid bytes value!";
        if (value == null)
            throw new IllegalArgumentException("Invalid bytes value!");

        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return;

        int fbeBytesSize = value.array().length;
        int fbeBytesOffset = (int)(_buffer.allocate(4 + fbeBytesSize) - _buffer.getOffset());
        assert ((fbeBytesOffset > 0) && ((_buffer.getOffset() + fbeBytesOffset + 4 + fbeBytesSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeBytesOffset <= 0) || ((_buffer.getOffset() + fbeBytesOffset + 4 + fbeBytesSize) > _buffer.getSize()))
            return;

        write(fbeOffset(), fbeBytesOffset);
        write(fbeBytesOffset, fbeBytesSize);
        write(fbeBytesOffset + 4, value.array());
    }
}
