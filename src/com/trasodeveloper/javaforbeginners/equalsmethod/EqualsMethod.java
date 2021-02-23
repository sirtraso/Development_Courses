package com.trasodeveloper.javaforbeginners.equalsmethod;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsMethod {
    public void mainEqualsMethod() {
        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");

        System.out.println("Person comparison:");
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        Double val1 = 7.2;
        Double val2 = 7.2;

        System.out.println("Double comparison:");
        System.out.println(val1 == val2);
        System.out.println(val1.equals(val2));

        Integer num1 = 6;
        Integer num2 = 8 - 2;

        System.out.println("Integer comparison:");
        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));

        String text1 = "Hello";
        String text2 = "Helloworld".substring(0,5);

        System.out.println("String comparison:");
        System.out.println(text1 == text2);
        System.out.println(text1.equals(text2));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
