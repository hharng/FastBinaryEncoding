//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_json.h"

#include "enums.h"

namespace FBE {

namespace JSON {

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumByte>
{
    static bool to_json(TWriter& writer, const ::enums::EnumByte& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumByte>
{
    static bool from_json(const TJson& json, ::enums::EnumByte& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumByte)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumChar>
{
    static bool to_json(TWriter& writer, const ::enums::EnumChar& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumChar>
{
    static bool from_json(const TJson& json, ::enums::EnumChar& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumChar)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumWChar>
{
    static bool to_json(TWriter& writer, const ::enums::EnumWChar& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint32_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumWChar>
{
    static bool from_json(const TJson& json, ::enums::EnumWChar& value)
    {
        uint32_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumWChar)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumInt8>
{
    static bool to_json(TWriter& writer, const ::enums::EnumInt8& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (int8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumInt8>
{
    static bool from_json(const TJson& json, ::enums::EnumInt8& value)
    {
        int8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumInt8)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumUInt8>
{
    static bool to_json(TWriter& writer, const ::enums::EnumUInt8& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint8_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumUInt8>
{
    static bool from_json(const TJson& json, ::enums::EnumUInt8& value)
    {
        uint8_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumUInt8)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumInt16>
{
    static bool to_json(TWriter& writer, const ::enums::EnumInt16& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (int16_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumInt16>
{
    static bool from_json(const TJson& json, ::enums::EnumInt16& value)
    {
        int16_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumInt16)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumUInt16>
{
    static bool to_json(TWriter& writer, const ::enums::EnumUInt16& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint16_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumUInt16>
{
    static bool from_json(const TJson& json, ::enums::EnumUInt16& value)
    {
        uint16_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumUInt16)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumInt32>
{
    static bool to_json(TWriter& writer, const ::enums::EnumInt32& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (int32_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumInt32>
{
    static bool from_json(const TJson& json, ::enums::EnumInt32& value)
    {
        int32_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumInt32)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumUInt32>
{
    static bool to_json(TWriter& writer, const ::enums::EnumUInt32& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint32_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumUInt32>
{
    static bool from_json(const TJson& json, ::enums::EnumUInt32& value)
    {
        uint32_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumUInt32)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumInt64>
{
    static bool to_json(TWriter& writer, const ::enums::EnumInt64& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (int64_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumInt64>
{
    static bool from_json(const TJson& json, ::enums::EnumInt64& value)
    {
        int64_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumInt64)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::EnumUInt64>
{
    static bool to_json(TWriter& writer, const ::enums::EnumUInt64& value, bool scope = true)
    {
        return FBE::JSON::to_json(writer, (uint64_t)value);
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::EnumUInt64>
{
    static bool from_json(const TJson& json, ::enums::EnumUInt64& value)
    {
        uint64_t raw;
        if (!FBE::JSON::from_json(json, raw))
            return false;

        value = (::enums::EnumUInt64)raw;
        return true;
    }
};

template <class TWriter>
struct ValueWriter<TWriter, ::enums::Enums>
{
    static bool to_json(TWriter& writer, const ::enums::Enums& value, bool scope = true)
    {
        if (scope)
            if (!writer.StartObject())
                return false;
        if (!FBE::JSON::to_json_key(writer, "byte0") || !FBE::JSON::to_json(writer, value.byte0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "byte1") || !FBE::JSON::to_json(writer, value.byte1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "byte2") || !FBE::JSON::to_json(writer, value.byte2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "byte3") || !FBE::JSON::to_json(writer, value.byte3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "byte4") || !FBE::JSON::to_json(writer, value.byte4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "byte5") || !FBE::JSON::to_json(writer, value.byte5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "char0") || !FBE::JSON::to_json(writer, value.char0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "char1") || !FBE::JSON::to_json(writer, value.char1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "char2") || !FBE::JSON::to_json(writer, value.char2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "char3") || !FBE::JSON::to_json(writer, value.char3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "char4") || !FBE::JSON::to_json(writer, value.char4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "char5") || !FBE::JSON::to_json(writer, value.char5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wchar0") || !FBE::JSON::to_json(writer, value.wchar0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wchar1") || !FBE::JSON::to_json(writer, value.wchar1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wchar2") || !FBE::JSON::to_json(writer, value.wchar2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wchar3") || !FBE::JSON::to_json(writer, value.wchar3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wchar4") || !FBE::JSON::to_json(writer, value.wchar4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "wchar5") || !FBE::JSON::to_json(writer, value.wchar5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int8b0") || !FBE::JSON::to_json(writer, value.int8b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int8b1") || !FBE::JSON::to_json(writer, value.int8b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int8b2") || !FBE::JSON::to_json(writer, value.int8b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int8b3") || !FBE::JSON::to_json(writer, value.int8b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int8b4") || !FBE::JSON::to_json(writer, value.int8b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int8b5") || !FBE::JSON::to_json(writer, value.int8b5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint8b0") || !FBE::JSON::to_json(writer, value.uint8b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint8b1") || !FBE::JSON::to_json(writer, value.uint8b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint8b2") || !FBE::JSON::to_json(writer, value.uint8b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint8b3") || !FBE::JSON::to_json(writer, value.uint8b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint8b4") || !FBE::JSON::to_json(writer, value.uint8b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint8b5") || !FBE::JSON::to_json(writer, value.uint8b5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int16b0") || !FBE::JSON::to_json(writer, value.int16b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int16b1") || !FBE::JSON::to_json(writer, value.int16b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int16b2") || !FBE::JSON::to_json(writer, value.int16b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int16b3") || !FBE::JSON::to_json(writer, value.int16b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int16b4") || !FBE::JSON::to_json(writer, value.int16b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int16b5") || !FBE::JSON::to_json(writer, value.int16b5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint16b0") || !FBE::JSON::to_json(writer, value.uint16b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint16b1") || !FBE::JSON::to_json(writer, value.uint16b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint16b2") || !FBE::JSON::to_json(writer, value.uint16b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint16b3") || !FBE::JSON::to_json(writer, value.uint16b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint16b4") || !FBE::JSON::to_json(writer, value.uint16b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint16b5") || !FBE::JSON::to_json(writer, value.uint16b5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int32b0") || !FBE::JSON::to_json(writer, value.int32b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int32b1") || !FBE::JSON::to_json(writer, value.int32b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int32b2") || !FBE::JSON::to_json(writer, value.int32b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int32b3") || !FBE::JSON::to_json(writer, value.int32b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int32b4") || !FBE::JSON::to_json(writer, value.int32b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int32b5") || !FBE::JSON::to_json(writer, value.int32b5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint32b0") || !FBE::JSON::to_json(writer, value.uint32b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint32b1") || !FBE::JSON::to_json(writer, value.uint32b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint32b2") || !FBE::JSON::to_json(writer, value.uint32b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint32b3") || !FBE::JSON::to_json(writer, value.uint32b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint32b4") || !FBE::JSON::to_json(writer, value.uint32b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint32b5") || !FBE::JSON::to_json(writer, value.uint32b5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int64b0") || !FBE::JSON::to_json(writer, value.int64b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int64b1") || !FBE::JSON::to_json(writer, value.int64b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int64b2") || !FBE::JSON::to_json(writer, value.int64b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int64b3") || !FBE::JSON::to_json(writer, value.int64b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int64b4") || !FBE::JSON::to_json(writer, value.int64b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "int64b5") || !FBE::JSON::to_json(writer, value.int64b5, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint64b0") || !FBE::JSON::to_json(writer, value.uint64b0, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint64b1") || !FBE::JSON::to_json(writer, value.uint64b1, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint64b2") || !FBE::JSON::to_json(writer, value.uint64b2, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint64b3") || !FBE::JSON::to_json(writer, value.uint64b3, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint64b4") || !FBE::JSON::to_json(writer, value.uint64b4, true))
            return false;
        if (!FBE::JSON::to_json_key(writer, "uint64b5") || !FBE::JSON::to_json(writer, value.uint64b5, true))
            return false;
        if (scope)
            if (!writer.EndObject())
                return false;
        return true;
    }
};

template <class TJson>
struct ValueReader<TJson, ::enums::Enums>
{
    static bool from_json(const TJson& json, ::enums::Enums& value, const char* key = nullptr)
    {
        if (key != nullptr)
            return FBE::JSON::from_json_child(json, value, key);
        bool result = true;
        result &= FBE::JSON::from_json(json, value.byte0, "byte0");
        result &= FBE::JSON::from_json(json, value.byte1, "byte1");
        result &= FBE::JSON::from_json(json, value.byte2, "byte2");
        result &= FBE::JSON::from_json(json, value.byte3, "byte3");
        result &= FBE::JSON::from_json(json, value.byte4, "byte4");
        result &= FBE::JSON::from_json(json, value.byte5, "byte5");
        result &= FBE::JSON::from_json(json, value.char0, "char0");
        result &= FBE::JSON::from_json(json, value.char1, "char1");
        result &= FBE::JSON::from_json(json, value.char2, "char2");
        result &= FBE::JSON::from_json(json, value.char3, "char3");
        result &= FBE::JSON::from_json(json, value.char4, "char4");
        result &= FBE::JSON::from_json(json, value.char5, "char5");
        result &= FBE::JSON::from_json(json, value.wchar0, "wchar0");
        result &= FBE::JSON::from_json(json, value.wchar1, "wchar1");
        result &= FBE::JSON::from_json(json, value.wchar2, "wchar2");
        result &= FBE::JSON::from_json(json, value.wchar3, "wchar3");
        result &= FBE::JSON::from_json(json, value.wchar4, "wchar4");
        result &= FBE::JSON::from_json(json, value.wchar5, "wchar5");
        result &= FBE::JSON::from_json(json, value.int8b0, "int8b0");
        result &= FBE::JSON::from_json(json, value.int8b1, "int8b1");
        result &= FBE::JSON::from_json(json, value.int8b2, "int8b2");
        result &= FBE::JSON::from_json(json, value.int8b3, "int8b3");
        result &= FBE::JSON::from_json(json, value.int8b4, "int8b4");
        result &= FBE::JSON::from_json(json, value.int8b5, "int8b5");
        result &= FBE::JSON::from_json(json, value.uint8b0, "uint8b0");
        result &= FBE::JSON::from_json(json, value.uint8b1, "uint8b1");
        result &= FBE::JSON::from_json(json, value.uint8b2, "uint8b2");
        result &= FBE::JSON::from_json(json, value.uint8b3, "uint8b3");
        result &= FBE::JSON::from_json(json, value.uint8b4, "uint8b4");
        result &= FBE::JSON::from_json(json, value.uint8b5, "uint8b5");
        result &= FBE::JSON::from_json(json, value.int16b0, "int16b0");
        result &= FBE::JSON::from_json(json, value.int16b1, "int16b1");
        result &= FBE::JSON::from_json(json, value.int16b2, "int16b2");
        result &= FBE::JSON::from_json(json, value.int16b3, "int16b3");
        result &= FBE::JSON::from_json(json, value.int16b4, "int16b4");
        result &= FBE::JSON::from_json(json, value.int16b5, "int16b5");
        result &= FBE::JSON::from_json(json, value.uint16b0, "uint16b0");
        result &= FBE::JSON::from_json(json, value.uint16b1, "uint16b1");
        result &= FBE::JSON::from_json(json, value.uint16b2, "uint16b2");
        result &= FBE::JSON::from_json(json, value.uint16b3, "uint16b3");
        result &= FBE::JSON::from_json(json, value.uint16b4, "uint16b4");
        result &= FBE::JSON::from_json(json, value.uint16b5, "uint16b5");
        result &= FBE::JSON::from_json(json, value.int32b0, "int32b0");
        result &= FBE::JSON::from_json(json, value.int32b1, "int32b1");
        result &= FBE::JSON::from_json(json, value.int32b2, "int32b2");
        result &= FBE::JSON::from_json(json, value.int32b3, "int32b3");
        result &= FBE::JSON::from_json(json, value.int32b4, "int32b4");
        result &= FBE::JSON::from_json(json, value.int32b5, "int32b5");
        result &= FBE::JSON::from_json(json, value.uint32b0, "uint32b0");
        result &= FBE::JSON::from_json(json, value.uint32b1, "uint32b1");
        result &= FBE::JSON::from_json(json, value.uint32b2, "uint32b2");
        result &= FBE::JSON::from_json(json, value.uint32b3, "uint32b3");
        result &= FBE::JSON::from_json(json, value.uint32b4, "uint32b4");
        result &= FBE::JSON::from_json(json, value.uint32b5, "uint32b5");
        result &= FBE::JSON::from_json(json, value.int64b0, "int64b0");
        result &= FBE::JSON::from_json(json, value.int64b1, "int64b1");
        result &= FBE::JSON::from_json(json, value.int64b2, "int64b2");
        result &= FBE::JSON::from_json(json, value.int64b3, "int64b3");
        result &= FBE::JSON::from_json(json, value.int64b4, "int64b4");
        result &= FBE::JSON::from_json(json, value.int64b5, "int64b5");
        result &= FBE::JSON::from_json(json, value.uint64b0, "uint64b0");
        result &= FBE::JSON::from_json(json, value.uint64b1, "uint64b1");
        result &= FBE::JSON::from_json(json, value.uint64b2, "uint64b2");
        result &= FBE::JSON::from_json(json, value.uint64b3, "uint64b3");
        result &= FBE::JSON::from_json(json, value.uint64b4, "uint64b4");
        result &= FBE::JSON::from_json(json, value.uint64b5, "uint64b5");
        return result;
    }
};

} // namespace JSON

} // namespace FBE
