package com.trasodeveloper.javaforbeginners.inheritance;

public class Car extends Machine {
    @Override    //no es necesario para la herencia
    public void start() {
        System.out.println("Car Started");
    }

    public void wipeWindShield() {
        System.out.println("Wiping windshield");
    }

    public void showInfo()  {
        System.out.println("Car name: " + name);
    }
}
