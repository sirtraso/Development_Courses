package com.trasodeveloper.javaforbeginners.polymorphism;

public class Polymorphism {

    public void mainPolymorphApp() {
        Plant plant1 = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.grow();
        tree.shedLeaves();

        doGrow(tree);
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
