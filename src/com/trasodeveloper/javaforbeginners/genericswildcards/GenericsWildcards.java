package com.trasodeveloper.javaforbeginners.genericswildcards;

import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return " I am a Machine";
    }

    public void start() {
        System.out.println("Starting Machine...");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return " I'm a Camera";
    }

    public void snap() {
        System.out.println("Snap!");
    }
}

public class GenericsWildcards {

    public GenericsWildcards() {
    }

    public void mainGenericsWildCards() {
        ArrayList<Machine> list1 = new ArrayList<>();
        list1.add(new Machine());
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();
        list2.add(new Camera());
        list2.add(new Camera());

        showList(list1);
        //showList(list2);  //el método showlist no permite recibir un tipo de dato Camera apesar de heredar a Machine
        showList1(list2); //para esto se utilizan los wildcards (?) y los objetos genericos.
        showlist2(list1);
        showlist2(list2);
    }

    private void showList(ArrayList<Machine> list) {
        for (Machine value: list) {
            System.out.println(value);
        }
    }

    private void showList1(ArrayList<?> list) {
        for (Object value: list) {
            System.out.println(value);
            //value.start(); //no es posible ejecutar el metodo start por no ser directamente de la clase Machine, si no del Object
        }

    }

    private void showlist2(ArrayList<? extends Machine> list) {
        for (Machine value: list) {
            System.out.println(value);
            value.start();
            //value.snap();  //solo obtiene datos de Machine ya que es un tipo de object que hereda de Machine
        }
    }

    private void showlist3(ArrayList<? extends Camera> list) {
        for (Camera value: list) {
            System.out.println(value);
            value.start();
            value.snap();
        }
    }

    /*private void showlist4(ArrayList<? super Camera> list) {
        for (Object value: list) {
            System.out.println(value);
            value.start();
            value.snap();
        }
    }*/
}
