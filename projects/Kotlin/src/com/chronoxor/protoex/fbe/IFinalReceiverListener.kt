//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.protoex.fbe

// Fast Binary Encoding com.chronoxor.protoex final receiver listener interface
interface IFinalReceiverListener : com.chronoxor.proto.fbe.IFinalReceiverListener
{
    fun onReceive(value: com.chronoxor.protoex.OrderMessage) {}
    fun onReceive(value: com.chronoxor.protoex.BalanceMessage) {}
    fun onReceive(value: com.chronoxor.protoex.AccountMessage) {}
}
