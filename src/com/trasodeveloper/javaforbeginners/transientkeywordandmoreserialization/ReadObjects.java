package com.trasodeveloper.javaforbeginners.transientkeywordandmoreserialization;

import com.trasodeveloper.javaforbeginners.transientkeywordandmoreserialization.Person;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
    public void readObject(String path) {
        System.out.println("Reading objects...");

        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(path))) {

            Person person = (Person)os.readObject();
            System.out.println(person);

            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
