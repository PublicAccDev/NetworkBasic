package org.pacc.nb;

import org.pacc.nb.ByteObj.BasicData.BDouble;
import org.pacc.nb.ByteObj.BasicData.BString;
import org.pacc.nb.ByteObj.Container.BHashSet;
import org.pacc.nb.ByteObj.Container.BLinkedHashMap;

public class Main
{
    public static void main(String[] args)
    {
        test2();
    }

    private static void test1()
    {
        BLinkedHashMap<BString, BDouble> map = new BLinkedHashMap<>(BString.class, BDouble.class);
        map.put(new BString("E1"), new BDouble(1D));
        map.put(new BString("E2"), new BDouble(2D));
        map.put(new BString("E3"), new BDouble(3D));
        map.put(new BString("E4"), new BDouble(4D));
        map.put(new BString("E5"), new BDouble(5D));
        map.put(new BString("E6"), new BDouble(6D));
        map.put(new BString("E7"), new BDouble(7D));
        map.forEach((k, v) -> System.out.println(k.getObject() + ": " + v.getObject()));
    }

    private static void test2()
    {
        BHashSet<BString> map = new BHashSet<>(BString.class);
        map.add(new BString("E1"));
        map.add(new BString("E2"));
        map.add(new BString("E3"));
        map.add(new BString("E4"));
        map.add(new BString("E5"));
        map.add(new BString("E6"));
        map.add(new BString("E7"));
        map.add(new BString("E8"));
        map.forEach(o -> System.out.println(o.getObject()));
    }
}
