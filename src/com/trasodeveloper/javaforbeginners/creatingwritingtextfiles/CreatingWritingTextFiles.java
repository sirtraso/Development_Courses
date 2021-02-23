package com.trasodeveloper.javaforbeginners.creatingwritingtextfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingWritingTextFiles {

    public void mainCWTextFiles() {
        File file = new File("src//com//trasodeveloper//javaforbeginners//creatingwritingtextfiles//test.txt");

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("This is a first line");
            bw.newLine();
            bw.write("This is a second line");
            bw.newLine();
            bw.write("Last line.");
        } catch (IOException e) {
            System.out.println("Can't create a file, IOException. " + file.toString());
        }
    }
}
