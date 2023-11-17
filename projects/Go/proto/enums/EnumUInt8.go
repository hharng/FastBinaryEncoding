//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version

// EnumUInt8 enum key
type EnumUInt8Key uint8

// Convert EnumUInt8 enum key to string
func (k EnumUInt8Key) String() string {
    return EnumUInt8(k).String()
}

// EnumUInt8 enum
type EnumUInt8 uint8

// EnumUInt8 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumUInt8_ENUM_VALUE_0 = EnumUInt8(0 + 0)
    EnumUInt8_ENUM_VALUE_1 = EnumUInt8(0 + 0)
    EnumUInt8_ENUM_VALUE_2 = EnumUInt8(0 + 1)
    EnumUInt8_ENUM_VALUE_3 = EnumUInt8(254 + 0)
    EnumUInt8_ENUM_VALUE_4 = EnumUInt8(254 + 1)
    EnumUInt8_ENUM_VALUE_5 = EnumUInt8(EnumUInt8_ENUM_VALUE_3)
)

// Create a new EnumUInt8 enum
func NewEnumUInt8() *EnumUInt8 {
    return new(EnumUInt8)
}

// Create a new EnumUInt8 enum from the given value
func NewEnumUInt8FromValue(value uint8) *EnumUInt8 {
    result := EnumUInt8(value)
    return &result
}

// Get the enum key
func (e EnumUInt8) Key() EnumUInt8Key {
    return EnumUInt8Key(e)
}

// Convert enum to optional
func (e *EnumUInt8) Optional() *EnumUInt8 {
    return e
}

// Convert enum to string
func (e EnumUInt8) String() string {
    if e == EnumUInt8_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumUInt8_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumUInt8_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumUInt8_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumUInt8_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumUInt8_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumUInt8) MarshalJSON() ([]byte, error) {
    value := uint8(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumUInt8) UnmarshalJSON(buffer []byte) error {
    var result uint8
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumUInt8(result)
    return nil
}
