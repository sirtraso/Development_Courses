package com.trasodeveloper.javaforbeginners.transientkeywordandmoreserialization;

import java.io.Serializable;

public class Person implements Serializable {

    private transient int id;    //al ser transient no se deserializa
    private String name;

    private static int count;    //al ser transient no se deserializa

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Two arguments constructor");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count + '}';
    }


}