package com.trasodeveloper.javaforbeginners.inheritance;

public class Machine {
    //private String name = "Machine Type";
    protected String name = "Machine Type";

    public void start() {
        System.out.println("Machine Starting");
    }

    public void stop() {
        System.out.println("Machine stopped");
    }
}
