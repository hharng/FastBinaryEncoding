//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation

public struct EnumChar: Comparable, Hashable, Codable {
    typealias RawValue = UInt8
    public static let ENUM_VALUE_0 = EnumChar(value: EnumCharEnum.ENUM_VALUE_0)
    public static let ENUM_VALUE_1 = EnumChar(value: EnumCharEnum.ENUM_VALUE_1)
    public static let ENUM_VALUE_2 = EnumChar(value: EnumCharEnum.ENUM_VALUE_2)
    public static let ENUM_VALUE_3 = EnumChar(value: EnumCharEnum.ENUM_VALUE_3)
    public static let ENUM_VALUE_4 = EnumChar(value: EnumCharEnum.ENUM_VALUE_4)
    public static let ENUM_VALUE_5 = EnumChar(value: EnumCharEnum.ENUM_VALUE_5)

    var value: EnumCharEnum?

    public var raw: UInt8 { return value!.rawValue }

    public init() { setDefault() }
    public init(value: UInt8) { setEnum(value: value) }
    public init(value: EnumCharEnum) { setEnum(value: value) }
    public init(value: EnumChar) { setEnum(value: value) }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        setEnum(value: try container.decode(RawValue.self))
    }
    public mutating func setDefault() { setEnum(value: NSNumber(value: 0).uint8Value) }

    public mutating func setEnum(value: UInt8) { self.value = EnumCharEnum.mapValue(value: value) }
    public mutating func setEnum(value: EnumCharEnum) { self.value = value }
    public mutating func setEnum(value: EnumChar) { self.value = value.value }

    public static func < (lhs: EnumChar, rhs: EnumChar) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue < rhsValue.rawValue
    }

    public static func == (lhs: EnumChar, rhs: EnumChar) -> Bool {
        guard let lhsValue = lhs.value, let rhsValue = rhs.value else {
            return false
            }
        return lhsValue.rawValue == rhsValue.rawValue
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(value?.rawValue ?? 0)
    }

    public var description: String {
        return value?.description ?? "<unknown>"
    }
    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        try container.encode(raw)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> EnumChar {
        return try JSONDecoder().decode(EnumChar.self, from: json.data(using: .utf8)!)
    }
}
