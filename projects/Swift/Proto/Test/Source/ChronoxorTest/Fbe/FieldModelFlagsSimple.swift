//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import ChronoxorFbe

// Fast Binary Encoding FlagsSimple field model
public class FieldModelFlagsSimple: FieldModel {

    public var _buffer: Buffer = Buffer()
    public var _offset: Int = 0

    public var fbeSize: Int = 4

    public required init() {
        _buffer = Buffer()
        _offset = 0
    }

    // Get the value
    public func get(defaults: FlagsSimple = FlagsSimple()) -> FlagsSimple {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return defaults
        }

        return FlagsSimple(value: readInt32(offset: fbeOffset))
    }

    // Set the value
    public func set(value: FlagsSimple) throws {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return
        }

        write(offset: fbeOffset, value: value.raw)
    }
}
