//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding String->UInt8 map final model
class FinalModelMapStringUInt8: FinalModel {
    var _buffer: Buffer = Buffer()
    var _offset: Int = 0

    private var _modelKey: ChronoxorFbe.FinalModelString
    private var _modelValue: ChronoxorFbe.FinalModelUInt8

    init(buffer: Buffer, offset: Int) {
        _buffer = buffer
        _offset = offset

        _modelKey = ChronoxorFbe.FinalModelString(buffer: buffer, offset: offset)
        _modelValue = ChronoxorFbe.FinalModelUInt8(buffer: buffer, offset: offset)
    }

    // Get the allocation size
    func fbeAllocationSize(value values: Dictionary<String, UInt8>) -> Int {
        var size: Int = 4
        for (key, value) in values {
            size += _modelKey.fbeAllocationSize(value: key)
            size += _modelValue.fbeAllocationSize(value: value)
        }

        return size
    }

    // Check if the vector is valid
    public func verify() -> Int {
        if _buffer.offset + fbeOffset + 4 > _buffer.size {
            return Int.max
        }

        let fbeMapSize = Int(readUInt32(offset: fbeOffset))

        var size: Int = 4
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        var i = fbeMapSize
        while i > 0 {
            let offsetKey = _modelKey.verify()
            if offsetKey == Int.max { return Int.max }
            _modelKey.fbeShift(size: offsetKey)
            _modelValue.fbeShift(size: offsetKey)
            size += offsetKey
            let offsetValue = _modelValue.verify()
            if offsetValue == Int.max { return Int.max }
            _modelKey.fbeShift(size: offsetValue)
            _modelValue.fbeShift(size: offsetValue)
            size += offsetValue
            i -= 1
        }
        return size
    }

    public func get(values: inout Dictionary<String, UInt8>) -> Int {
        values.removeAll()

        if _buffer.offset + fbeOffset + 4 > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeMapSize = Int(readUInt32(offset: fbeOffset))
        if fbeMapSize == 0 {
            return 4
        }

        var size: Int = 4
        var offset = Size()
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        for _ in 1...fbeMapSize {
            offset.value = 0
            let key = _modelKey.get(size: &offset)
            _modelKey.fbeShift(size: offset.value)
            _modelValue.fbeShift(size: offset.value)
            size += offset.value
            offset.value = 0
            let value = _modelValue.get(size: &offset)
            _modelKey.fbeShift(size: offset.value)
            _modelValue.fbeShift(size: offset.value)
            size += offset.value
            values[key] = value
        }
        return size
    }

    public func set(value values: Dictionary<String, UInt8>) throws -> Int {
        if _buffer.offset + fbeOffset + 4 > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: UInt32(values.count))

        var size: Int = 4
        _modelKey.fbeOffset = fbeOffset + 4
        _modelValue.fbeOffset = fbeOffset + 4
        for (key, value) in values {
            let offsetKey = try _modelKey.set(value: key)
            _modelKey.fbeShift(size: offsetKey)
            _modelValue.fbeShift(size: offsetKey)
            let offsetValue = try _modelValue.set(value: value)
            _modelKey.fbeShift(size: offsetValue)
            _modelValue.fbeShift(size: offsetValue)
            size += offsetKey + offsetValue
        }
        return size
    }
}
