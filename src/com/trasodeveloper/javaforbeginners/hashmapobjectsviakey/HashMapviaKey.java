package com.trasodeveloper.javaforbeginners.hashmapobjectsviakey;

import java.util.HashMap;
import java.util.Map;

public class HashMapviaKey {
    public void mainMapViaKey() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");

        map.put(6, "Overwritted");
        String text = map.get(6);
        System.out.println(text);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
