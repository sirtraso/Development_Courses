package com.trasodeveloper.javaforbeginners.staticandfinal;

class Things {
    public final static int LUCKY_NUMBER = 18;
    public String name;
    public static String description;

    public static int count = 0;
    public int id;

    public Things() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object Id: " + id + ", Name: " + name);
        System.out.println("static variable from a non-static method:  " + description);
    }

    public static void showInfo() {
        System.out.println("Showing info" + description);  //static methods can access static variables
        //System.out.println("name: " + name);  // static methods can't access non-static variables like name
    }
}

public class StaticFinalApp {
    public void staticAndFinalTestApp() {
        Things.description = "I am a Thing";
        System.out.println(Things.description);
        Things.showInfo();

        System.out.println("Before Create the count is: " + Things.count);
        Things t1 = new Things();
        Things t2 = new Things();
        System.out.println("After Create the count is: " + Things.count);

        t1.name = "La mole";
        t2.name = "Abomination";

        //System.out.println(t1.name);
        //System.out.println(t2.name);
        t1.showName();
        t2.showName();

        System.out.println("Otra variable estatica, PI: " + Math.PI);
        System.out.println("Lucky number: " + Things.LUCKY_NUMBER);
    }
}
