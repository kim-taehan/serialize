/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.MutableDirectBuffer;

@SuppressWarnings("all")
public final class GroupSizeEncodingEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final int ENCODED_LENGTH = 8;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public GroupSizeEncodingEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.offset = offset;

        return this;
    }

    public MutableDirectBuffer buffer()
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

    public GroupSizeEncodingEncoder blockLength(final int value)
    {
        buffer.putShort(offset + 0, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int numInGroupEncodingOffset()
    {
        return 2;
    }

    public static int numInGroupEncodingLength()
    {
        return 2;
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

    public GroupSizeEncodingEncoder numInGroup(final int value)
    {
        buffer.putShort(offset + 2, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int numGroupsEncodingOffset()
    {
        return 4;
    }

    public static int numGroupsEncodingLength()
    {
        return 2;
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

    public GroupSizeEncodingEncoder numGroups(final int value)
    {
        buffer.putShort(offset + 4, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int numVarDataFieldsEncodingOffset()
    {
        return 6;
    }

    public static int numVarDataFieldsEncodingLength()
    {
        return 2;
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

    public GroupSizeEncodingEncoder numVarDataFields(final int value)
    {
        buffer.putShort(offset + 6, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
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

        final GroupSizeEncodingDecoder decoder = new GroupSizeEncodingDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
