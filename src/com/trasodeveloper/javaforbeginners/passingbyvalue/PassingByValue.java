package com.trasodeveloper.javaforbeginners.passingbyvalue;

public class PassingByValue {

    public void mainPassingByValue() {
        PassingByValue pass = new PassingByValue();

        // ----------------------------------------
        int value = 7;
        System.out.println("1. Value is: " + value);
        pass.show(value);
        System.out.println("4. Value is: " + value);

        // ----------------------------------------

        Person person = new Person("Bob");
        System.out.println("1. Person is: " + person);
        pass.show(person);
        System.out.println("5. Person is: " + person);

    }

    public void show(int value) {
        System.out.println("2. Value is: " + value);
        value = 8;
        System.out.println("3. Value is: " + value);
    }

    public void show(Person person) {
        System.out.println("2. Person is: " + person);
        person.setName("Sue");
        System.out.println("3. Person is: " + person);
        person = new Person("Mike");
        System.out.println("4. Person is: " + person);
    }
}
