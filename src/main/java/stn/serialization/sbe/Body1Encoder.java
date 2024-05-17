/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.MutableDirectBuffer;


/**
 * Represents a quote and amount of trade
 */
@SuppressWarnings("all")
public final class Body1Encoder
{
    public static final int BLOCK_LENGTH = 2;
    public static final int TEMPLATE_ID = 1;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final Body1Encoder parentMessage = this;
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

    public Body1Encoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public Body1Encoder wrapAndApplyHeader(
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

    public static int blockIdxId()
    {
        return 2;
    }

    public static int blockIdxSinceVersion()
    {
        return 0;
    }

    public static int blockIdxEncodingOffset()
    {
        return 0;
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

    public static int blockIdxNullValue()
    {
        return 65535;
    }

    public static int blockIdxMinValue()
    {
        return 0;
    }

    public static int blockIdxMaxValue()
    {
        return 65534;
    }

    public Body1Encoder blockIdx(final int value)
    {
        buffer.putShort(offset + 0, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    private final GamesEncoder games = new GamesEncoder(this);

    public static long gamesId()
    {
        return 3;
    }

    public GamesEncoder gamesCount(final int count)
    {
        games.wrap(buffer, count);
        return games;
    }

    public static final class GamesEncoder
    {
        public static final int HEADER_SIZE = 8;
        private final Body1Encoder parentMessage;
        private MutableDirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int initialLimit;

        GamesEncoder(final Body1Encoder parentMessage)
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

        public GamesEncoder next()
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
            return 4;
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
            if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
            {
                return "int";
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

        public GamesEncoder matchNo(final int value)
        {
            buffer.putShort(offset + 0, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int matchSelId()
        {
            return 5;
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
            if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
            {
                return "int";
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

        public GamesEncoder matchSel(final int value)
        {
            buffer.putShort(offset + 2, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int matchOddsId()
        {
            return 6;
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
            if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
            {
                return "int";
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

        public GamesEncoder matchOdds(final int value)
        {
            buffer.putShort(offset + 4, (short)value, java.nio.ByteOrder.LITTLE_ENDIAN);
            return this;
        }


        public static int matchHandiId()
        {
            return 7;
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
            if (MetaAttribute.SEMANTIC_TYPE == metaAttribute)
            {
                return "int";
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

        public GamesEncoder matchHandi(final int value)
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

        final Body1Decoder decoder = new Body1Decoder();
        decoder.wrap(buffer, initialOffset, BLOCK_LENGTH, SCHEMA_VERSION);

        return decoder.appendTo(builder);
    }
}
