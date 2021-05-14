package com.trasodeveloper.javaforbeginners.usingcustomobjectsinmaps;

import org.omg.PortableServer.POA;

import java.util.*;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //colocando hash y equals se evita crear dos bojetos iguales en un Map o un Set.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class CustomObjectsInSetsAndMaps {

    Person p1 = new Person(0, "Reed");
    Person p2 = new Person(1, "Susan");
    Person p3 = new Person(2, "Ben");
    Person p4 = new Person(0, "Reed");

    public void mainCustomObjectsIn() {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("tree", 3);
        map.put("one", 1);

        for (String key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<String> set = new LinkedHashSet<String>();
        set.add("dog");
        set.add("cat");
        set.add("mouse");
        set.add("dog");

        System.out.println(set);
        System.out.println("---------------------- Using Person Object");

        Map<Person, Integer> mapp = new LinkedHashMap<Person, Integer>();
        mapp.put(p1, 1);
        mapp.put(p2, 2);
        mapp.put(p3, 3);
        mapp.put(p4, 1);

        for (Person key: mapp.keySet()) {
            System.out.println(key + ": " + mapp.get(key));
        }

        Set<Person> setp = new LinkedHashSet<Person>();
        setp.add(p1);
        setp.add(p2);
        setp.add(p3);
        setp.add(p4);

        System.out.println(setp);
    }
}
