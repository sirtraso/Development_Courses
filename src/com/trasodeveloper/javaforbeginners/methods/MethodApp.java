package com.trasodeveloper.javaforbeginners.methods;

class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void sayHello() {
        System.out.println("Hello There!");
    }

}

public class MethodApp {
    public void mainMethodApp() {
        Person person1 = new Person();
        person1.name = "Tony Stark";
        person1.age = 45;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Steve Rogers";
        person2.age = 112;
        person2.speak();
        person2.sayHello();

        System.out.println(person1.name);

    }
}
