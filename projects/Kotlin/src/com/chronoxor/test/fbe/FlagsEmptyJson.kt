//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.test.fbe

class FlagsEmptyJson : com.google.gson.JsonSerializer<com.chronoxor.test.FlagsEmpty>, com.google.gson.JsonDeserializer<com.chronoxor.test.FlagsEmpty>
{

    @Override
    override fun serialize(src: com.chronoxor.test.FlagsEmpty, typeOfSrc: java.lang.reflect.Type, context: com.google.gson.JsonSerializationContext): com.google.gson.JsonElement
    {
        return com.google.gson.JsonPrimitive(src.raw)
    }

    @Throws(com.google.gson.JsonParseException::class)
    override fun deserialize(json: com.google.gson.JsonElement, type: java.lang.reflect.Type, context: com.google.gson.JsonDeserializationContext):com.chronoxor.test.FlagsEmpty
    {
        return com.chronoxor.test.FlagsEmpty(json.asJsonPrimitive.asInt)
    }
}
