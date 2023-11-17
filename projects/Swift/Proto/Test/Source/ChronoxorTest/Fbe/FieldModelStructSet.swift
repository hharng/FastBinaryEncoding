//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe
import ChronoxorProto

// Fast Binary Encoding StructSet field model
public class FieldModelStructSet: FieldModel {

    public var _buffer: Buffer
    public var _offset: Int

    let f1: FieldModelVectorUInt8
    let f2: FieldModelVectorEnumSimple
    let f3: FieldModelVectorFlagsSimple
    let f4: FieldModelVectorStructSimple

    // Field size
    public let fbeSize: Int = 4

    // Field body size
    public let fbeBody: Int

    // Set the struct value (end phase)
    public required init() {
        let buffer = Buffer()
        let offset = 0

        _buffer = buffer
        _offset = offset

        f1 = FieldModelVectorUInt8(buffer: buffer, offset: 4 + 4)
        f2 = FieldModelVectorEnumSimple(buffer: buffer, offset: f1.fbeOffset + f1.fbeSize)
        f3 = FieldModelVectorFlagsSimple(buffer: buffer, offset: f2.fbeOffset + f2.fbeSize)
        f4 = FieldModelVectorStructSimple(buffer: buffer, offset: f3.fbeOffset + f3.fbeSize)

        var fbeBody = (4 + 4)
            fbeBody += f1.fbeSize
            fbeBody += f2.fbeSize
            fbeBody += f3.fbeSize
            fbeBody += f4.fbeSize
        self.fbeBody = fbeBody
    }

    // 
    public required init(buffer: Buffer = Buffer(), offset: Int = 0) {
        _buffer = buffer
        _offset = offset

        f1 = FieldModelVectorUInt8(buffer: buffer, offset: 4 + 4)
        f2 = FieldModelVectorEnumSimple(buffer: buffer, offset: f1.fbeOffset + f1.fbeSize)
        f3 = FieldModelVectorFlagsSimple(buffer: buffer, offset: f2.fbeOffset + f2.fbeSize)
        f4 = FieldModelVectorStructSimple(buffer: buffer, offset: f3.fbeOffset + f3.fbeSize)

        var fbeBody = (4 + 4)
            fbeBody += f1.fbeSize
            fbeBody += f2.fbeSize
            fbeBody += f3.fbeSize
            fbeBody += f4.fbeSize
        self.fbeBody = fbeBody
    }

    // Field extra size
    public var fbeExtra: Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return 0
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4) > _buffer.size) {
            return 0
        }

        _buffer.shift(offset: fbeStructOffset)

        var fbeResult = fbeBody
            fbeResult += f1.fbeExtra
            fbeResult += f2.fbeExtra
            fbeResult += f3.fbeExtra
            fbeResult += f4.fbeExtra

        _buffer.unshift(offset: fbeStructOffset)

        return fbeResult
    }

    // Field type
    public var fbeType: Int = fbeTypeConst
    public static let fbeTypeConst: Int = 132

    // Check if the struct value is valid
    func verify(fbeVerifyType: Bool = true) -> Bool {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            return true
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size) {
            return false
        }

        let fbeStructSize = Int(readUInt32(offset: fbeStructOffset))
        if fbeStructSize < (4 + 4) {
            return false
        }

        let fbeStructType = Int(readUInt32(offset: fbeStructOffset + 4))
        if fbeVerifyType && (fbeStructType != fbeType) {
            return false
        }

        _buffer.shift(offset: fbeStructOffset)
        let fbeResult = verifyFields(fbeStructSize: fbeStructSize)
        _buffer.unshift(offset: fbeStructOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    public func verifyFields(fbeStructSize: Int) -> Bool {
        var fbeCurrentSize = 4 + 4

        if (fbeCurrentSize + f1.fbeSize) > fbeStructSize {
            return true
        }
        if !f1.verify() {
            return false
        }
        fbeCurrentSize += f1.fbeSize

        if (fbeCurrentSize + f2.fbeSize) > fbeStructSize {
            return true
        }
        if !f2.verify() {
            return false
        }
        fbeCurrentSize += f2.fbeSize

        if (fbeCurrentSize + f3.fbeSize) > fbeStructSize {
            return true
        }
        if !f3.verify() {
            return false
        }
        fbeCurrentSize += f3.fbeSize

        if (fbeCurrentSize + f4.fbeSize) > fbeStructSize {
            return true
        }
        if !f4.verify() {
            return false
        }
        fbeCurrentSize += f4.fbeSize

        return true
    }

    // Get the struct value (begin phase)
    func getBegin() -> Int {
        if _buffer.offset + fbeOffset + fbeSize > _buffer.size {
            return 0
        }

        let fbeStructOffset = Int(readUInt32(offset: fbeOffset))
        if (fbeStructOffset == 0) || ((_buffer.offset + fbeStructOffset + 4 + 4) > _buffer.size) {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeStructSize = Int(readUInt32(offset: fbeStructOffset))
        if fbeStructSize < 4 + 4 {
            assertionFailure("Model is broken!")
            return 0
        }

        _buffer.shift(offset: fbeStructOffset)
        return fbeStructOffset
    }

    // Get the struct value (end phase)
    func getEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
    }

    // Get the struct value
    public func get() -> StructSet {
        var fbeValue = StructSet()
        return get(fbeValue: &fbeValue)
    }

    public func get(fbeValue: inout StructSet) -> StructSet {
        let fbeBegin = getBegin()
        if fbeBegin == 0 {
            return fbeValue
        }

        let fbeStructSize = Int(readUInt32(offset: 0))
        getFields(fbeValue: &fbeValue, fbeStructSize: fbeStructSize)
        getEnd(fbeBegin: fbeBegin)
        return fbeValue
    }

    // Get the struct fields values
    public func getFields(fbeValue: inout StructSet, fbeStructSize: Int) {
        var fbeCurrentSize = 4 + 4

        if fbeCurrentSize + f1.fbeSize <= fbeStructSize {
            f1.get(values: &fbeValue.f1)
        } else {
            fbeValue.f1.removeAll()
        }
        fbeCurrentSize += f1.fbeSize

        if fbeCurrentSize + f2.fbeSize <= fbeStructSize {
            f2.get(values: &fbeValue.f2)
        } else {
            fbeValue.f2.removeAll()
        }
        fbeCurrentSize += f2.fbeSize

        if fbeCurrentSize + f3.fbeSize <= fbeStructSize {
            f3.get(values: &fbeValue.f3)
        } else {
            fbeValue.f3.removeAll()
        }
        fbeCurrentSize += f3.fbeSize

        if fbeCurrentSize + f4.fbeSize <= fbeStructSize {
            f4.get(values: &fbeValue.f4)
        } else {
            fbeValue.f4.removeAll()
        }
        fbeCurrentSize += f4.fbeSize
    }

    // Set the struct value (begin phase)
    func setBegin() throws -> Int {
        if (_buffer.offset + fbeOffset + fbeSize) > _buffer.size {
            assertionFailure("Model is broken!")
            return 0
        }

        let fbeStructSize = fbeBody
        let fbeStructOffset = try _buffer.allocate(size: fbeStructSize) - _buffer.offset
        if (fbeStructOffset <= 0) || ((_buffer.offset + fbeStructOffset + fbeStructSize) > _buffer.size) {
            assertionFailure("Model is broken!")
            return 0
        }

        write(offset: fbeOffset, value: UInt32(fbeStructOffset))
        write(offset: fbeStructOffset, value: UInt32(fbeStructSize))
        write(offset: fbeStructOffset + 4, value: UInt32(fbeType))

        _buffer.shift(offset: fbeStructOffset)
        return fbeStructOffset
    }

    // Set the struct value (end phase)
    public func setEnd(fbeBegin: Int) {
        _buffer.unshift(offset: fbeBegin)
    }

    // Set the struct value
    public func set(value fbeValue: StructSet) throws {
        let fbeBegin = try setBegin()
        if fbeBegin == 0 {
            return
        }

        try setFields(fbeValue: fbeValue)
        setEnd(fbeBegin: fbeBegin)
    }

    // Set the struct fields values
    public func setFields(fbeValue: StructSet) throws {
        try f1.set(value: fbeValue.f1)
        try f2.set(value: fbeValue.f2)
        try f3.set(value: fbeValue.f3)
        try f4.set(value: fbeValue.f4)
    }
}
