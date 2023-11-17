//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding EnumInt16 field model
public class FieldModelEnumInt16: FieldModel {

    public var _buffer: Buffer = Buffer()
    public var _offset: Int = 0

    public var fbeSize: Int = 2

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    // Get the value
    public func get(defaults: EnumInt16 = EnumInt16()) -> EnumInt16 {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return defaults
        }

        return EnumInt16(value: readInt16(offset: fbeOffset))
    }

    // Set the value
    public func set(value: EnumInt16) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        write(offset: fbeOffset, value: value.raw)
    }
}
