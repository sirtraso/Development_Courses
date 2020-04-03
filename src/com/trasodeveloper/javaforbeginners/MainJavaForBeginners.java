package com.trasodeveloper.javaforbeginners;

import com.trasodeveloper.javaforbeginners.Constructors.ConstructorTestApp;
import com.trasodeveloper.javaforbeginners.gettersandreturnvalues.GettersApp;
import com.trasodeveloper.javaforbeginners.methodparameters.MethodParamApp;
import com.trasodeveloper.javaforbeginners.methods.MethodApp;
import com.trasodeveloper.javaforbeginners.settersandthis.SettersThisApp;
import com.trasodeveloper.javaforbeginners.staticandfinal.StaticFinalApp;

public class MainJavaForBeginners {
    public MainJavaForBeginners() {
    }

    public void executeJavaForBeginnersMeethods() {
        /* Content to test:
        * 0 -> Test of (17), (18) -  Class, Methods
        * 1 -> (19) Getters and Return Value
        * 2 -> (20) Method Paramethers
        * 3 -> (21) Setters and "this"
        * 4 -> (22) Constructors
        * 5 ->
        * 6 ->
        * 7 ->
        * ...
        * */
        int codeToTest = 5;  //change this variable to define the class to test.
        this.selectingClass(codeToTest);
    }

    public void selectingClass(int course) {
        switch (course) {
            case 0:
                MethodApp methapp = new MethodApp();
                methapp.mainMethodApp();
                break;
            case 1:
                GettersApp getapp = new GettersApp();
                getapp.mainAppGetters();
                break;
            case 2:
                MethodParamApp medparapp = new MethodParamApp();
                medparapp.methodParamMain();
                break;
            case 3:
                SettersThisApp sta = new SettersThisApp();
                sta.mainSettersThisApp();
                break;
            case 4:
                ConstructorTestApp cta = new ConstructorTestApp();
                cta.ConstructorTest();
                break;
            case 5:
                StaticFinalApp sfa = new StaticFinalApp();
                sfa.staticAndFinalTestApp();
                break;
            default:
                System.out.println("There is no course with that code");
                break;
        }

    }
}
