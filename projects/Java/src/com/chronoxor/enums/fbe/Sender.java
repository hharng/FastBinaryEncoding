//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package com.chronoxor.enums.fbe;

// Fast Binary Encoding com.chronoxor.enums sender
public class Sender extends com.chronoxor.fbe.Sender
{
    // Sender models accessors

    public Sender()
    {
        super(false);
    }
    public Sender(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, false);
    }

    public long send(Object obj)
    {

        return 0;
    }


    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("com.chronoxor.enums.fbe.Sender.onSend() not implemented!"); }
}
