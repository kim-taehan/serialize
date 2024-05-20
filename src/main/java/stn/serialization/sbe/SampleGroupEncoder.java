/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.MutableDirectBuffer;


/**
 * Sample with group
 */
@SuppressWarnings("all")
public final class SampleGroupEncoder
{
    public static final int BLOCK_LENGTH = 65;
    public static final int TEMPLATE_ID = 1;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final SampleGroupEncoder parentMessage = this;
    private MutableDirectBuffer buffer;
    private int initialOffset;
    private int offset;
    private int limit;

    public int sbeBlockLength()
    {
        return BLOCK_LENGTH;
    }

    public int sbeTemplateId()
    {
        return TEMPLATE_ID;
    }

    public int sbeSchemaId()
    {
        return SCHEMA_ID;
    }

    public int sbeSchemaVersion()
    {
        return SCHEMA_VERSION;
    }

    public String sbeSemanticType()
    {
        return "";
    }

    public MutableDirectBuffer buffer()
    {
        return buffer;
    }

    public int initialOffset()
    {
        return initialOffset;
    }

    public int offset()
    {
        return offset;
    }

    public SampleGroupEncoder wrap(final MutableDirectBuffer buffer, final int offset)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.initialOffset = offset;
        this.offset = offset;
        limit(offset + BLOCK_LENGTH);

        return this;
    }

    public SampleGroupEncoder wrapAndApplyHeader(
        final MutableDirectBuffer buffer, final int offset, final MessageHeaderEncoder headerEncoder)
    {
        headerEncoder
            .wrap(buffer, offset)
            .blockLength(BLOCK_LENGTH)
            .templateId(TEMPLATE_ID)
            .schemaId(SCHEMA_ID)
            .version(SCHEMA_VERSION);

        return wrap(buffer, offset + MessageHeaderEncoder.ENCODED_LENGTH);
    }

    public int encodedLength()
    {
        return limit - offset;
    }

    public int limit()
    {
        return limit;
    }

    public void limit(final int limit)
    {
        this.limit = limit;
    }

    public static int headerId()
    {
        return 2;
    }

    public static int headerSinceVersion()
    {
        return 0;
    }

    public static int headerEncodingOffset()
    {
        return 0;
    }

    public static int headerEncodingLength()
    {
        return 55;
    }

    public static String headerMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        header.wrap(buffer, offset + 0);
        return header;
    }

    public static int blockIdxId()
    {
        return 3;
    }

    public static int blockIdxSinceVersion()
    {
        return 0;
    }

    public static int blockIdxEncodingOffset()
    {
        return 55;
    }

    public static int blockIdxEncodingLength()
    {
        return 2;
    }

    public static String blockIdxMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static short blockIdxNullValue()
    {
        return (short)-32768;
    }

    public static short blockIdxMinValue()
    {
        return (short)-32767;
    }

    public static short blockIdxMaxValue()
    {
        return (short)32767;
    }

    public SampleGroupEncoder blockIdx(final short value)
    {
        buffer.putShort(offset + 55, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int progNumId()
    {
        return 4;
    }

    public static int progNumSinceVersion()
    {
        return 0;
    }

    public static int progNumEncodingOffset()
    {
        return 57;
    }

    public static int progNumEncodingLength()
    {
        return 2;
    }

    public static String progNumMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static short progNumNullValue()
    {
        return (short)-32768;
    }

    public static short progNumMinValue()
    {
        return (short)-32767;
    }

    public static short progNumMaxValue()
    {
        return (short)32767;
    }

    public SampleGroupEncoder progNum(final short value)
    {
        buffer.putShort(offset + 57, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int betModeId()
    {
        return 5;
    }

    public static int betModeSinceVersion()
    {
        return 0;
    }

    public static int betModeEncodingOffset()
    {
        return 59;
    }

    public static int betModeEncodingLength()
    {
        return 2;
    }

    public static String betModeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static byte betModeNullValue()
    {
        return (byte)0;
    }

    public static byte betModeMinValue()
    {
        return (byte)32;
    }

    public static byte betModeMaxValue()
    {
        return (byte)126;
    }

    public static int betModeLength()
    {
        return 2;
    }


    public SampleGroupEncoder betMode(final int index, final byte value)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 59 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public SampleGroupEncoder putBetMode(final byte value0, final byte value1)
    {
        buffer.putByte(offset + 59, value0);
        buffer.putByte(offset + 60, value1);

        return this;
    }

    public static String betModeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public SampleGroupEncoder putBetMode(final byte[] src, final int srcOffset)
    {
        final int length = 2;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 59, src, srcOffset, length);

        return this;
    }

    public SampleGroupEncoder betMode(final String src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 59, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 59 + start, (byte)0);
        }

        return this;
    }

    public SampleGroupEncoder betMode(final CharSequence src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 59, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 59 + start, (byte)0);
        }

        return this;
    }

    public static int poolStakeId()
    {
        return 6;
    }

    public static int poolStakeSinceVersion()
    {
        return 0;
    }

    public static int poolStakeEncodingOffset()
    {
        return 61;
    }

    public static int poolStakeEncodingLength()
    {
        return 2;
    }

    public static String poolStakeMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static short poolStakeNullValue()
    {
        return (short)-32768;
    }

    public static short poolStakeMinValue()
    {
        return (short)-32767;
    }

    public static short poolStakeMaxValue()
    {
        return (short)32767;
    }

    public SampleGroupEncoder poolStake(final short value)
    {
        buffer.putShort(offset + 61, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int matchCntId()
    {
        return 7;
    }

    public static int matchCntSinceVersion()
    {
        return 0;
    }

    public static int matchCntEncodingOffset()
    {
        return 63;
    }

    public static int matchCntEncodingLength()
    {
        return 2;
    }

    public static String matchCntMetaAttribute(final MetaAttribute metaAttribute)
    {
        if (MetaAttribute.PRESENCE == metaAttribute)
        {
            return "required";
        }

        return "";
    }

    public static short matchCntNullValue()
    {
        return (short)-32768;
    }

    public static short matchCntMinValue()
    {
        return (short)-32767;
    }

    public static short matchCntMaxValue()
    {
        return (short)32767;
    }

    public SampleGroupEncoder matchCnt(final short value)
    {
        buffer.putShort(offset + 63, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    private final GroupEncoder group = new GroupEncoder(this);

    public static long groupId()
    {
        return 10;
    }

    public GroupEncoder groupCount(final int count)
    {
        group.wrap(buffer, count);
        return group;
    }

    public static final class GroupEncoder
    {
        public static final int HEADER_SIZE = 4;
        private final SampleGroupEncoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        GroupEncoder(final SampleGroupEncoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final MutableDirectBuffer buffer, final int count)
        {
            if (count < 0 || count > 65534)
            {
                throw new IllegalArgumentException("count outside allowed range: count=" + count);
            }

            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            this.count = count;
            final int limit = parentMessage.limit();
            initialLimit = limit;
            parentMessage.limit(limit + HEADER_SIZE);
            buffer.putShort(limit + 0, (short)8, java.nio.ByteOrder.LITTLE_ENDIAN);
            buffer.putShort(limit + 2, (short)count, java.nio.ByteOrder.LITTLE_ENDIAN);
        }

        public GroupEncoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + sbeBlockLength());
            ++index;

            return this;
        }

        public int resetCountToIndex()
        {
            count = index;
            buffer.putShort(initialLimit + 2, (short)count, java.nio.ByteOrder.LITTLE_ENDIAN);

            return count;
        }

        public static int countMinValue()
        {
            return 0;
        }

        public static int countMaxValue()
        {
            return 65534;
        }

        public static int sbeHeaderSize()
        {
            return HEADER_SIZE;
        }

        public static int sbeBlockLength()
        {
            return 8;
        }

        public static int matchNoId()
        {
            return 11;
        }

        public static int matchNoSinceVersion()
        {
            return 0;
        }

        public static int matchNoEncodingOffset()
        {
            return 0;
        }

        public static int matchNoEncodingLength()
        {
            return 2;
        }

        public static String matchNoMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int matchNoNullValue()
        {
            return 65535;
        }

        public static int matchNoMinValue()
        {
            return 0;
        }

        public static int matchNoMaxValue()
        {
            return 65534;
        }

        public GroupEncoder matchNo(final int value)
        {
            buffer.putShort(offset + 0, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int matchSelId()
        {
            return 12;
        }

        public static int matchSelSinceVersion()
        {
            return 0;
        }

        public static int matchSelEncodingOffset()
        {
            return 2;
        }

        public static int matchSelEncodingLength()
        {
            return 2;
        }

        public static String matchSelMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int matchSelNullValue()
        {
            return 65535;
        }

        public static int matchSelMinValue()
        {
            return 0;
        }

        public static int matchSelMaxValue()
        {
            return 65534;
        }

        public GroupEncoder matchSel(final int value)
        {
            buffer.putShort(offset + 2, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int matchOddsId()
        {
            return 13;
        }

        public static int matchOddsSinceVersion()
        {
            return 0;
        }

        public static int matchOddsEncodingOffset()
        {
            return 4;
        }

        public static int matchOddsEncodingLength()
        {
            return 2;
        }

        public static String matchOddsMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int matchOddsNullValue()
        {
            return 65535;
        }

        public static int matchOddsMinValue()
        {
            return 0;
        }

        public static int matchOddsMaxValue()
        {
            return 65534;
        }

        public GroupEncoder matchOdds(final int value)
        {
            buffer.putShort(offset + 4, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int matchHandiId()
        {
            return 14;
        }

        public static int matchHandiSinceVersion()
        {
            return 0;
        }

        public static int matchHandiEncodingOffset()
        {
            return 6;
        }

        public static int matchHandiEncodingLength()
        {
            return 2;
        }

        public static String matchHandiMetaAttribute(final MetaAttribute metaAttribute)
        {
            if (MetaAttribute.PRESENCE == metaAttribute)
            {
                return "required";
            }

            return "";
        }

        public static int matchHandiNullValue()
        {
            return 65535;
        }

        public static int matchHandiMinValue()
        {
            return 0;
        }

        public static int matchHandiMaxValue()
        {
            return 65534;
        }

        public GroupEncoder matchHandi(final int value)
        {
            buffer.putShort(offset + 6, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }

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

        final SampleGroupDecoder decoder = new SampleGroupDecoder();
        decoder.wrap(buffer, initialOffset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
