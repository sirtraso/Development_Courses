package com.trasodeveloper.javaforbeginners.sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {

    public void mainSortedMaps() {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedhashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("Hash Map: ");
        testMap(hashMap);
        System.out.println("\nLinked Map: ");
        testMap(linkedhashMap);
        System.out.println("\nTree Map: ");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");
        map.put(17, "duck");

        for (Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + " : " + value +".");
        }
    }
}
