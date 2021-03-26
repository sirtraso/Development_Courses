package com.trasodeveloper.javaforbeginners.abstractclasses;

public abstract class Machine {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /* Cuando se colocal el abstract a la clase, no puede tener instancias de otras clases dentro de si
    Machine m = new Machine();
     */

    //Un método abstracto obliga a las clases que extienden esta clase a implementar el método
    public abstract void start();
    public abstract void doStuff();
    public abstract void shutdown();

    public void run() {
        start();
        doStuff();
        shutdown();
    }
}
