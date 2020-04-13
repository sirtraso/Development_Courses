package com.trasodeveloper.javaforbeginners.thetostring;

class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        //return "Hello";
        //return id + ": "+  name;
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();*/

        return String.format("%-4d: %s", id, name);
    }
}

public class TheToStringApp {

    public void theToStringMainMethod() {
        //Object obj = new Object();
        //obj.
        Frog frog1 = new Frog(7, "Freddy");
        Frog frog2 = new Frog(5, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);

    }
}
