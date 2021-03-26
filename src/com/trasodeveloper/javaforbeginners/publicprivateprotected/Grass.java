package com.trasodeveloper.javaforbeginners.publicprivateprotected;

import com.trasodeveloper.javaforbeginners.publicprivateprotected.world.Plant;

public class Grass extends Plant {
    public Grass() {

        //no funciona por que aunque extendie de Plant,
        // Plant esta en un paquete distinto y no se espeficio tipo de acceso.
        //System.out.println(this.height);
    }
}
