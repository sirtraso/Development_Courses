package com.trasodeveloper.javaforbeginners.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public void mainSets() {

        //Hashset does not retain order.
        //Set<String> set1 = new HashSet<String>();

        // LinkedHashSet remembers the order you added items in.

        // TreeSet sorts in natural order
        Set<String> set1 = new TreeSet<>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        // Adding duplicate items does nothing.
        set1.add("mouse");
        set1.add("bear");

        System.out.println(set1);

        ////////// Iteration ////////////
        for (String element: set1) {
            System.out.println(element);
        }

        /////////// Does set contains a given item? /////////////////
        if (set1.contains("aardvark")) {
            System.out.println("Contains aardvark");
        }
        if (set1.contains("cat")) {
            System.out.println("Contains cat");
        }

        // set2 contains some common elements with set1, and some new
        Set<String> set2 = new TreeSet<>();

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");

        ///////////// Intersection ///////////////////
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        ///////////// Diference ///////////////////
        Set<String> difference = new HashSet<>(set2);
        difference.removeAll(set1);
        System.out.println(difference);

    }
}
