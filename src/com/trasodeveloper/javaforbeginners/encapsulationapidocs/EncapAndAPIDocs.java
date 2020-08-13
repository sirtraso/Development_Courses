package com.trasodeveloper.javaforbeginners.encapsulationapidocs;

class Plant {
    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "some stuff" + calulateGrowthForecast();
        return data;
    }

    private int calulateGrowthForecast() {
        return 9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapAndAPIDocs {

    public void mainEncapsuleAPIDocs() {

    }
}
