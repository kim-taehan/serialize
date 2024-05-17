/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.DirectBuffer;


/**
 * Represents a quote and amount of trade
 */
@SuppressWarnings("all")
public final class Body1Decoder
{
    public static final int BLOCK_LENGTH = 2;
    public static final int TEMPLATE_ID = 1;
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private final Body1Decoder parentMessage = this;
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

    public Body1Decoder wrap(
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

    public Body1Decoder wrapAndApplyHeader(
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

    public Body1Decoder sbeRewind()
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

    public int blockIdx()
    {
        return (buffer.getShort(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
    }


    private final GamesDecoder games = new GamesDecoder(this);

    public static long gamesDecoderId()
    {
        return 3;
    }

    public static int gamesDecoderSinceVersion()
    {
        return 0;
    }

    public GamesDecoder games()
    {
        games.wrap(buffer);
        return games;
    }

    public static final class GamesDecoder
        implements Iterable<GamesDecoder>, java.util.Iterator<GamesDecoder>
    {
        public static final int HEADER_SIZE = 8;
        private final Body1Decoder parentMessage;
        private DirectBuffer buffer;
        private int count;
        private int index;
        private int offset;
        private int blockLength;

        GamesDecoder(final Body1Decoder parentMessage)
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

        public GamesDecoder next()
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

        public java.util.Iterator<GamesDecoder> iterator()
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

        public int matchNo()
        {
            return (buffer.getShort(offset + 0, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public int matchSel()
        {
            return (buffer.getShort(offset + 2, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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

        public int matchOdds()
        {
            return (buffer.getShort(offset + 4, java.nio.ByteOrder.LITTLE_ENDIAN) & 0xFFFF);
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
        
        public GamesDecoder sbeSkip()
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

        final Body1Decoder decoder = new Body1Decoder();
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
        builder.append("[Body1](sbeTemplateId=");
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
        builder.append("blockIdx=");
        builder.append(this.blockIdx());
        builder.append('|');
        builder.append("games=[");
        final int gamesOriginalOffset = games.offset;
        final int gamesOriginalIndex = games.index;
        final GamesDecoder games = this.games();
        if (games.count() > 0)
        {
            while (games.hasNext())
            {
                games.next().appendTo(builder);
                builder.append(',');
            }
            builder.setLength(builder.length() - 1);
        }
        games.offset = gamesOriginalOffset;
        games.index = gamesOriginalIndex;
        builder.append(']');

        limit(originalLimit);

        return builder;
    }
    
    public Body1Decoder sbeSkip()
    {
        sbeRewind();
        GamesDecoder games = this.games();
        if (games.count() > 0)
        {
            while (games.hasNext())
            {
                games.next();
                games.sbeSkip();
            }
        }

        return this;
    }
}
