/* Generated SBE (Simple Binary Encoding) message codec. */
package stn.serialization.sbe;

import org.agrona.MutableDirectBuffer;


/**
 * A quote represents the price of a stock in a market
 */
@SuppressWarnings("all")
public final class HeaderEncoder
{
    public static final int SCHEMA_ID = 1;
    public static final int SCHEMA_VERSION = 0;
    public static final int ENCODED_LENGTH = 55;
    public static final java.nio.ByteOrder BYTE_ORDER = java.nio.ByteOrder.LITTLE_ENDIAN;

    private int offset;
    private MutableDirectBuffer buffer;

    public HeaderEncoder wrap(final MutableDirectBuffer buffer, final int offset)
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

    public static int startCodeEncodingOffset()
    {
        return 0;
    }

    public static int startCodeEncodingLength()
    {
        return 3;
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


    public HeaderEncoder startCode(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 0 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public HeaderEncoder putStartCode(final byte value0, final byte value1, final byte value2)
    {
        buffer.putByte(offset + 0, value0);
        buffer.putByte(offset + 1, value1);
        buffer.putByte(offset + 2, value2);

        return this;
    }

    public static String startCodeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public HeaderEncoder putStartCode(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 0, src, srcOffset, length);

        return this;
    }

    public HeaderEncoder startCode(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 0, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 0 + start, (byte)0);
        }

        return this;
    }

    public HeaderEncoder startCode(final CharSequence src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 0, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 0 + start, (byte)0);
        }

        return this;
    }

    public static int transTypeEncodingOffset()
    {
        return 3;
    }

    public static int transTypeEncodingLength()
    {
        return 3;
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


    public HeaderEncoder transType(final int index, final byte value)
    {
        if (index < 0 || index >= 3)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 3 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public HeaderEncoder putTransType(final byte value0, final byte value1, final byte value2)
    {
        buffer.putByte(offset + 3, value0);
        buffer.putByte(offset + 4, value1);
        buffer.putByte(offset + 5, value2);

        return this;
    }

    public static String transTypeCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public HeaderEncoder putTransType(final byte[] src, final int srcOffset)
    {
        final int length = 3;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 3, src, srcOffset, length);

        return this;
    }

    public HeaderEncoder transType(final String src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 3, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 3 + start, (byte)0);
        }

        return this;
    }

    public HeaderEncoder transType(final CharSequence src)
    {
        final int length = 3;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 3, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 3 + start, (byte)0);
        }

        return this;
    }

    public static int transLenEncodingOffset()
    {
        return 6;
    }

    public static int transLenEncodingLength()
    {
        return 2;
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

    public HeaderEncoder transLen(final short value)
    {
        buffer.putShort(offset + 6, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int transIdEncodingOffset()
    {
        return 8;
    }

    public static int transIdEncodingLength()
    {
        return 16;
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


    public HeaderEncoder transId(final int index, final byte value)
    {
        if (index < 0 || index >= 16)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 8 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String transIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public HeaderEncoder putTransId(final byte[] src, final int srcOffset)
    {
        final int length = 16;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 8, src, srcOffset, length);

        return this;
    }

    public HeaderEncoder transId(final String src)
    {
        final int length = 16;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 8, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 8 + start, (byte)0);
        }

        return this;
    }

    public HeaderEncoder transId(final CharSequence src)
    {
        final int length = 16;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 8, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 8 + start, (byte)0);
        }

        return this;
    }

    public static int tkserNumEncodingOffset()
    {
        return 24;
    }

    public static int tkserNumEncodingLength()
    {
        return 8;
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

    public HeaderEncoder tkserNum(final long value)
    {
        buffer.putLong(offset + 24, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int resyncYnEncodingOffset()
    {
        return 32;
    }

    public static int resyncYnEncodingLength()
    {
        return 2;
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

    public HeaderEncoder resyncYn(final short value)
    {
        buffer.putShort(offset + 32, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int resultCdEncodingOffset()
    {
        return 34;
    }

    public static int resultCdEncodingLength()
    {
        return 2;
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


    public HeaderEncoder resultCd(final int index, final byte value)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 34 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public HeaderEncoder putResultCd(final byte value0, final byte value1)
    {
        buffer.putByte(offset + 34, value0);
        buffer.putByte(offset + 35, value1);

        return this;
    }

    public static String resultCdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public HeaderEncoder putResultCd(final byte[] src, final int srcOffset)
    {
        final int length = 2;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 34, src, srcOffset, length);

        return this;
    }

    public HeaderEncoder resultCd(final String src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 34, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 34 + start, (byte)0);
        }

        return this;
    }

    public HeaderEncoder resultCd(final CharSequence src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 34, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 34 + start, (byte)0);
        }

        return this;
    }

    public static int tagNumEncodingOffset()
    {
        return 36;
    }

    public static int tagNumEncodingLength()
    {
        return 13;
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


    public HeaderEncoder tagNum(final int index, final byte value)
    {
        if (index < 0 || index >= 13)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 36 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }

    public static String tagNumCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public HeaderEncoder putTagNum(final byte[] src, final int srcOffset)
    {
        final int length = 13;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 36, src, srcOffset, length);

        return this;
    }

    public HeaderEncoder tagNum(final String src)
    {
        final int length = 13;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 36, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 36 + start, (byte)0);
        }

        return this;
    }

    public HeaderEncoder tagNum(final CharSequence src)
    {
        final int length = 13;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 36, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 36 + start, (byte)0);
        }

        return this;
    }

    public static int gameIdEncodingOffset()
    {
        return 49;
    }

    public static int gameIdEncodingLength()
    {
        return 2;
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


    public HeaderEncoder gameId(final int index, final byte value)
    {
        if (index < 0 || index >= 2)
        {
            throw new IndexOutOfBoundsException("index out of range: index=" + index);
        }

        final int pos = offset + 49 + (index * 1);
        buffer.putByte(pos, value);

        return this;
    }
    public HeaderEncoder putGameId(final byte value0, final byte value1)
    {
        buffer.putByte(offset + 49, value0);
        buffer.putByte(offset + 50, value1);

        return this;
    }

    public static String gameIdCharacterEncoding()
    {
        return java.nio.charset.StandardCharsets.US_ASCII.name();
    }

    public HeaderEncoder putGameId(final byte[] src, final int srcOffset)
    {
        final int length = 2;
        if (srcOffset < 0 || srcOffset > (src.length - length))
        {
            throw new IndexOutOfBoundsException("Copy will go out of range: offset=" + srcOffset);
        }

        buffer.putBytes(offset + 49, src, srcOffset, length);

        return this;
    }

    public HeaderEncoder gameId(final String src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("String too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 49, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 49 + start, (byte)0);
        }

        return this;
    }

    public HeaderEncoder gameId(final CharSequence src)
    {
        final int length = 2;
        final int srcLength = null == src ? 0 : src.length();
        if (srcLength > length)
        {
            throw new IndexOutOfBoundsException("CharSequence too large for copy: byte length=" + srcLength);
        }

        buffer.putStringWithoutLengthAscii(offset + 49, src);

        for (int start = srcLength; start < length; ++start)
        {
            buffer.putByte(offset + 49 + start, (byte)0);
        }

        return this;
    }

    public static int totalStakeEncodingOffset()
    {
        return 51;
    }

    public static int totalStakeEncodingLength()
    {
        return 2;
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

    public HeaderEncoder totalStake(final short value)
    {
        buffer.putShort(offset + 51, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }


    public static int gcBlockCntEncodingOffset()
    {
        return 53;
    }

    public static int gcBlockCntEncodingLength()
    {
        return 2;
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

    public HeaderEncoder gcBlockCnt(final short value)
    {
        buffer.putShort(offset + 53, value, java.nio.ByteOrder.LITTLE_ENDIAN);
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

        final HeaderDecoder decoder = new HeaderDecoder();
        decoder.wrap(buffer, offset);

        return decoder.appendTo(builder);
    }
}
