package com.trasodeveloper.javaforbeginners.trywithresources;

class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        throw new Exception("oh no!");
    }
}

public class TryWithResource {
    public void mainTryResource() {
        /*Temp temp = new Temp();
        try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*     //así se usa el try with resource
        try(Temp temp = new Temp()) {

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        App2 app = new App2();
        app.mainApp2();

    }
}
