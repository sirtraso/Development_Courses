package com.trasodeveloper.javaforbeginners.publicprivateprotected.world;

public class Field {
    private Plant plant = new Plant();

    public Field() {
        //size es protected, Field esta en el mismo paquete que Plant
        System.out.println(plant.size);
    }
}
