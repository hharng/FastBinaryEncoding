//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding ChronoxorProtoex final receiver
open class FinalReceiver: ChronoxorFbe.ReceiverProtocol {
    // Imported receivers
    let ProtoReceiver: ChronoxorProto.FinalReceiver?

    // Receiver values accessors
    private var OrderMessageValue: ChronoxorProtoex.OrderMessage
    private var BalanceMessageValue: ChronoxorProtoex.BalanceMessage
    private var AccountMessageValue: ChronoxorProtoex.AccountMessage

    // Receiver models accessors
    private var OrderMessageModel: OrderMessageFinalModel
    private var BalanceMessageModel: BalanceMessageFinalModel
    private var AccountMessageModel: AccountMessageFinalModel

    public var buffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        ProtoReceiver = ChronoxorProto.FinalReceiver(buffer: buffer)
        OrderMessageValue = ChronoxorProtoex.OrderMessage()
        OrderMessageModel = ChronoxorProtoex.OrderMessageFinalModel()
        BalanceMessageValue = ChronoxorProtoex.BalanceMessage()
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageFinalModel()
        AccountMessageValue = ChronoxorProtoex.AccountMessage()
        AccountMessageModel = ChronoxorProtoex.AccountMessageFinalModel()
        build(final: true)
    }

    public init(buffer: ChronoxorFbe.Buffer) {
        ProtoReceiver = ChronoxorProto.FinalReceiver(buffer: buffer)
        OrderMessageValue = ChronoxorProtoex.OrderMessage()
        OrderMessageModel = ChronoxorProtoex.OrderMessageFinalModel()
        BalanceMessageValue = ChronoxorProtoex.BalanceMessage()
        BalanceMessageModel = ChronoxorProtoex.BalanceMessageFinalModel()
        AccountMessageValue = ChronoxorProtoex.AccountMessage()
        AccountMessageModel = ChronoxorProtoex.AccountMessageFinalModel()
        build(with: buffer, final: true)
    }

    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? FinalReceiverListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: FinalReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorProtoex.OrderMessageFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            OrderMessageModel.attach(buffer: buffer, offset: offset)
            assert(OrderMessageModel.verify(), "Protoex.OrderMessage validation failed!")
            let deserialized = OrderMessageModel.deserialize(value: &OrderMessageValue)
            assert(deserialized > 0, "Protoex.OrderMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = OrderMessageValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: OrderMessageValue)
            return true
        case ChronoxorProtoex.BalanceMessageFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            BalanceMessageModel.attach(buffer: buffer, offset: offset)
            assert(BalanceMessageModel.verify(), "Protoex.BalanceMessage validation failed!")
            let deserialized = BalanceMessageModel.deserialize(value: &BalanceMessageValue)
            assert(deserialized > 0, "Protoex.BalanceMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = BalanceMessageValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: BalanceMessageValue)
            return true
        case ChronoxorProtoex.AccountMessageFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            AccountMessageModel.attach(buffer: buffer, offset: offset)
            assert(AccountMessageModel.verify(), "Protoex.AccountMessage validation failed!")
            let deserialized = AccountMessageModel.deserialize(value: &AccountMessageValue)
            assert(deserialized > 0, "Protoex.AccountMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = AccountMessageValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: AccountMessageValue)
            return true
        default: break
        }

        if let ProtoReceiver = ProtoReceiver, ProtoReceiver.onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size) {
            return true
        }

        return false
    }
}
