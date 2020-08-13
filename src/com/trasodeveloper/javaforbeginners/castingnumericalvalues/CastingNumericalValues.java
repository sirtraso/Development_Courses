package com.trasodeveloper.javaforbeginners.castingnumericalvalues;

public class CastingNumericalValues {

    public void mainCastNumvalues() {
        byte byteValue = 20;
        short shortvalue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.3f;  //la f al final para el float
        float floatValue2 = (float) 99.3; //alternativa a float sin la f
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;

        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        // intValue = floatValue;  // es erroneo por que no es compatible al perder el punto decimal
        intValue = (int) floatValue; // es correcto, forza la perdida del punto decimal
        System.out.println(intValue);

        //the following won't work as we expect it to!
        // 128 is too big for a byte.
        byteValue = (byte) 128;
        System.out.println(byteValue);


    }
}
