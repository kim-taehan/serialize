/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.DirectBuffer;


/**
 * Sample with group
 */
@SuppressWarnings("all")
public final class SampleGroupDecoder
{
    public static final int BLOCK_LENGTH = 65;
    public static final int TEMPLATE_ID = 1;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final SampleGroupDecoder parentMessage = this;
    private DirectBuffer buffer;
    private int initialOffset;
    private int offset;
    private int limit;
    int actingBlockLength;
    int actingVersion;

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

    public DirectBuffer buffer()
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

    public SampleGroupDecoder wrap(
        final DirectBuffer buffer,
        final int offset,
        final int actingBlockLength,
        final int actingVersion)
    {
        if (buffer != this.buffer)
        {
            this.buffer = buffer;
        }
        this.initialOffset = offset;
        this.offset = offset;
        this.actingBlockLength = actingBlockLength;
        this.actingVersion = actingVersion;
        limit(offset + actingBlockLength);

        return this;
    }

    public SampleGroupDecoder wrapAndApplyHeader(
        final DirectBuffer buffer,
        final int offset,
        final MessageHeaderDecoder headerDecoder)
    {
        headerDecoder.wrap(buffer, offset);

        final int templateId = headerDecoder.templateId();
        if (TEMPLATE_ID != templateId)
        {
            throw new IllegalStateException("Invalid TEMPLATE_ID: " + templateId);
        }

        return wrap(
            buffer,
            offset + MessageHeaderDecoder.ENCODED_LENGTH,
            headerDecoder.blockLength(),
            headerDecoder.version());
    }

    public SampleGroupDecoder sbeRewind()
    {
        return wrap(buffer, initialOffset, actingBlockLength, actingVersion);
    }

    public int sbeDecodedLength()
    {
        final int currentLimit = limit();
        sbeSkip();
        final int decodedLength = encodedLength();
        limit(currentLimit);

        return decodedLength;
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

    private final HeaderDecoder header = new HeaderDecoder();

    public HeaderDecoder header()
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

    public short blockIdx()
    {
        return buffer.getShort(offset + 55, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public short progNum()
    {
        return buffer.getShort(offset + 57, java.nio.ByteOrder.LITTLE_ENDIAN);
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


    public byte betMode(final int index)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 59 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String betModeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getBetMode(final byte[] dst, final int dstOffset)
    {
        final int length = 2;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 59, dst, dstOffset, length);

        return length;
    }

    public String betMode()
    {
        final byte[] dst = new byte[2];
        buffer.getBytes(offset + 59, dst, 0, 2);

        int end = 0;
        for (; end < 2 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getBetMode(final Appendable value)
    {
        for (int i = 0; i < 2; ++i)
        {
            final int c = buffer.getByte(offset + 59 + i) & 0xFF;
            if (c == 0)
            {
                return i;
            }

            try
            {
                value.append(c > 127 ? '?' : (char)c);
            }
            catch (final java.io.IOException ex)
            {
                throw new java.io.UncheckedIOException(ex);
            }
        }

        return 2;
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

    public short poolStake()
    {
        return buffer.getShort(offset + 61, java.nio.ByteOrder.LITTLE_ENDIAN);
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

    public short matchCnt()
    {
        return buffer.getShort(offset + 63, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    private final GroupDecoder group = new GroupDecoder(this);

    public static long groupDecoderId()
    {
        return 10;
    }

    public static int groupDecoderSinceVersion()
    {
        return 0;
    }

    public GroupDecoder group()
    {
        group.wrap(buffer);
        return group;
    }

    public static final class GroupDecoder
        implements Iterable<GroupDecoder>, java.util.Iterator<GroupDecoder>
    {
        public static final int HEADER_SIZE = 4;
        private final SampleGroupDecoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        GroupDecoder(final SampleGroupDecoder parentMessage)
        {
            this.parentMessage = parentMessage;
        }

        public void wrap(final DirectBuffer buffer)
        {
            if (buffer != this.buffer)
            {
                this.buffer = buffer;
            }

            index = 0;
            final int limit = parentMessage.limit();
            parentMessage.limit(limit + HEADER_SIZE);
            blockLength = (buffer.getShort(limit + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
            count = (buffer.getShort(limit + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }

        public GroupDecoder next()
        {
            if (index >= count)
            {
                throw new java.util.NoSuchElementException();
            }

            offset = parentMessage.limit();
            parentMessage.limit(offset + blockLength);
            ++index;

            return this;
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

        public int actingBlockLength()
        {
            return blockLength;
        }

        public int count()
        {
            return count;
        }

        public java.util.Iterator<GroupDecoder> iterator()
        {
            return this;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return index < count;
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

        public int matchNo()
        {
            return (buffer.getShort(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public int matchSel()
        {
            return (buffer.getShort(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public int matchOdds()
        {
            return (buffer.getShort(offset + 4, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public int matchHandi()
        {
            return (buffer.getShort(offset + 6, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
        }


        public StringBuilder appendTo(final StringBuilder builder)
        {
            if (null == buffer)
            {
                return builder;
            }

            builder.append('(');
            builder.append("matchNo=");
            builder.append(this.matchNo());
            builder.append('|');
            builder.append("matchSel=");
            builder.append(this.matchSel());
            builder.append('|');
            builder.append("matchOdds=");
            builder.append(this.matchOdds());
            builder.append('|');
            builder.append("matchHandi=");
            builder.append(this.matchHandi());
            builder.append(')');

            return builder;
        }
        
        public GroupDecoder sbeSkip()
        {

            return this;
        }
    }

    public String toString()
    {
        if (null == buffer)
        {
            return "";
        }

        final SampleGroupDecoder decoder = new SampleGroupDecoder();
        decoder.wrap(buffer, initialOffset, actingBlockLength, actingVersion);

        return decoder.appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        if (null == buffer)
        {
            return builder;
        }

        final int originalLimit = limit();
        limit(initialOffset + actingBlockLength);
        builder.append("[SampleGroup](sbeTemplateId=");
        builder.append(TEMPLATE_ID);
        builder.append("|sbeSchemaId=");
        builder.append(SCHEMA_ID);
        builder.append("|sbeSchemaVersion=");
        if (parentMessage.actingVersion != SCHEMA_VERSION)
        {
            builder.append(parentMessage.actingVersion);
            builder.append('/');
        }
        builder.append(SCHEMA_VERSION);
        builder.append("|sbeBlockLength=");
        if (actingBlockLength != BLOCK_LENGTH)
        {
            builder.append(actingBlockLength);
            builder.append('/');
        }
        builder.append(BLOCK_LENGTH);
        builder.append("):");
        builder.append("header=");
        final HeaderDecoder header = this.header();
        if (header != null)
        {
            header.appendTo(builder);
        }
        else
        {
            builder.append("null");
        }
        builder.append('|');
        builder.append("blockIdx=");
        builder.append(this.blockIdx());
        builder.append('|');
        builder.append("progNum=");
        builder.append(this.progNum());
        builder.append('|');
        builder.append("betMode=");
        for (int i = 0; i < betModeLength() && this.betMode(i) > 0; i++)
        {
            builder.append((char)this.betMode(i));
        }
        builder.append('|');
        builder.append("poolStake=");
        builder.append(this.poolStake());
        builder.append('|');
        builder.append("matchCnt=");
        builder.append(this.matchCnt());
        builder.append('|');
        builder.append("group=[");
        final int groupOriginalOffset = group.offset;
        final int groupOriginalIndex = group.index;
        final GroupDecoder group = this.group();
        if (group.count() > 0)
        {
            while (group.hasNext())
            {
                group.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        group.offset = groupOriginalOffset;
        group.index = groupOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public SampleGroupDecoder sbeSkip()
    {
        sbeRewind();
        GroupDecoder group = this.group();
        if (group.count() > 0)
        {
            while (group.hasNext())
            {
                group.next();
                group.sbeSkip();
            }
        }

        return this;
    }
}
