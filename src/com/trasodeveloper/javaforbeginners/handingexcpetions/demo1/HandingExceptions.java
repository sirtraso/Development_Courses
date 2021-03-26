package com.trasodeveloper.javaforbeginners.handingexcpetions.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandingExceptions {
    public void mainHangingException() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);

    }
}
