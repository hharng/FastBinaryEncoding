//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package test

import "errors"
import "../fbe"
import "../proto"

// Workaround for Go unused imports issue
var _ = errors.New
var _ = fbe.Version
var _ = proto.Version

// EnumEmpty enum key
type EnumEmptyKey int32

// Convert EnumEmpty enum key to string
func (k EnumEmptyKey) String() string {
    return EnumEmpty(k).String()
}

// EnumEmpty enum
type EnumEmpty int32

// EnumEmpty enum values
//noinspection GoSnakeCaseUsage
const (
)

// Create a new EnumEmpty enum
func NewEnumEmpty() *EnumEmpty {
    return new(EnumEmpty)
}

// Create a new EnumEmpty enum from the given value
func NewEnumEmptyFromValue(value int32) *EnumEmpty {
    result := EnumEmpty(value)
    return &result
}

// Get the enum key
func (e EnumEmpty) Key() EnumEmptyKey {
    return EnumEmptyKey(e)
}

// Convert enum to optional
func (e *EnumEmpty) Optional() *EnumEmpty {
    return e
}

// Convert enum to string
func (e EnumEmpty) String() string {
    return "<empty>"
}

// Convert enum to JSON
func (e EnumEmpty) MarshalJSON() ([]byte, error) {
    value := int32(e)
    return fbe.Json.Marshal(&value)
}

// Convert JSON to enum
func (e *EnumEmpty) UnmarshalJSON(buffer []byte) error {
    var result int32
    err := fbe.Json.Unmarshal(buffer, &result)
    if err != nil {
        return err
    }
    *e = EnumEmpty(result)
    return nil
}
