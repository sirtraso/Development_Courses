package com.trasodeveloper.javaforbeginners.trywithresources;

import java.io.*;

public class App2 {
    public void mainApp2() {
        File file = new File("src//com//trasodeveloper//javaforbeginners//trywithresources//test.txt");

        //FileReader fr = new FileReader(file);
        //BufferedReader br = new BufferedReader(fr);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }


    }
}
