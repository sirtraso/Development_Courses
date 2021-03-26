package com.trasodeveloper.javaforbeginners.readingfileswithscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesScanner {
    public void mainScannerFiles() {
        String filename = "E:\\Development\\Repositorios\\examplefile.txt";
        // String filename = "examplefile.txt"; //esto colocando el archivo dentro del proyecto

        File textFile = new File(filename);

        Scanner in = null;
        try {
            in = new Scanner(textFile);

            int value = in.nextInt();
            System.out.println("Read value: " + value);

            in.nextLine();

            int count = 2;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                System.out.println(count + ": " + line);
                count++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
