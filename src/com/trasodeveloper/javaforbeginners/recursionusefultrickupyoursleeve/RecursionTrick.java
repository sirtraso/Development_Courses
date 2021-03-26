package com.trasodeveloper.javaforbeginners.recursionusefultrickupyoursleeve;

public class RecursionTrick {
    public void mainRecursion() {
        //Ejem. Factorial 4 = 4*3*2*1
        int value = 4;
        System.out.println(factorial(value));
    }

    private static int factorial(int value) {
        //value = value -1;
        System.out.println(value);
        if (value == 1) {
            return 1;
        }
        return factorial(value - 1) * value;
    }
}
