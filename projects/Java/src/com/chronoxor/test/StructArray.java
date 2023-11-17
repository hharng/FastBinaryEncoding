//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.3.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public class StructArray implements Comparable<Object>
{
    public byte[] f1 = new byte[2];
    public Byte[] f2 = new Byte[2];
    public java.nio.ByteBuffer[] f3 = new java.nio.ByteBuffer[2];
    public java.nio.ByteBuffer[] f4 = new java.nio.ByteBuffer[2];
    public EnumSimple[] f5 = new EnumSimple[2];
    public EnumSimple[] f6 = new EnumSimple[2];
    public FlagsSimple[] f7 = new FlagsSimple[2];
    public FlagsSimple[] f8 = new FlagsSimple[2];
    public StructSimple[] f9 = new StructSimple[2];
    public StructSimple[] f10 = new StructSimple[2];

    public static final long fbeTypeConst = 125;
    public long fbeType() { return fbeTypeConst; }

    public StructArray() {}

    public StructArray(byte[] f1, Byte[] f2, java.nio.ByteBuffer[] f3, java.nio.ByteBuffer[] f4, EnumSimple[] f5, EnumSimple[] f6, FlagsSimple[] f7, FlagsSimple[] f8, StructSimple[] f9, StructSimple[] f10)
    {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
        this.f6 = f6;
        this.f7 = f7;
        this.f8 = f8;
        this.f9 = f9;
        this.f10 = f10;
    }

    public StructArray(StructArray other)
    {
        this.f1 = other.f1;
        this.f2 = other.f2;
        this.f3 = other.f3;
        this.f4 = other.f4;
        this.f5 = other.f5;
        this.f6 = other.f6;
        this.f7 = other.f7;
        this.f8 = other.f8;
        this.f9 = other.f9;
        this.f10 = other.f10;
    }

    public StructArray clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.test.fbe.StructArrayModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.test.fbe.StructArrayModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!StructArray.class.isAssignableFrom(other.getClass()))
            return -1;

        final StructArray obj = (StructArray)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!StructArray.class.isAssignableFrom(other.getClass()))
            return false;

        final StructArray obj = (StructArray)other;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("StructArray(");
        if (f1 != null)
        {
            boolean first = true;
            sb.append("f1=[").append(f1.length).append("][");
            for (var item : f1)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append("f1=[0][]");
        if (f2 != null)
        {
            boolean first = true;
            sb.append(",f2=[").append(f2.length).append("][");
            for (var item : f2)
            {
                if (item != null) sb.append(first ? "" : ",").append(item); else sb.append(first ? "" : ",").append("null");
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f2=[0][]");
        if (f3 != null)
        {
            boolean first = true;
            sb.append(",f3=[").append(f3.length).append("][");
            for (var item : f3)
            {
                if (item != null) sb.append(first ? "" : ",").append("bytes[").append(item.array().length).append("]"); else sb.append(first ? "" : ",").append("null");
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f3=[0][]");
        if (f4 != null)
        {
            boolean first = true;
            sb.append(",f4=[").append(f4.length).append("][");
            for (var item : f4)
            {
                if (item != null) sb.append(first ? "" : ",").append("bytes[").append(item.array().length).append("]"); else sb.append(first ? "" : ",").append("null");
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f4=[0][]");
        if (f5 != null)
        {
            boolean first = true;
            sb.append(",f5=[").append(f5.length).append("][");
            for (var item : f5)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f5=[0][]");
        if (f6 != null)
        {
            boolean first = true;
            sb.append(",f6=[").append(f6.length).append("][");
            for (var item : f6)
            {
                if (item != null) sb.append(first ? "" : ",").append(item); else sb.append(first ? "" : ",").append("null");
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f6=[0][]");
        if (f7 != null)
        {
            boolean first = true;
            sb.append(",f7=[").append(f7.length).append("][");
            for (var item : f7)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f7=[0][]");
        if (f8 != null)
        {
            boolean first = true;
            sb.append(",f8=[").append(f8.length).append("][");
            for (var item : f8)
            {
                if (item != null) sb.append(first ? "" : ",").append(item); else sb.append(first ? "" : ",").append("null");
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f8=[0][]");
        if (f9 != null)
        {
            boolean first = true;
            sb.append(",f9=[").append(f9.length).append("][");
            for (var item : f9)
            {
                sb.append(first ? "" : ",").append(item);
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f9=[0][]");
        if (f10 != null)
        {
            boolean first = true;
            sb.append(",f10=[").append(f10.length).append("][");
            for (var item : f10)
            {
                if (item != null) sb.append(first ? "" : ",").append(item); else sb.append(first ? "" : ",").append("null");
                first = false;
            }
            sb.append("]");
        }
        else
            sb.append(",f10=[0][]");
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.test.fbe.Json.getEngine().toJson(this); }
    public static StructArray fromJson(String json) { return com.chronoxor.test.fbe.Json.getEngine().fromJson(json, StructArray.class); }
}
