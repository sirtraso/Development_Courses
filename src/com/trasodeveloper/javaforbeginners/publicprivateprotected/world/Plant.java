package com.trasodeveloper.javaforbeginners.publicprivateprotected.world;

/*
    private   ... solo dentro de la misma clase
    public    ... desde cualquier punto
    protected ... sub clases y desde el mismo paquete
    no modifier ... solo en el mismo paquete
*/


public class Plant {
    //bad practice
    public String name;
    //acceptable practice ... its final
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "Plant";
        this.size = "medium";
        this.height = 8;
    }
}
