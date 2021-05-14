package com.trasodeveloper.javaforbeginners.linkedlists;

import com.trasodeveloper.javaforbeginners.arraylisteasyway.ArrayListEasyWay;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public void mainLinkedLists() {
        /*
        * ArrayList manage arrays internally.
        * [0][1][2][3][4][5]...
        */
        ArrayList<Integer> arrayList = new ArrayList<>();

        /*
        * LinkedLists consists of elements where each element
        * has a reference to the previous and next element
        * [0]->[1]->[2] .....
        *     <-    <-
        */
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LiinkedList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        /*
        //Add items at end of list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }*/

        //Add items elsewhere in list
        for (int i=0; i<1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("TIme taken: " + (end - start) + " ms for " + type);
    }
}
