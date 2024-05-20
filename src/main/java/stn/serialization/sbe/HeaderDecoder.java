/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.DirectBuffer;


/**
 * A quote represents the price of a stock in a market
 */
@SuppressWarnings("all")
public final class HeaderDecoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final int ENCODED_LENGTH = 55;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private DirectBuffer buffer;

    public HeaderDecoder wrap(final DirectBuffer buffer, final int offset)
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

    public static int startCodeEncodingOffset()
    {
        return 0;
    }

    public static int startCodeEncodingLength()
    {
        return 3;
    }

    public static int startCodeSinceVersion()
    {
        return 0;
    }

    public static byte startCodeNullValue()
    {
        return (byte)0;
    }

    public static byte startCodeMinValue()
    {
        return (byte)32;
    }

    public static byte startCodeMaxValue()
    {
        return (byte)126;
    }

    public static int startCodeLength()
    {
        return 3;
    }


    public byte startCode(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 0 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String startCodeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getStartCode(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 0, dst, dstOffset, length);

        return length;
    }

    public String startCode()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(offset + 0, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getStartCode(final Appendable value)
    {
        for (int i = 0; i < 3; ++i)
        {
            final int c = buffer.getByte(offset + 0 + i) & 0xFF;
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

        return 3;
    }


    public static int transTypeEncodingOffset()
    {
        return 3;
    }

    public static int transTypeEncodingLength()
    {
        return 3;
    }

    public static int transTypeSinceVersion()
    {
        return 0;
    }

    public static byte transTypeNullValue()
    {
        return (byte)0;
    }

    public static byte transTypeMinValue()
    {
        return (byte)32;
    }

    public static byte transTypeMaxValue()
    {
        return (byte)126;
    }

    public static int transTypeLength()
    {
        return 3;
    }


    public byte transType(final int index)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 3 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String transTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getTransType(final byte[] dst, final int dstOffset)
    {
        final int length = 3;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 3, dst, dstOffset, length);

        return length;
    }

    public String transType()
    {
        final byte[] dst = new byte[3];
        buffer.getBytes(offset + 3, dst, 0, 3);

        int end = 0;
        for (; end < 3 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getTransType(final Appendable value)
    {
        for (int i = 0; i < 3; ++i)
        {
            final int c = buffer.getByte(offset + 3 + i) & 0xFF;
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

        return 3;
    }


    public static int transLenEncodingOffset()
    {
        return 6;
    }

    public static int transLenEncodingLength()
    {
        return 2;
    }

    public static int transLenSinceVersion()
    {
        return 0;
    }

    public static short transLenNullValue()
    {
        return (short)-32768;
    }

    public static short transLenMinValue()
    {
        return (short)-32767;
    }

    public static short transLenMaxValue()
    {
        return (short)32767;
    }

    public short transLen()
    {
        return buffer.getShort(offset + 6, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int transIdEncodingOffset()
    {
        return 8;
    }

    public static int transIdEncodingLength()
    {
        return 16;
    }

    public static int transIdSinceVersion()
    {
        return 0;
    }

    public static byte transIdNullValue()
    {
        return (byte)0;
    }

    public static byte transIdMinValue()
    {
        return (byte)32;
    }

    public static byte transIdMaxValue()
    {
        return (byte)126;
    }

    public static int transIdLength()
    {
        return 16;
    }


    public byte transId(final int index)
    {
        if (index < 0 || index >= 16)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 8 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String transIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getTransId(final byte[] dst, final int dstOffset)
    {
        final int length = 16;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 8, dst, dstOffset, length);

        return length;
    }

    public String transId()
    {
        final byte[] dst = new byte[16];
        buffer.getBytes(offset + 8, dst, 0, 16);

        int end = 0;
        for (; end < 16 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getTransId(final Appendable value)
    {
        for (int i = 0; i < 16; ++i)
        {
            final int c = buffer.getByte(offset + 8 + i) & 0xFF;
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

        return 16;
    }


    public static int tkserNumEncodingOffset()
    {
        return 24;
    }

    public static int tkserNumEncodingLength()
    {
        return 8;
    }

    public static int tkserNumSinceVersion()
    {
        return 0;
    }

    public static long tkserNumNullValue()
    {
        return -9223372036854775808L;
    }

    public static long tkserNumMinValue()
    {
        return -9223372036854775807L;
    }

    public static long tkserNumMaxValue()
    {
        return 9223372036854775807L;
    }

    public long tkserNum()
    {
        return buffer.getLong(offset + 24, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int resyncYnEncodingOffset()
    {
        return 32;
    }

    public static int resyncYnEncodingLength()
    {
        return 2;
    }

    public static int resyncYnSinceVersion()
    {
        return 0;
    }

    public static short resyncYnNullValue()
    {
        return (short)-32768;
    }

    public static short resyncYnMinValue()
    {
        return (short)-32767;
    }

    public static short resyncYnMaxValue()
    {
        return (short)32767;
    }

    public short resyncYn()
    {
        return buffer.getShort(offset + 32, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int resultCdEncodingOffset()
    {
        return 34;
    }

    public static int resultCdEncodingLength()
    {
        return 2;
    }

    public static int resultCdSinceVersion()
    {
        return 0;
    }

    public static byte resultCdNullValue()
    {
        return (byte)0;
    }

    public static byte resultCdMinValue()
    {
        return (byte)32;
    }

    public static byte resultCdMaxValue()
    {
        return (byte)126;
    }

    public static int resultCdLength()
    {
        return 2;
    }


    public byte resultCd(final int index)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 34 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String resultCdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getResultCd(final byte[] dst, final int dstOffset)
    {
        final int length = 2;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 34, dst, dstOffset, length);

        return length;
    }

    public String resultCd()
    {
        final byte[] dst = new byte[2];
        buffer.getBytes(offset + 34, dst, 0, 2);

        int end = 0;
        for (; end < 2 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getResultCd(final Appendable value)
    {
        for (int i = 0; i < 2; ++i)
        {
            final int c = buffer.getByte(offset + 34 + i) & 0xFF;
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


    public static int tagNumEncodingOffset()
    {
        return 36;
    }

    public static int tagNumEncodingLength()
    {
        return 13;
    }

    public static int tagNumSinceVersion()
    {
        return 0;
    }

    public static byte tagNumNullValue()
    {
        return (byte)0;
    }

    public static byte tagNumMinValue()
    {
        return (byte)32;
    }

    public static byte tagNumMaxValue()
    {
        return (byte)126;
    }

    public static int tagNumLength()
    {
        return 13;
    }


    public byte tagNum(final int index)
    {
        if (index < 0 || index >= 13)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 36 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String tagNumCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getTagNum(final byte[] dst, final int dstOffset)
    {
        final int length = 13;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 36, dst, dstOffset, length);

        return length;
    }

    public String tagNum()
    {
        final byte[] dst = new byte[13];
        buffer.getBytes(offset + 36, dst, 0, 13);

        int end = 0;
        for (; end < 13 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getTagNum(final Appendable value)
    {
        for (int i = 0; i < 13; ++i)
        {
            final int c = buffer.getByte(offset + 36 + i) & 0xFF;
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

        return 13;
    }


    public static int gameIdEncodingOffset()
    {
        return 49;
    }

    public static int gameIdEncodingLength()
    {
        return 2;
    }

    public static int gameIdSinceVersion()
    {
        return 0;
    }

    public static byte gameIdNullValue()
    {
        return (byte)0;
    }

    public static byte gameIdMinValue()
    {
        return (byte)32;
    }

    public static byte gameIdMaxValue()
    {
        return (byte)126;
    }

    public static int gameIdLength()
    {
        return 2;
    }


    public byte gameId(final int index)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 49 + (index * 1);

        return buffer.getByte(pos);
    }


    public static String gameIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public int getGameId(final byte[] dst, final int dstOffset)
    {
        final int length = 2;
        if (dstOffset < 0 || dstOffset > (dst.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + dstOffset);
        }

        buffer.getBytes(offset + 49, dst, dstOffset, length);

        return length;
    }

    public String gameId()
    {
        final byte[] dst = new byte[2];
        buffer.getBytes(offset + 49, dst, 0, 2);

        int end = 0;
        for (; end < 2 && dst[end] != 0; ++end);

        return new String(dst, 0, end, java.nio.charset.StandardCharsets.US_ASCII);
    }


    public int getGameId(final Appendable value)
    {
        for (int i = 0; i < 2; ++i)
        {
            final int c = buffer.getByte(offset + 49 + i) & 0xFF;
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


    public static int totalStakeEncodingOffset()
    {
        return 51;
    }

    public static int totalStakeEncodingLength()
    {
        return 2;
    }

    public static int totalStakeSinceVersion()
    {
        return 0;
    }

    public static short totalStakeNullValue()
    {
        return (short)-32768;
    }

    public static short totalStakeMinValue()
    {
        return (short)-32767;
    }

    public static short totalStakeMaxValue()
    {
        return (short)32767;
    }

    public short totalStake()
    {
        return buffer.getShort(offset + 51, java.nio.ByteOrder.LITTLE_ENDIAN);
    }


    public static int gcBlockCntEncodingOffset()
    {
        return 53;
    }

    public static int gcBlockCntEncodingLength()
    {
        return 2;
    }

    public static int gcBlockCntSinceVersion()
    {
        return 0;
    }

    public static short gcBlockCntNullValue()
    {
        return (short)-32768;
    }

    public static short gcBlockCntMinValue()
    {
        return (short)-32767;
    }

    public static short gcBlockCntMaxValue()
    {
        return (short)32767;
    }

    public short gcBlockCnt()
    {
        return buffer.getShort(offset + 53, java.nio.ByteOrder.LITTLE_ENDIAN);
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
        builder.append("startCode=");
        for (int i = 0; i < startCodeLength() && this.startCode(i) > 0; i++)
        {
            builder.append((char)this.startCode(i));
        }
        builder.append('|');
        builder.append("transType=");
        for (int i = 0; i < transTypeLength() && this.transType(i) > 0; i++)
        {
            builder.append((char)this.transType(i));
        }
        builder.append('|');
        builder.append("transLen=");
        builder.append(this.transLen());
        builder.append('|');
        builder.append("transId=");
        for (int i = 0; i < transIdLength() && this.transId(i) > 0; i++)
        {
            builder.append((char)this.transId(i));
        }
        builder.append('|');
        builder.append("tkserNum=");
        builder.append(this.tkserNum());
        builder.append('|');
        builder.append("resyncYn=");
        builder.append(this.resyncYn());
        builder.append('|');
        builder.append("resultCd=");
        for (int i = 0; i < resultCdLength() && this.resultCd(i) > 0; i++)
        {
            builder.append((char)this.resultCd(i));
        }
        builder.append('|');
        builder.append("tagNum=");
        for (int i = 0; i < tagNumLength() && this.tagNum(i) > 0; i++)
        {
            builder.append((char)this.tagNum(i));
        }
        builder.append('|');
        builder.append("gameId=");
        for (int i = 0; i < gameIdLength() && this.gameId(i) > 0; i++)
        {
            builder.append((char)this.gameId(i));
        }
        builder.append('|');
        builder.append("totalStake=");
        builder.append(this.totalStake());
        builder.append('|');
        builder.append("gcBlockCnt=");
        builder.append(this.gcBlockCnt());
        builder.append(')');

        return builder;
    }
}
