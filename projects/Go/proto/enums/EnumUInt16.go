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

// EnumUInt16 enum key
type EnumUInt16Key uint16

// Convert EnumUInt16 enum key to string
func (k EnumUInt16Key) String() string {
    return EnumUInt16(k).String()
}

// EnumUInt16 enum
type EnumUInt16 uint16

// EnumUInt16 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumUInt16_ENUM_VALUE_0 = EnumUInt16(0 + 0)
    EnumUInt16_ENUM_VALUE_1 = EnumUInt16(0 + 0)
    EnumUInt16_ENUM_VALUE_2 = EnumUInt16(0 + 1)
    EnumUInt16_ENUM_VALUE_3 = EnumUInt16(65534 + 0)
    EnumUInt16_ENUM_VALUE_4 = EnumUInt16(65534 + 1)
    EnumUInt16_ENUM_VALUE_5 = EnumUInt16(EnumUInt16_ENUM_VALUE_3)
)

// Create a new EnumUInt16 enum
func NewEnumUInt16() *EnumUInt16 {
    return new(EnumUInt16)
}

// Create a new EnumUInt16 enum from the given value
func NewEnumUInt16FromValue(value uint16) *EnumUInt16 {
    result := EnumUInt16(value)
    return &result
}

// Get the enum key
func (e EnumUInt16) Key() EnumUInt16Key {
    return EnumUInt16Key(e)
}

// Convert enum to optional
func (e *EnumUInt16) Optional() *EnumUInt16 {
    return e
}

// Convert enum to string
func (e EnumUInt16) String() string {
    if e == EnumUInt16_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumUInt16_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumUInt16_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumUInt16_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumUInt16_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumUInt16_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumUInt16) MarshalJSON() ([]byte, error) {
    value := uint16(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumUInt16) UnmarshalJSON(buffer []byte) error {
    var result uint16
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumUInt16(result)
    return nil
}
