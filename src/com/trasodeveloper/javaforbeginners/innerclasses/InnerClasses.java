package com.trasodeveloper.javaforbeginners.innerclasses;

public class InnerClasses {
    public void mainInnerClasses() {
        Robot robot = new Robot(7);
        robot.start();

        Robot.Brain brain = robot.new Brain();  //solo si la clase interna es publica
        brain.think();

        Robot.Battery bat = new Robot.Battery();
        bat.charge();
    }
}
