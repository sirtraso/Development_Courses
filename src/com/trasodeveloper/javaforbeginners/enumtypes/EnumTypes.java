package com.trasodeveloper.javaforbeginners.enumtypes;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class EnumTypes {

    //public static final int DOG = 0;
    //public static final int CAT = 1;
    //public static final int MOUSE = 2;

    public void mainEnumTypes() {
        //int animal = CAT;
        Animal animal = Animal.CAT;

        /*switch (animal) {
            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
        }*/
        switch (animal) {

            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + animal);
        }

        System.out.println(Animal.DOG);
        System.out.println("Enum name as a string: " + Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Animal);
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.DOG.getName());

        Animal animal2 = Animal.valueOf("CAT");
        System.out.println(animal2);
    }
}
