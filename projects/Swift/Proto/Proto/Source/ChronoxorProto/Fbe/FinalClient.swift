//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe

// Fast Binary Encoding Proto final client
open class FinalClient: ChronoxorFbe.ClientProtocol {
    // Client sender models accessors
    let OrderMessageSenderModel: OrderMessageFinalModel
    let BalanceMessageSenderModel: BalanceMessageFinalModel
    let AccountMessageSenderModel: AccountMessageFinalModel

    // Client receiver values accessors
    private var OrderMessageReceiverValue: ChronoxorProto.OrderMessage
    private var BalanceMessageReceiverValue: ChronoxorProto.BalanceMessage
    private var AccountMessageReceiverValue: ChronoxorProto.AccountMessage

    // Client receiver models accessors
    private let OrderMessageReceiverModel: OrderMessageFinalModel
    private let BalanceMessageReceiverModel: BalanceMessageFinalModel
    private let AccountMessageReceiverModel: AccountMessageFinalModel

    public var sendBuffer: Buffer = Buffer()
    public var receiveBuffer: Buffer = Buffer()
    public var final: Bool = false

    public init() {
        OrderMessageSenderModel = OrderMessageFinalModel(buffer: sendBuffer)
        OrderMessageReceiverValue = ChronoxorProto.OrderMessage()
        OrderMessageReceiverModel = OrderMessageFinalModel()
        BalanceMessageSenderModel = BalanceMessageFinalModel(buffer: sendBuffer)
        BalanceMessageReceiverValue = ChronoxorProto.BalanceMessage()
        BalanceMessageReceiverModel = BalanceMessageFinalModel()
        AccountMessageSenderModel = AccountMessageFinalModel(buffer: sendBuffer)
        AccountMessageReceiverValue = ChronoxorProto.AccountMessage()
        AccountMessageReceiverModel = AccountMessageFinalModel()
        build(with: true)
    }

    public init(sendBuffer: ChronoxorFbe.Buffer, receiveBuffer: ChronoxorFbe.Buffer) {
        OrderMessageSenderModel = OrderMessageFinalModel(buffer: sendBuffer)
        OrderMessageReceiverValue = ChronoxorProto.OrderMessage()
        OrderMessageReceiverModel = OrderMessageFinalModel()
        BalanceMessageSenderModel = BalanceMessageFinalModel(buffer: sendBuffer)
        BalanceMessageReceiverValue = ChronoxorProto.BalanceMessage()
        BalanceMessageReceiverModel = BalanceMessageFinalModel()
        AccountMessageSenderModel = AccountMessageFinalModel(buffer: sendBuffer)
        AccountMessageReceiverValue = ChronoxorProto.AccountMessage()
        AccountMessageReceiverModel = AccountMessageFinalModel()
        build(with: sendBuffer, receiveBuffer: receiveBuffer, final: true)
    }

    public func send(obj: Any) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(obj: obj, listener: listener)
    }

    public func send(obj: Any, listener: ChronoxorFbe.SenderListener) throws -> Int {
        let objType = type(of: obj)
        if objType == ChronoxorProto.OrderMessage.self, let value = obj as? ChronoxorProto.OrderMessage { return try send(value: value, listener: listener) }
        if objType == ChronoxorProto.BalanceMessage.self, let value = obj as? ChronoxorProto.BalanceMessage { return try send(value: value, listener: listener) }
        if objType == ChronoxorProto.AccountMessage.self, let value = obj as? ChronoxorProto.AccountMessage { return try send(value: value, listener: listener) }

        return 0
    }

    public func send(value: ChronoxorProto.OrderMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProto.OrderMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try OrderMessageSenderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.OrderMessage serialization failed!")
        assert(OrderMessageSenderModel.verify(), "ChronoxorProto.OrderMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }

    public func send(value: ChronoxorProto.BalanceMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProto.BalanceMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try BalanceMessageSenderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.BalanceMessage serialization failed!")
        assert(BalanceMessageSenderModel.verify(), "ChronoxorProto.BalanceMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }

    public func send(value: ChronoxorProto.AccountMessage) throws -> Int {
        guard let listener = self as? ChronoxorFbe.SenderListener else { return 0 }
        return try send(value: value, listener: listener)
    }

    public func send(value: ChronoxorProto.AccountMessage, listener: ChronoxorFbe.SenderListener) throws -> Int {
        // Serialize the value into the FBE stream
        let serialized = try AccountMessageSenderModel.serialize(value: value)
        assert(serialized > 0, "ChronoxorProto.AccountMessage serialization failed!")
        assert(AccountMessageSenderModel.verify(), "ChronoxorProto.AccountMessage validation failed!")

        // Log the value
        if listener.logging {
            let message = value.description
            listener.onSendLog(message: message)
        }

        // Send the serialized value
        return try sendSerialized(listener: listener, serialized: serialized)
    }
    open func onReceive(type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        guard let listener = self as? FinalReceiverListener else { return false }
        return onReceiveListener(listener: listener, type: type, buffer: buffer, offset: offset, size: size)
    }

    open func onReceiveListener(listener: FinalReceiverListener, type: Int, buffer: Data, offset: Int, size: Int) -> Bool {
        switch type {
        case ChronoxorProto.OrderMessageFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            OrderMessageReceiverModel.attach(buffer: buffer, offset: offset)
            assert(OrderMessageReceiverModel.verify(), "Proto.OrderMessage validation failed!")
            let deserialized = OrderMessageReceiverModel.deserialize(value: &OrderMessageReceiverValue)
            assert(deserialized > 0, "Proto.OrderMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = OrderMessageReceiverValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: OrderMessageReceiverValue)
            return true
        case ChronoxorProto.BalanceMessageFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            BalanceMessageReceiverModel.attach(buffer: buffer, offset: offset)
            assert(BalanceMessageReceiverModel.verify(), "Proto.BalanceMessage validation failed!")
            let deserialized = BalanceMessageReceiverModel.deserialize(value: &BalanceMessageReceiverValue)
            assert(deserialized > 0, "Proto.BalanceMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = BalanceMessageReceiverValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: BalanceMessageReceiverValue)
            return true
        case ChronoxorProto.AccountMessageFinalModel.fbeTypeConst:
            // Deserialize the value from the FBE stream
            AccountMessageReceiverModel.attach(buffer: buffer, offset: offset)
            assert(AccountMessageReceiverModel.verify(), "Proto.AccountMessage validation failed!")
            let deserialized = AccountMessageReceiverModel.deserialize(value: &AccountMessageReceiverValue)
            assert(deserialized > 0, "Proto.AccountMessage deserialization failed!")

            // Log the value
            if listener.logging {
                let message = AccountMessageReceiverValue.description
                listener.onReceiveLog(message: message)
            }

            // Call receive handler with deserialized value
            listener.onReceive(value: AccountMessageReceiverValue)
            return true
        default: break
        }

        return false
    }
}
