package com.trasodeveloper.javaforbeginners.transientkeywordandmoreserialization;

public class TransientKeyword {

    public void mainTransientKeyword() {
        String path = "src//com//trasodeveloper//javaforbeginners//transientkeywordandmoreserialization//testtansientkey.ser";
        WriteObjects wo = new WriteObjects();
        wo.writeObject(path);

        ReadObjects ro = new ReadObjects();
        ro.readObject(path);
    }
}
