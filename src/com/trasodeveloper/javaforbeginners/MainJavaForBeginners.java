package com.trasodeveloper.javaforbeginners;

import com.trasodeveloper.javaforbeginners.Constructors.ConstructorTestApp;
import com.trasodeveloper.javaforbeginners.gettersandreturnvalues.GettersApp;
import com.trasodeveloper.javaforbeginners.inheritance.InheritanceApp;
import com.trasodeveloper.javaforbeginners.interfaces.InterfacesApp;
import com.trasodeveloper.javaforbeginners.methodparameters.MethodParamApp;
import com.trasodeveloper.javaforbeginners.methods.MethodApp;
import com.trasodeveloper.javaforbeginners.packages.PackagesApp;
import com.trasodeveloper.javaforbeginners.settersandthis.SettersThisApp;
import com.trasodeveloper.javaforbeginners.staticandfinal.StaticFinalApp;
import com.trasodeveloper.javaforbeginners.stringbuildersandformatting.StringBuildersAndFormattingApp;
import com.trasodeveloper.javaforbeginners.thetostring.TheToStringApp;

public class MainJavaForBeginners {
    public MainJavaForBeginners() {
    }

    public void executeJavaForBeginnersMeethods() {
        /* Content to test:
        * 00 -> Test of (17), (18) -  Class, Methods
        * 01 -> (19) Getters and Return Value
        * 02 -> (20) Method Paramethers
        * 03 -> (21) Setters and "this"
        * 04 -> (22) Constructors
        * 05 -> (23) Static (and Final)
        * 06 -> (24) String Builder and String Formatting
        * 07 -> (25) The toString Method
        * 08 -> (26) Inheritance
        * 09 -> (27) Packages
        * 10 -> (28) Interfaces
        * ...
        * */
        int codeToTest = 10;  //change this variable to define the class to test.
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
             case 6:
                 StringBuildersAndFormattingApp sbfa = new StringBuildersAndFormattingApp();
                 sbfa.stringBuildersTestApp();
                break;
            case 7:
                TheToStringApp ttsa = new TheToStringApp();
                ttsa.theToStringMainMethod();
                break;
            case 8:
                InheritanceApp inapp = new InheritanceApp();
                inapp.mainInheritanceApp();
                break;
            case 9:
                PackagesApp papp = new PackagesApp();
                papp.packagesAppMain();
                break;
            case 10:
                InterfacesApp intapp = new InterfacesApp();
                intapp.interfacesMainApp();
                break;
            default:
                System.out.println("There is no course with that code");
                break;
        }

    }
}
