package org.pacc.nb.ByteObj.BasicData;

import lombok.Setter;
import org.pacc.nb.ByteObj.CacheByteObj;
import org.pacc.nb.ByteObj.Serializer.BasicDataSerializer;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

public class BCharArray extends CacheByteObj<char[]>
{
    @Setter
    private Charset charset;

    public BCharArray(char[] object)
    {
        super(object);
    }

    public BCharArray(char[] object, Charset charset)
    {
        super(object);
        this.charset = charset;
    }

    public BCharArray(byte[] objectBytesData)
    {
        super(objectBytesData);
    }

    @Override
    public byte[] serialize(char[] object)
    {
        return BasicDataSerializer.serialize(object, this.getCharset());
    }

    @Override
    public char[] deserialize(byte[] objectBytesData)
    {
        return BasicDataSerializer.deserializeChars(objectBytesData, this.getCharset());
    }

    private Charset getCharset()
    {
        return Optional.ofNullable(charset).orElse(StandardCharsets.UTF_8);
    }
}
