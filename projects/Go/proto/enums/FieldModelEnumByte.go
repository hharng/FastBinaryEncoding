//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumByte field model
type FieldModelEnumByte struct {
    // Field model buffer
    buffer *fbe.Buffer
    // Field model buffer offset
    offset int
}

// Create a new EnumByte field model
func NewFieldModelEnumByte(buffer *fbe.Buffer, offset int) *FieldModelEnumByte {
    return &FieldModelEnumByte{buffer: buffer, offset: offset}
}

// Get the field size
func (fm *FieldModelEnumByte) FBESize() int { return 1 }
// Get the field extra size
func (fm *FieldModelEnumByte) FBEExtra() int { return 0 }

// Get the field offset
func (fm *FieldModelEnumByte) FBEOffset() int { return fm.offset }
// Set the field offset
func (fm *FieldModelEnumByte) SetFBEOffset(value int) { fm.offset = value }

// Shift the current field offset
func (fm *FieldModelEnumByte) FBEShift(size int) { fm.offset += size }
// Unshift the current field offset
func (fm *FieldModelEnumByte) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FieldModelEnumByte) Verify() bool { return true }

// Get the value
func (fm *FieldModelEnumByte) Get() (*EnumByte, error) {
    var value EnumByte
    return &value, fm.GetValueDefault(&value, EnumByte(0))
}

// Get the value with provided default value
func (fm *FieldModelEnumByte) GetDefault(defaults EnumByte) (*EnumByte, error) {
    var value EnumByte
    err := fm.GetValueDefault(&value, defaults)
    return &value, err
}

// Get the value by the given pointer
func (fm *FieldModelEnumByte) GetValue(value *EnumByte) error {
    return fm.GetValueDefault(value, EnumByte(0))
}

// Get the value by the given pointer with provided default value
func (fm *FieldModelEnumByte) GetValueDefault(value *EnumByte, defaults EnumByte) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return nil
    }

    *value = EnumByte(fbe.ReadByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return nil
}

// Set the value by the given pointer
func (fm *FieldModelEnumByte) Set(value *EnumByte) error {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FieldModelEnumByte) SetValue(value EnumByte) error {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return errors.New("model is broken")
    }

    fbe.WriteByte(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), byte(value))
    return nil
}
