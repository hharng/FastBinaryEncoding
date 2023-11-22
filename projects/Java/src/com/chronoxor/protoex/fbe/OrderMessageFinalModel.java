//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding OrderMessage final model
public final class OrderMessageFinalModel extends com.chronoxor.fbe.Model
{
    private final FinalModelOrderMessage _model;

    public OrderMessageFinalModel() { _model = new FinalModelOrderMessage(getBuffer(), 8); }
    public OrderMessageFinalModel(com.chronoxor.fbe.Buffer buffer) { super(buffer); _model = new FinalModelOrderMessage(getBuffer(), 8); }

    // Get the model type
    public static final long fbeTypeConst = FinalModelOrderMessage.fbeTypeConst;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    public boolean verify()
    {
        if ((getBuffer().getOffset() + _model.fbeOffset()) > getBuffer().getSize())
            return false;

        int fbeStructSize = readInt32(_model.fbeOffset() - 8);
        int fbeStructType = readInt32(_model.fbeOffset() - 4);
        if ((fbeStructSize <= 0) || (fbeStructType != fbeType()))
            return false;

        return ((8 + _model.verify()) == fbeStructSize);
    }

    // Serialize the struct value
    public long serialize(com.chronoxor.protoex.OrderMessage value)
    {
        long fbeInitialSize = getBuffer().getSize();

        int fbeStructType = (int)fbeType();
        int fbeStructSize = (int)(8 + _model.fbeAllocationSize(value));
        int fbeStructOffset = (int)(getBuffer().allocate(fbeStructSize) - getBuffer().getOffset());
        assert ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + fbeStructOffset + fbeStructSize) > getBuffer().getSize())
            return 0;

        fbeStructSize = (int)(8 + _model.set(value));
        getBuffer().resize(fbeInitialSize + fbeStructSize);

        write(_model.fbeOffset() - 8, fbeStructSize);
        write(_model.fbeOffset() - 4, fbeStructType);

        return fbeStructSize;
    }

    // Deserialize the struct value
    public com.chronoxor.protoex.OrderMessage deserialize() { var value = new com.chronoxor.protoex.OrderMessage(); deserialize(value); return value; }
    public long deserialize(com.chronoxor.protoex.OrderMessage value)
    {
        assert ((getBuffer().getOffset() + _model.fbeOffset()) <= getBuffer().getSize()) : "Model is broken!";
        if ((getBuffer().getOffset() + _model.fbeOffset()) > getBuffer().getSize())
            return 0;

        long fbeStructSize = readInt32(_model.fbeOffset() - 8);
        long fbeStructType = readInt32(_model.fbeOffset() - 4);
        assert ((fbeStructSize > 0) && (fbeStructType == fbeType())) : "Model is broken!";
        if ((fbeStructSize <= 0) || (fbeStructType != fbeType()))
            return 8;

        var fbeSize = new com.chronoxor.fbe.Size();
        value = _model.get(fbeSize, value);
        return 8 + fbeSize.value;
    }

    // Move to the next struct value
    public void next(long prev)
    {
        _model.fbeShift(prev);
    }
}
