package com.trasodeveloper.javaforbeginners.publicprivateprotected;

import com.trasodeveloper.javaforbeginners.publicprivateprotected.world.Plant;

public class PermissionApp {

    public void mainPermissionApp() {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

        //System.out.println(plant.type); //no es accesible por ser private

        //size es protected; PermissionApp no esta en el mismo paquete que Plant
        //System.out.println(plant.size);

        //no funciona por que Plant Y esta clase estan en distintos paquetes
        //System.out.println(plant.height);
    }

}
