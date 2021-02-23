package com.trasodeveloper.javaforbeginners.upcastingdowncasting;

import javax.crypto.Mac;

class Machine {
    public void start() {
        System.out.println("Machine started");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken.");
    }
}

public class UpcastDowncast {
    public UpcastDowncast() {
    }

    public void mainUpcatingDowncasting() {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //Upcasting
        //Machine machine2 = new Camera();    //ésto es posible por que la clase Camera hereda de Mchine
        Machine machine2 = camera1;
        machine2.start();
        //machine2.snap();  //Esto genera un error por que la clase Machine no contiene un método snap

        //Downcasting
        Machine machine3 = new Camera();
        //Camera camera2 = machine3;  //ésto no es posible dado que Machine es padre de camera
        Camera camera2 = (Camera) machine3; //Para poder hacerlo se realiza un cast como en esta linea
        camera2.snap();

        //Doesn't work --- runtime error.
        Machine machine4 = new Machine();
        //Camera camera3 = (Camera) machine4;   //Esto provoca una excepcion tipo ClassCastException
        //camera3.start();
        //camera3.snap();

    }
}
