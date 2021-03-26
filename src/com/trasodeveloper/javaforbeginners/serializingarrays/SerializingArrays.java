package com.trasodeveloper.javaforbeginners.serializingarrays;

public class SerializingArrays {
    public void mainSerialArrays() {
        String path = "src//com//trasodeveloper//javaforbeginners//serializingarrays//testfile.ser";
        WriteObjects wo = new WriteObjects();
        wo.writeObject(path);

        ReadObjects ro = new ReadObjects();
        ro.readObject(path);
    }
}
