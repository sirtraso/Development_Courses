package com.trasodeveloper.javaforbeginners.multipleexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {

    public void mainMultipleEx() {
        Test test = new Test();
        /*
        //first form
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
         */

        //Second form
        /*try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }*/

        //Third Form
        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            test.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
