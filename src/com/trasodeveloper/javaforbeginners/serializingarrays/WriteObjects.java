package com.trasodeveloper.javaforbeginners.serializingarrays;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;
import com.trasodeveloper.javaforbeginners.serializationsavingobjects.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
    public void writeObject(String path) {
        System.out.println("Writting objects...");

        Person [] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob"), new Person(12, "Jim")};

        ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream(path); ObjectOutputStream os = new ObjectOutputStream(fs);) {
            os.writeObject(people);
            os.writeObject(peopleList);

            os.writeInt(peopleList.size());

            for (Person person : peopleList) {
                os.writeObject(person);
            }

            //os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
