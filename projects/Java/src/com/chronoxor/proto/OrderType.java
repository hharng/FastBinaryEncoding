//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package com.chronoxor.proto;

public final class OrderType implements Comparable<OrderType>
{
    public static final OrderType market = new OrderType(OrderTypeEnum.market);
    public static final OrderType limit = new OrderType(OrderTypeEnum.limit);
    public static final OrderType stop = new OrderType(OrderTypeEnum.stop);

    private OrderTypeEnum value = OrderTypeEnum.values()[0];

    public OrderType() {}
    public OrderType(byte value) { setEnum(value); }
    public OrderType(OrderTypeEnum value) { setEnum(value); }
    public OrderType(OrderType value) { setEnum(value); }

    public OrderTypeEnum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = OrderTypeEnum.mapValue(value); }
    public void setEnum(OrderTypeEnum value) { this.value = value; }
    public void setEnum(OrderType value) { this.value = value.value; }

    @Override
    public int compareTo(OrderType other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!OrderType.class.isAssignableFrom(other.getClass()))
            return false;

        final OrderType enm = (OrderType)other;

        if ((value == null) || (enm.value == null))
            return false;
        if (value.getRaw() != enm.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
