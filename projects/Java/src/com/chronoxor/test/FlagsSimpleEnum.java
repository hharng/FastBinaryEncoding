//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.5.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public enum FlagsSimpleEnum
{
    FLAG_VALUE_0((int)0x0)
    , FLAG_VALUE_1((int)0x1)
    , FLAG_VALUE_2((int)0x2)
    , FLAG_VALUE_3((int)0x4)
    , FLAG_VALUE_4(FLAG_VALUE_3.getRaw())
    , FLAG_VALUE_5(FLAG_VALUE_1.getRaw()|FLAG_VALUE_3.getRaw())
    ;

    private int value;

    FlagsSimpleEnum(int value) { this.value = (int)value; }
    FlagsSimpleEnum(FlagsSimpleEnum value) { this.value = value.value; }

    public int getRaw() { return value; }

    public static FlagsSimpleEnum mapValue(int value) { return mapping.get(value); }

    public boolean hasFlags(int flags) { return (((value & flags) != 0) && ((value & flags) == flags)); }
    public boolean hasFlags(FlagsSimpleEnum flags) { return hasFlags(flags.value); }

    public java.util.EnumSet<FlagsSimpleEnum> getAllSet() { return java.util.EnumSet.allOf(FlagsSimpleEnum.class); }
    public java.util.EnumSet<FlagsSimpleEnum> getNoneSet() { return java.util.EnumSet.noneOf(FlagsSimpleEnum.class); }
    public java.util.EnumSet<FlagsSimpleEnum> getCurrentSet()
    {
        java.util.EnumSet<FlagsSimpleEnum> result = java.util.EnumSet.noneOf(FlagsSimpleEnum.class);
        if ((value & FLAG_VALUE_0.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_0);
        }
        if ((value & FLAG_VALUE_1.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_1);
        }
        if ((value & FLAG_VALUE_2.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_2);
        }
        if ((value & FLAG_VALUE_3.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_3);
        }
        if ((value & FLAG_VALUE_4.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_4);
        }
        if ((value & FLAG_VALUE_5.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_5);
        }
        return result;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        if (hasFlags(FLAG_VALUE_0))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_0");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_1))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_1");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_2))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_2");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_3))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_3");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_4))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_4");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_5))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_5");
            first = false;
        }
        return sb.toString();
    }

    private static final java.util.Map<Integer, FlagsSimpleEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : FlagsSimpleEnum.values())
            mapping.put(value.value, value);
    }
}
