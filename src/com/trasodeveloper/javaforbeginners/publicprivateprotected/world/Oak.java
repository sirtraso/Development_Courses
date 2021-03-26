package com.trasodeveloper.javaforbeginners.publicprivateprotected.world;

public class Oak extends  Plant {
    public Oak() {
        //type no es accesible desde Oak por ser privada
        //type = "tree";

        //this works beause is protected
        this.size = "large";

        //funciona por que Oak  y Plant estan en el mismo paquete
        this.height = 10;
    }
}
