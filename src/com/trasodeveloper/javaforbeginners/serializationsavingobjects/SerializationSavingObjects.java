package com.trasodeveloper.javaforbeginners.serializationsavingobjects;

public class SerializationSavingObjects {
    public void mainSerializationSO() {
        String path = "src//com//trasodeveloper//javaforbeginners//serializationsavingobjects//people.bin";
        WriteObjects wr = new WriteObjects();
        wr.writeObject(path);

        ReadObjects re = new ReadObjects();
        re.readObject(path);
    }
}
