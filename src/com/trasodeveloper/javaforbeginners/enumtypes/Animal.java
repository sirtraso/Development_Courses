package com.trasodeveloper.javaforbeginners.enumtypes;

public enum Animal {
    //CAT, DOG, MOUSE
    CAT("fergus"), DOG("Fido"), MOUSE("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This animal is called "+ name ;
    }
}
