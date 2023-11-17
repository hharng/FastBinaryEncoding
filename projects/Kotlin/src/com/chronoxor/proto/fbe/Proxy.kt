//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

// Fast Binary Encoding com.chronoxor.proto proxy
@Suppress("MemberVisibilityCanBePrivate", "PrivatePropertyName", "UNUSED_PARAMETER")
open class Proxy : com.chronoxor.fbe.Receiver, IProxyListener
{
    // Proxy models accessors
    private val OrderMessageModel: OrderMessageModel
    private val BalanceMessageModel: BalanceMessageModel
    private val AccountMessageModel: AccountMessageModel

    constructor() : super(false)
    {
        OrderMessageModel = OrderMessageModel()
        BalanceMessageModel = BalanceMessageModel()
        AccountMessageModel = AccountMessageModel()
    }

    constructor(buffer: com.chronoxor.fbe.Buffer) : super(buffer, false)
    {
        OrderMessageModel = OrderMessageModel()
        BalanceMessageModel = BalanceMessageModel()
        AccountMessageModel = AccountMessageModel()
    }

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IProxyListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            com.chronoxor.proto.fbe.OrderMessageModel.fbeTypeConst ->
            {
                // Attach the FBE stream to the proxy model
                OrderMessageModel.attach(buffer, offset)
                assert(OrderMessageModel.verify()) { "com.chronoxor.proto.OrderMessage validation failed!" }

                val fbeBegin = OrderMessageModel.model.getBegin()
                if (fbeBegin == 0L)
                    return false
                // Call proxy handler
                listener.onProxy(OrderMessageModel, type, buffer, offset, size)
                OrderMessageModel.model.getEnd(fbeBegin)
                return true
            }
            com.chronoxor.proto.fbe.BalanceMessageModel.fbeTypeConst ->
            {
                // Attach the FBE stream to the proxy model
                BalanceMessageModel.attach(buffer, offset)
                assert(BalanceMessageModel.verify()) { "com.chronoxor.proto.BalanceMessage validation failed!" }

                val fbeBegin = BalanceMessageModel.model.getBegin()
                if (fbeBegin == 0L)
                    return false
                // Call proxy handler
                listener.onProxy(BalanceMessageModel, type, buffer, offset, size)
                BalanceMessageModel.model.getEnd(fbeBegin)
                return true
            }
            com.chronoxor.proto.fbe.AccountMessageModel.fbeTypeConst ->
            {
                // Attach the FBE stream to the proxy model
                AccountMessageModel.attach(buffer, offset)
                assert(AccountMessageModel.verify()) { "com.chronoxor.proto.AccountMessage validation failed!" }

                val fbeBegin = AccountMessageModel.model.getBegin()
                if (fbeBegin == 0L)
                    return false
                // Call proxy handler
                listener.onProxy(AccountMessageModel, type, buffer, offset, size)
                AccountMessageModel.model.getEnd(fbeBegin)
                return true
            }
        }

        return false
    }
}
