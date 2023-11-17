//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumUInt64 field model
type FieldModelEnumUInt64 struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int
}

// Create a new EnumUInt64 field model
func NewFieldModelEnumUInt64(buffer *fbe.Buffer, offset int) *FieldModelEnumUInt64 {
    return &FieldModelEnumUInt64{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelEnumUInt64) FBESize() int { return 8 }
// Get the field extra size
func (fm *FieldModelEnumUInt64) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelEnumUInt64) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelEnumUInt64) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelEnumUInt64) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelEnumUInt64) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelEnumUInt64) Verify() bool { return true }

// Get the value
func (fm *FieldModelEnumUInt64) Get() (*EnumUInt64, error) {
    var value EnumUInt64
    return &value, fm.GetValueDefault(&value, EnumUInt64(0))
}

// Get the value with provided default value
func (fm *FieldModelEnumUInt64) GetDefault(defaults EnumUInt64) (*EnumUInt64, error) {
    var value EnumUInt64
    err := fm.GetValueDefault(&value, defaults)
    return &value, err
}

// Get the value by the given pointer
func (fm *FieldModelEnumUInt64) GetValue(value *EnumUInt64) error {
    return fm.GetValueDefault(value, EnumUInt64(0))
}

// Get the value by the given pointer with provided default value
func (fm *FieldModelEnumUInt64) GetValueDefault(value *EnumUInt64, defaults EnumUInt64) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return nil
    }

    *value = EnumUInt64(fbe.ReadUInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return nil
}

// Set the value by the given pointer
func (fm *FieldModelEnumUInt64) Set(value *EnumUInt64) error {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FieldModelEnumUInt64) SetValue(value EnumUInt64) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbe.WriteUInt64(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), uint64(value))
    return nil
}
