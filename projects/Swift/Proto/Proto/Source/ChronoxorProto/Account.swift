//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

import Foundation
import ChronoxorFbe

public protocol AccountBase {
    var id: Int32 { get set }
    var name: String { get set }
    var state: State { get set }
    var wallet: Balance { get set }
    var asset: Balance? { get set }
    var orders: Array<Order> { get set }
}

public protocol AccountInheritance {
    var parent: Account { get set }
}

extension AccountInheritance {
    public var id: Int32 {
        get { return parent.id }
        set { parent.id = newValue }
    }
    public var name: String {
        get { return parent.name }
        set { parent.name = newValue }
    }
    public var state: State {
        get { return parent.state }
        set { parent.state = newValue }
    }
    public var wallet: Balance {
        get { return parent.wallet }
        set { parent.wallet = newValue }
    }
    public var asset: Balance? {
        get { return parent.asset }
        set { parent.asset = newValue }
    }
    public var orders: Array<Order> {
        get { return parent.orders }
        set { parent.orders = newValue }
    }
}

public struct Account: AccountBase, Comparable, Hashable, Codable {
    public var id: Int32 = 0
    public var name: String = ""
    public var state: State = State.fromSet(set: [State.initialized.value!, State.bad.value!])
    public var wallet: Balance = ChronoxorProto.Balance()
    public var asset: Balance? = nil
    public var orders: Array<Order> = Array()

    public init() { }
    public init(id: Int32, name: String, state: State, wallet: Balance, asset: Balance?, orders: Array<Order>) {

        self.id = id
        self.name = name
        self.state = state
        self.wallet = wallet
        self.asset = asset
        self.orders = orders
    }

    public init(other: Account) {
        self.id = other.id
        self.name = other.name
        self.state = other.state
        self.wallet = other.wallet
        self.asset = other.asset
        self.orders = other.orders
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)
        id = try container.decode(Int32.self, forKey: .id)
        name = try container.decode(String.self, forKey: .name)
        state = try container.decode(ChronoxorProto.State.self, forKey: .state)
        wallet = try container.decode(ChronoxorProto.Balance.self, forKey: .wallet)
        asset = try container.decode(ChronoxorProto.Balance?.self, forKey: .asset)
        orders = try container.decode(Array<ChronoxorProto.Order>.self, forKey: .orders)
    }

    public func clone() throws -> Account {
        // Serialize the struct to the FBE stream
        let writer = AccountModel()
        try _ = writer.serialize(value: self)

        // Deserialize the struct from the FBE stream
        let reader = AccountModel()
        reader.attach(buffer: writer.buffer)
        return reader.deserialize()
    }

    public static func < (lhs: Account, rhs: Account) -> Bool {
        if !(lhs.id < rhs.id) { return false }
        return true
    }

    public static func == (lhs: Account, rhs: Account) -> Bool {
        if !(lhs.id == rhs.id) { return false }
        return true
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(id)
    }

    public var description: String {
        var sb = String()
        sb.append("Account(")
        sb.append("id="); sb.append(id.description)
        sb.append(",name="); sb.append("\""); sb.append(name); sb.append("\"")
        sb.append(",state="); sb.append(state.description)
        sb.append(",wallet="); sb.append(wallet.description)
        sb.append(",asset=");  if let asset = asset { sb.append(asset.description) } else { sb.append("null") }
        if true {
            var first = true
            sb.append(",orders=["); sb.append("\(orders.count)"); sb.append("][")
            for item in orders {
                sb.append(first ? "" : ","); sb.append(item.description)
                first = false
            }
            sb.append("]")
        }
        sb.append(")")
        return sb
    }
    private enum CodingKeys: String, CodingKey {
        case id
        case name
        case state
        case wallet
        case asset
        case orders
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(name, forKey: .name)
        try container.encode(state, forKey: .state)
        try container.encode(wallet, forKey: .wallet)
        try container.encode(asset, forKey: .asset)
        try container.encode(orders, forKey: .orders)
    }

    public func toJson() throws -> String {
        return String(data: try JSONEncoder().encode(self), encoding: .utf8)!
    }

    public static func fromJson(_ json: String) throws -> Account {
        return try JSONDecoder().decode(Account.self, from: json.data(using: .utf8)!)
    }
}
