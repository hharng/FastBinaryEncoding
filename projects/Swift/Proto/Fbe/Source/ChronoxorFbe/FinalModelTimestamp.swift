//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation

// Fast Binary Encoding timestamp final model
public class FinalModelTimestamp: FinalModel {
    public var _buffer = Buffer()
    public var _offset: Int = 0

    public init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset
    }

    // Get the allocation size
    public func fbeAllocationSize(value: Date) -> Int {
        return fbeSize
    }

    // Field size
    public let fbeSize: Int = 8

    // Check if the value is valid
    public func verify() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Int.max
        }

        return fbeSize
    }

    // Get the value
    public func get(size: inout Size) -> Date {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return Date(timeIntervalSince1970: 0)
        }

        size.value = fbeSize
        let nanoseconds = TimeInterval(readInt64(offset: fbeOffset))
        return Date(timeIntervalSince1970: nanoseconds / 1_000_000_000)
    }

    // Set the value
    public func set(value: Date) throws -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        let milliseconds = value.timeIntervalSince1970 * 1000
        write(offset: fbeOffset, value: UInt64(milliseconds) * 1_000_000)
        return fbeSize
    }
}
