package com.trasodeveloper.javaforbeginners.methodparameters;

class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }

    public void move(String direction, double distance) {
        System.out.println("Moving: " +  direction + ", distance: " + distance);
    }
}

public class MethodParamApp {
    public void methodParamMain() {
        Robot wall_e = new Robot();
        wall_e.speak("Hi, I'm Wall-e");
        wall_e.jump(7);
        wall_e.move("West", 12.2);

        String greetings = "Hello there!";
        wall_e.speak(greetings);

        int value = 14;
        wall_e.jump(value);

    }
}
