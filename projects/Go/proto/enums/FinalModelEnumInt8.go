//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package enums

import "errors"
import "../fbe"

// Fast Binary Encoding EnumInt8 final model
type FinalModelEnumInt8 struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new EnumInt8 final model
func NewFinalModelEnumInt8(buffer *fbe.Buffer, offset int) *FinalModelEnumInt8 {
    return &FinalModelEnumInt8{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelEnumInt8) FBEAllocationSize(value *EnumInt8) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelEnumInt8) FBESize() int { return 1 }

// Get the final offset
func (fm *FinalModelEnumInt8) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelEnumInt8) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelEnumInt8) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelEnumInt8) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelEnumInt8) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelEnumInt8) Get() (*EnumInt8, int, error) {
    var value EnumInt8
    size, err := fm.GetValueDefault(&value, EnumInt8(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelEnumInt8) GetDefault(defaults EnumInt8) (*EnumInt8, int, error) {
    var value EnumInt8
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelEnumInt8) GetValue(value *EnumInt8) (int, error) {
    return fm.GetValueDefault(value, EnumInt8(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelEnumInt8) GetValueDefault(value *EnumInt8, defaults EnumInt8) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = EnumInt8(fbe.ReadInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelEnumInt8) Set(value *EnumInt8) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelEnumInt8) SetValue(value EnumInt8) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteInt8(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), int8(value))
    return fm.FBESize(), nil
}
