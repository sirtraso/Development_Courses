package com.trasodeveloper.javaforbeginners.handingexcpetions.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandingException {
    public void mainHangingException(){
        File file = new File("test.txt");
        try {
            //This will not be executed if an exception is thrown.
            System.out.println("Continuing..... ");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());
        }

    }
}
