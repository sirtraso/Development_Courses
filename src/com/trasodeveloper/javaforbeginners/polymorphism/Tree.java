package com.trasodeveloper.javaforbeginners.polymorphism;

public class Tree extends Plant {
    @Override
    public void grow() {
        //super.grow();
        System.out.println("Tree growing.");
    }

    public void shedLeaves() {
        System.out.println("leaves shedding.");
    }
}
