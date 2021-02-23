package com.trasodeveloper.javaforbeginners.runtimecheckedexceptions;

public class RuntimeCheckedExceptions {
    public void mainRTeCe() {
        /*  División entre cero
        int value = 7;
        value = value/0;*/

        /* Null pointer Exception - excepción de referencia nula
        String text = null;
        System.out.println(text.length());*/

        /* Indice en arreglo fuera de alcance */

        String[] texts = {"one", "two", "Three"};
        try {
            System.out.println(texts[3]);
        //} catch (Exception e) {
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }


    }
}
