package com.trasodeveloper.javaforbeginners.Constructors;

class Machine {
    private String name;
    private  int code;

    public Machine() {
        this("R2D2", 1);
        System.out.println("Constructor Runing!");
        //name = "R2D2";
    }

    public Machine(String name) {
        this(name,1);
        System.out.println("Second Constructor running!");
        //this.name = name;
    }

    public Machine(String name, int code) {
        System.out.println("Third Constructor Running!");
        this.name = name;
        this.code = code;
    }
}

public class ConstructorTestApp {
    public void ConstructorTest() {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Wall-e");
        Machine machine3 = new Machine("Eva", 3);
    }
}
