package org.pacc.nb.ByteObj.BasicData;

import org.pacc.nb.ByteObj.CacheByteObj;
import org.pacc.nb.ByteObj.Serializer.BasicDataSerializer;

public class BInteger extends CacheByteObj<Integer>
{
    public BInteger(Integer object)
    {
        super(object);
    }

    public BInteger(byte[] objectBytesData)
    {
        super(objectBytesData);
    }

    @Override
    public byte[] serialize(Integer object)
    {
        return BasicDataSerializer.serialize(object);
    }

    @Override
    public Integer deserialize(byte[] objectBytesData)
    {
        return BasicDataSerializer.deserializeInteger(this.getBytes());
    }

}
