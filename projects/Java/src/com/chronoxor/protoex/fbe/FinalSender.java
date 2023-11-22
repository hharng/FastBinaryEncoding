//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding com.chronoxor.protoex final sender
public class FinalSender extends com.chronoxor.fbe.Sender
{
    // Imported senders
    public final com.chronoxor.proto.fbe.FinalSender protoSender;

    // Sender models accessors
    public final OrderMessageFinalModel OrderMessageModel;
    public final BalanceMessageFinalModel BalanceMessageModel;
    public final AccountMessageFinalModel AccountMessageModel;

    public FinalSender()
    {
        super(true);
        protoSender = new com.chronoxor.proto.fbe.FinalSender(getBuffer());
        OrderMessageModel = new OrderMessageFinalModel(getBuffer());
        BalanceMessageModel = new BalanceMessageFinalModel(getBuffer());
        AccountMessageModel = new AccountMessageFinalModel(getBuffer());
    }
    public FinalSender(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
        protoSender = new com.chronoxor.proto.fbe.FinalSender(getBuffer());
        OrderMessageModel = new OrderMessageFinalModel(getBuffer());
        BalanceMessageModel = new BalanceMessageFinalModel(getBuffer());
        AccountMessageModel = new AccountMessageFinalModel(getBuffer());
    }

    public long send(Object obj)
    {
        if (obj instanceof com.chronoxor.protoex.OrderMessage)
        {
            com.chronoxor.protoex.OrderMessage value = (com.chronoxor.protoex.OrderMessage)obj;
            if (value.fbeType() == OrderMessageModel.fbeType())
                return send(value);
        }
        if (obj instanceof com.chronoxor.protoex.BalanceMessage)
        {
            com.chronoxor.protoex.BalanceMessage value = (com.chronoxor.protoex.BalanceMessage)obj;
            if (value.fbeType() == BalanceMessageModel.fbeType())
                return send(value);
        }
        if (obj instanceof com.chronoxor.protoex.AccountMessage)
        {
            com.chronoxor.protoex.AccountMessage value = (com.chronoxor.protoex.AccountMessage)obj;
            if (value.fbeType() == AccountMessageModel.fbeType())
                return send(value);
        }

        // Try to send using imported senders
        long result = 0;
        result = protoSender.send(obj);
        if (result > 0)
            return result;

        return 0;
    }

    public long send(com.chronoxor.protoex.OrderMessage value)
    {
        // Serialize the value into the FBE stream
        long serialized = OrderMessageModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.protoex.OrderMessage serialization failed!";
        assert OrderMessageModel.verify() : "com.chronoxor.protoex.OrderMessage validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(com.chronoxor.protoex.BalanceMessage value)
    {
        // Serialize the value into the FBE stream
        long serialized = BalanceMessageModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.protoex.BalanceMessage serialization failed!";
        assert BalanceMessageModel.verify() : "com.chronoxor.protoex.BalanceMessage validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }
    public long send(com.chronoxor.protoex.AccountMessage value)
    {
        // Serialize the value into the FBE stream
        long serialized = AccountMessageModel.serialize(value);
        assert (serialized > 0) : "com.chronoxor.protoex.AccountMessage serialization failed!";
        assert AccountMessageModel.verify() : "com.chronoxor.protoex.AccountMessage validation failed!";

        // Log the value
        if (getLogging())
        {
            String message = value.toString();
            onSendLog(message);
        }

        // Send the serialized value
        return sendSerialized(serialized);
    }

    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("com.chronoxor.protoex.fbe.Sender.onSend() not implemented!"); }
}
