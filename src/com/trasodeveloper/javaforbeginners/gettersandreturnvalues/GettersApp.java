package com.trasodeveloper.javaforbeginners.gettersandreturnvalues;

public class GettersApp {

    class Person {
        String name;
        int age;

        void speak() {
            System.out.println("My name is " + name);
        }

        int calculateYearsToRetirement() {
            int yearsLeft = 65 - age;
            //System.out.println(yearsLeft);
            return yearsLeft;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }
    }

    public void mainAppGetters() {
        Person person1 = new Person();
        person1.name = "Peter Parquer";
        person1.age = 16;
        person1.speak();
        person1.calculateYearsToRetirement();

        int years = person1.calculateYearsToRetirement();
        System.out.println("Years till retirements " + years);
        int age = person1.getAge();
        String name = person1.getName();
        System.out.println("Name is: " + name);
        System.out.println(" Age is:  " + age);

    }
}
