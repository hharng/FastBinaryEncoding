//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding optional Int32 field model
public class FieldModelOptionalInt32: FieldModel {

    public var _buffer: Buffer
    public var _offset: Int

    // Field size
    public let fbeSize: Int = 1 + 4

    // Base field model value
    public let value: ChronoxorFbe.FieldModelInt32

    public var fbeExtra: Int {
        if !hasValue() {
            return 0
        }

        let fbeOptionalOffset = Int(readUInt32(offset: fbeOffset + 1))
        if (fbeOptionalOffset == 0) || ((_buffer.offset + fbeOptionalOffset + 4) > _buffer.size) {
            return 0
        }

        _buffer.shift(offset: fbeOptionalOffset)
        let fbeResult = value.fbeSize + value.fbeExtra
        _buffer.unshift(offset: fbeOptionalOffset)
        return fbeResult
    }

    public required init() {
        let buffer = Buffer()
        let offset = 0

        _buffer = buffer
        _offset = offset

        value = ChronoxorFbe.FieldModelInt32(buffer: buffer, offset: 0)
    }

    public required init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        value = ChronoxorFbe.FieldModelInt32(buffer: buffer, offset: 0)
    }

    public func hasValue() -> Bool {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return false
        }

        let fbeHasValue = Int32(readInt8(offset: fbeOffset))
        return fbeHasValue != 0
    }

    public func verify() -> Bool {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return true
        }

        let fbeHasValue = Int(readInt8(offset: fbeOffset))
        if fbeHasValue == 0 {
            return true
        }

        let fbeOptionalOffset = Int(readUInt32(offset: fbeOffset + 1))
        if fbeOptionalOffset == 0 {
            return false
        }

        _buffer.shift(offset: fbeOptionalOffset)
        let fbeResult = value.verify()
        _buffer.unshift(offset: fbeOptionalOffset)
        return fbeResult
    }

    // Get the optional value (being phase)
    func getBegin() -> Int {
        if !hasValue() {
            return 0
        }

        let fbeOptionalOffset = Int(readUInt32(offset: fbeOffset + 1))
        if fbeOptionalOffset <= 0 {
            assertionFailure("Model is broken!")
            return 0
        }

        _buffer.shift(offset: fbeOptionalOffset)
        return fbeOptionalOffset
    }

    // Get the optional value (end phase)
    func getEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
    }

    public func get(defaults: Int32? = nil) -> Int32? {
        let fbeBegin = getBegin()
        if fbeBegin == 0 {
            return defaults
        }

        let optional = value.get()
        getEnd(fbeBegin: fbeBegin)
        return optional
    }

    // Set the optional value (begin phase)
    func setBegin(hasValue: Bool) throws -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeHasValue = hasValue ? 1 : 0
        write(offset: fbeOffset, value: Int8(fbeHasValue))
        if fbeHasValue == 0 {
            return 0
        }

        let fbeOptionalSize = value.fbeSize
        let fbeOptionalOffset = try _buffer.allocate(size: fbeOptionalSize) - _buffer.offset
        if (fbeOptionalOffset <= 0) || ((_buffer.offset + fbeOptionalOffset + fbeOptionalSize) > _buffer.size) {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset + 1, value: UInt32(fbeOptionalOffset))

        _buffer.shift(offset: fbeOptionalOffset)
        return fbeOptionalOffset
    }

    // Set the optional value (end phase)
      func setEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
      }

      // Set the optional value
      public func set(value optional: Int32?) throws {
        let fbeBegin = try setBegin(hasValue: optional != nil)
        if fbeBegin == 0 {
            return
        }

        try value.set(value: optional!)
        setEnd(fbeBegin: fbeBegin)
    }
}
