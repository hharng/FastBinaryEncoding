//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

class StateJson : com.google.gson.JsonSerializer<com.chronoxor.proto.State>, com.google.gson.JsonDeserializer<com.chronoxor.proto.State>
{

    @Override
    override fun serialize(src: com.chronoxor.proto.State, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext):com.chronoxor.proto.State
    {
        return com.chronoxor.proto.State(json.asJsonPrimitive.asByte)
    }
}
