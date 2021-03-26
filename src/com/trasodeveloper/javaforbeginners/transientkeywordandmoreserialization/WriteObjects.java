package com.trasodeveloper.javaforbeginners.transientkeywordandmoreserialization;

import com.trasodeveloper.javaforbeginners.transientkeywordandmoreserialization.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public void writeObject(String path) {
        System.out.println("Writting objects...");

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path));) {

            Person person = new Person(7, "Bob");
            Person.setCount(88);
            os.writeObject(person);

            //os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
