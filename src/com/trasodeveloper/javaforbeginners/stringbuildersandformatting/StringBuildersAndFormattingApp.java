package com.trasodeveloper.javaforbeginners.stringbuildersandformatting;

public class StringBuildersAndFormattingApp {

    public void stringBuildersTestApp() {
        //Codigo ineficiente
        String info = "";

        info += "My name is Batman";
        info += " ";
        info += "I live in a cave";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Superman");
        sb.append(" ");
        sb.append("I live in a Farm on Smallville");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("My name is Acuaman")
                .append(" ")
                .append("I live in the sea");

        System.out.println(s.toString());

        /////// Formatting //////////////

        System.out.print("Here is some text.\t That was a tab.\nThat was a newline.");
        System.out.println("More Text");

        //formatting integers
        System.out.printf(" Total cost %-10d, quantity is %d\n", 5, 120);

        for (int i=0; i<20; i++) {
            System.out.printf("%-2d: %s\n", i, "some text here");
        }

        //Formatting floating point value
        System.out.printf("Total value: %.2f\n",  5.64564);
        System.out.printf("Total value: %-8.1f\n",343.234543);
    }
}
