package org.pacc.nb.ByteObj.BasicData;

import org.pacc.nb.ByteObj.CacheByteObj;
import org.pacc.nb.ByteObj.Serializer.BasicDataSerializer;

public class BooleanByteObj extends CacheByteObj<Boolean>
{
    public BooleanByteObj(Boolean object)
    {
        super(object);
    }

    public BooleanByteObj(byte[] objectBytesData)
    {
        super(objectBytesData);
    }

    @Override
    public byte[] serialize(Boolean object)
    {
        return BasicDataSerializer.serialize(object);
    }

    @Override
    public Boolean deserialize(byte[] objectBytesData)
    {
        return BasicDataSerializer.deserializeBoolean(this.getBytes());
    }
}
