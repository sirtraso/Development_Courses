package com.trasodeveloper.javaforbeginners.anonymousclases;

class Machine {
    public void start() {
        System.out.println("Starting machine...");
    }
}

interface Plant {
    public void grow();
}

public class AnonymousClasses {
    public void mainAnonymousClasses() {
        Machine machine1 = new Machine() {
            @Override
            public void start() {
                System.out.println("Camera snapping...");
            }
        };
        machine1.start();

        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("plant growing...");
            }
        };
        plant1.grow();
    }
}
