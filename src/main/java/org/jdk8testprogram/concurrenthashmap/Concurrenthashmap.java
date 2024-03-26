package org.jdk8testprogram.concurrenthashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmap {

    public static void main(String[] args) {

        System.out.print("ArraySize" + args.length);
        Map m = new HashMap();
        m.put(null, null);
        System.out.println("Map with null" + m);

        //concurrenthashmap

        Map map = new ConcurrentHashMap();
        map.put(null, null);
        System.out.println("Map Concurrent null" + map);


    }
}
