package org.pacc.nb;

import org.pacc.nb.ByteObj.BasicData.BString;

import org.pacc.nb.ByteObj.Container.BArrayList;

public class Test
{
    private static long s;

    public static void main(String[] args)
    {
        BArrayList<BString> list = new BArrayList<>(BString.class);
        start();
        for(int i = 0; i < 1000000; i++)
        {
            list.add(new BString("Hello World"));
        }
        end();

    }

    private static void start()
    {
        s = System.currentTimeMillis();
    }

    private static void end()
    {
        System.out.println("Time: " + (System.currentTimeMillis()-s) + " ms");
    }
}
