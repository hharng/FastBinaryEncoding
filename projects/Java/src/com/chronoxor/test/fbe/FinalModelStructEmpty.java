//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding StructEmpty final model
public final class FinalModelStructEmpty extends com.chronoxor.fbe.FinalModel
{

    public FinalModelStructEmpty(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
    }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.test.StructEmpty fbeValue)
    {
        long fbeResult = 0
            ;
        return fbeResult;
    }

    // Get the final type
    public static final long fbeTypeConst = 143;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        return 0;
    }

    // Get the struct value
    public com.chronoxor.test.StructEmpty get(com.chronoxor.fbe.Size fbeSize) { return get(fbeSize, new com.chronoxor.test.StructEmpty()); }
    public com.chronoxor.test.StructEmpty get(com.chronoxor.fbe.Size fbeSize, com.chronoxor.test.StructEmpty fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(com.chronoxor.test.StructEmpty fbeValue)
    {
        return 0;
    }

    // Set the struct value
    public long set(com.chronoxor.test.StructEmpty fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(com.chronoxor.test.StructEmpty fbeValue)
    {
        return 0;
    }
}
