package com.trasodeveloper.javaforbeginners.usinggenerics;

import java.util.ArrayList;
import java.util.HashMap;

class Animal {
    public Animal() {
    }
}

public class UsingGenerics {

    public void mainUsingGenerics() {
        //////////////// Before Java 5 ///////////////////
        ArrayList list = new ArrayList();
         list.add("Apples");
         list.add("Banana");
         list.add("Orange");

        String fruit = (String) list.get(0);
        System.out.println(fruit);

        //////////// Modern Style //////////////////////
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String animal = strings.get(0);
        System.out.println(animal);

        //////////// There can be more than one type argument ////////
        HashMap<Integer, String>  map = new HashMap<Integer, String>();

        /////////// Java 7 Style ///////////
        ArrayList<Animal> someList = new ArrayList<>();
        Animal an = someList.get(1);
    }
}
