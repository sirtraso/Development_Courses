package com.trasodeveloper;

import com.trasodeveloper.javaaprofundidad.MainJavaAProfundidad;
import com.trasodeveloper.javaforbeginners.MainJavaForBeginners;

public class Main {
    public static void main(String [] args) {
        MainJavaForBeginners mjfb = new MainJavaForBeginners();
        mjfb.executeJavaForBeginnersMeethods();

        MainJavaAProfundidad mjap = new MainJavaAProfundidad();
        mjap.executeJavaAProfundidadMethods();
    }
}
