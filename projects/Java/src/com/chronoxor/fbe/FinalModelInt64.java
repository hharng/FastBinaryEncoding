//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding long final model
public final class FinalModelInt64 extends FinalModel
{
    public FinalModelInt64(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(long value) { return fbeSize(); }

    // Get the final size
    @Override
    public long fbeSize() { return 8; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return fbeSize();
    }

    // Get the value
    public long get(Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0l;

        size.value = fbeSize();
        return readInt64(fbeOffset());
    }

    // Set the value
    public long set(long value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        write(fbeOffset(), value);
        return fbeSize();
    }
}
