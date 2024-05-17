/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.DirectBuffer;

@SuppressWarnings("all")
public final class GroupSizeEncodingDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final int ENCODED_LENGTH = 8;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public GroupSizeEncodingDecoder wrap(final DirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public DirectBuffer buffer()
    {
        return buffer;
    }

    public int offset()
    {
        return offset;
    }

    public int encodedLength()
    {
        return ENCODED_LENGTH;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public static int blockLengthEncodingOffset()
    {
        return 0;
    }

    public static int blockLengthEncodingLength()
    {
        return 2;
    }

    public static int blockLengthSinceVersion()
    {
        return 0;
    }

    public static int blockLengthNullValue()
    {
        return 65535;
    }

    public static int blockLengthMinValue()
    {
        return 0;
    }

    public static int blockLengthMaxValue()
    {
        return 65534;
    }

    public int blockLength()
    {
        return (buffer.getShort(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    public static int numInGroupEncodingOffset()
    {
        return 2;
    }

    public static int numInGroupEncodingLength()
    {
        return 2;
    }

    public static int numInGroupSinceVersion()
    {
        return 0;
    }

    public static int numInGroupNullValue()
    {
        return 65535;
    }

    public static int numInGroupMinValue()
    {
        return 0;
    }

    public static int numInGroupMaxValue()
    {
        return 65534;
    }

    public int numInGroup()
    {
        return (buffer.getShort(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    public static int numGroupsEncodingOffset()
    {
        return 4;
    }

    public static int numGroupsEncodingLength()
    {
        return 2;
    }

    public static int numGroupsSinceVersion()
    {
        return 0;
    }

    public static int numGroupsNullValue()
    {
        return 65535;
    }

    public static int numGroupsMinValue()
    {
        return 0;
    }

    public static int numGroupsMaxValue()
    {
        return 65534;
    }

    public int numGroups()
    {
        return (buffer.getShort(offset + 4, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    public static int numVarDataFieldsEncodingOffset()
    {
        return 6;
    }

    public static int numVarDataFieldsEncodingLength()
    {
        return 2;
    }

    public static int numVarDataFieldsSinceVersion()
    {
        return 0;
    }

    public static int numVarDataFieldsNullValue()
    {
        return 65535;
    }

    public static int numVarDataFieldsMinValue()
    {
        return 0;
    }

    public static int numVarDataFieldsMaxValue()
    {
        return 65534;
    }

    public int numVarDataFields()
    {
        return (buffer.getShort(offset + 6, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        builder.append('(');
        builder.append("blockLength=");
        builder.append(this.blockLength());
        builder.append('|');
        builder.append("numInGroup=");
        builder.append(this.numInGroup());
        builder.append('|');
        builder.append("numGroups=");
        builder.append(this.numGroups());
        builder.append('|');
        builder.append("numVarDataFields=");
        builder.append(this.numVarDataFields());
        builder.append(')');

        return builder;
    }
}
