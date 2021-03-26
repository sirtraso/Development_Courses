package com.trasodeveloper.javaforbeginners;

import com.trasodeveloper.javaforbeginners.Constructors.ConstructorTestApp;
import com.trasodeveloper.javaforbeginners.abstractclasses.AbstractClasses;
import com.trasodeveloper.javaforbeginners.anonymousclases.AnonymousClasses;
import com.trasodeveloper.javaforbeginners.castingnumericalvalues.CastingNumericalValues;
import com.trasodeveloper.javaforbeginners.creatingwritingtextfiles.CreatingWritingTextFiles;
import com.trasodeveloper.javaforbeginners.encapsulationapidocs.EncapAndAPIDocs;
import com.trasodeveloper.javaforbeginners.enumtypes.EnumTypes;
import com.trasodeveloper.javaforbeginners.equalsmethod.EqualsMethod;
import com.trasodeveloper.javaforbeginners.genericswildcards.GenericsWildcards;
import com.trasodeveloper.javaforbeginners.gettersandreturnvalues.GettersApp;
import com.trasodeveloper.javaforbeginners.handingexcpetions.demo1.HandingExceptions;
import com.trasodeveloper.javaforbeginners.handingexcpetions.demo2.HandingException;
import com.trasodeveloper.javaforbeginners.inheritance.InheritanceApp;
import com.trasodeveloper.javaforbeginners.innerclasses.InnerClasses;
import com.trasodeveloper.javaforbeginners.interfaces.InterfacesApp;
import com.trasodeveloper.javaforbeginners.methodparameters.MethodParamApp;
import com.trasodeveloper.javaforbeginners.methods.MethodApp;
import com.trasodeveloper.javaforbeginners.multipleexceptions.MultipleExceptions;
import com.trasodeveloper.javaforbeginners.packages.PackagesApp;
import com.trasodeveloper.javaforbeginners.passingbyvalue.PassingByValue;
import com.trasodeveloper.javaforbeginners.polymorphism.Polymorphism;
import com.trasodeveloper.javaforbeginners.publicprivateprotected.PermissionApp;
import com.trasodeveloper.javaforbeginners.readingfilesfilereader.ReadingFilesFileReader;
import com.trasodeveloper.javaforbeginners.readingfileswithscanner.ReadingFilesScanner;
import com.trasodeveloper.javaforbeginners.recursionusefultrickupyoursleeve.RecursionTrick;
import com.trasodeveloper.javaforbeginners.runtimecheckedexceptions.RuntimeCheckedExceptions;
import com.trasodeveloper.javaforbeginners.serializationsavingobjects.SerializationSavingObjects;
import com.trasodeveloper.javaforbeginners.serializingarrays.SerializingArrays;
import com.trasodeveloper.javaforbeginners.settersandthis.SettersThisApp;
import com.trasodeveloper.javaforbeginners.staticandfinal.StaticFinalApp;
import com.trasodeveloper.javaforbeginners.stringbuildersandformatting.StringBuildersAndFormattingApp;
import com.trasodeveloper.javaforbeginners.thetostring.TheToStringApp;
import com.trasodeveloper.javaforbeginners.transientkeywordandmoreserialization.TransientKeyword;
import com.trasodeveloper.javaforbeginners.trywithresources.TryWithResource;
import com.trasodeveloper.javaforbeginners.upcastingdowncasting.UpcastDowncast;
import com.trasodeveloper.javaforbeginners.usinggenerics.UsingGenerics;

import java.io.FileNotFoundException;

public class MainJavaForBeginners {
    public MainJavaForBeginners() {
    }

    public void executeJavaForBeginnersMethods() {
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
        * 11 -> (29) Public, Private, Protected
        * 12 -> (30) Polymorphism
        * 13 -> (31) Encapsulation and t    he API Docs
        * 14 -> (32) Casting Numerical Values
        * 15 -> (33) Upcasting and Downcating
        * 16 -> (34) Using Generics
        * 17 -> (35) Generics and Wildcards
        * 18 -> (36) Anonymous Classes
        * 19 -> (37) Reading Files Using Scanner
        * 20 -> (38) Hanging Exception
        * 21 -> (39) Multipe Exceptions
        * 22 -> (40) Runtime vs Checked Exceptions
        * 23 -> (41) Abstract Classes
        * 24 -> (42) Reading Files With File Reader
        * 25 -> (43) Try with resources
        * 26 -> (44) Creating and Writing Text Files
        * 27 -> (45) The Equals Method
        * 28 -> (46) Inner Classes
        * 29 -> (47) Enum Types: Basic and Advanced Usage
        * 30 -> (48) Recursion: A Useful Trick Up Your Sleeve
        * 31 -> (49) Serialization: Saving Objects to Files
        * 32 -> (50) Serializing Arrays
        * 33 -> (51) The Transient keyword and More Serialization
        * 34 -> (52) Passing by Value
        * ...
        * */
        int codeToTest = 34;  //change this variable to define the class to test.
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
                medparapp.mainMethodParam();
                break;
            case 3:
                SettersThisApp sta = new SettersThisApp();
                sta.mainSettersThisApp();
                break;
            case 4:
                ConstructorTestApp cta = new ConstructorTestApp();
                cta.mainConstructorTest();
                break;
            case 5:
                StaticFinalApp sfa = new StaticFinalApp();
                sfa.mainStaticAndFinalTestApp();
                break;
            case 6:
                 StringBuildersAndFormattingApp sbfa = new StringBuildersAndFormattingApp();
                 sbfa.mainStringBuildersTestApp();
                break;
            case 7:
                TheToStringApp ttsa = new TheToStringApp();
                ttsa.mainTheToString();
                break;
            case 8:
                InheritanceApp inapp = new InheritanceApp();
                inapp.mainInheritanceApp();
                break;
            case 9:
                PackagesApp papp = new PackagesApp();
                papp.mainPackagesApp();
                break;
            case 10:
                InterfacesApp intapp = new InterfacesApp();
                intapp.mainInterfacesApp();
                break;
            case 11:
                PermissionApp permapp = new PermissionApp();
                permapp.mainPermissionApp();
                break;
            case 12:
                Polymorphism poly = new Polymorphism();
                poly.mainPolymorphApp();
                break;
            case 13:
                EncapAndAPIDocs ea_docs = new EncapAndAPIDocs();
                ea_docs.mainEncapsuleAPIDocs();
                break;
            case 14:
                CastingNumericalValues cnv = new CastingNumericalValues();
                cnv.mainCastNumvalues();
                break;
            case 15:
                UpcastDowncast udc = new UpcastDowncast();
                udc.mainUpcatingDowncasting();
                break;
            case 16:
                UsingGenerics ug = new UsingGenerics();
                ug.mainUsingGenerics();
                break;
            case 17:
                GenericsWildcards gwc = new GenericsWildcards();
                gwc.mainGenericsWildCards();
                break;
            case 18:
                AnonymousClasses ac = new AnonymousClasses();
                ac.mainAnonymousClasses();
                break;
            case 19:
                ReadingFilesScanner rfs = new ReadingFilesScanner();
                rfs.mainScannerFiles();
                break;
            case 20:
                /*HandingExceptions hex = new HandingExceptions();
                try {
                    hex.mainHangingException();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }*/
                HandingException hex = new HandingException();
                hex.mainHangingException();
                break;
            case 21:
                MultipleExceptions me = new MultipleExceptions();
                me.mainMultipleEx();
                break;
            case 22:
                RuntimeCheckedExceptions rce = new RuntimeCheckedExceptions();
                rce.mainRTeCe();
                break;
            case 23:
                AbstractClasses absc = new AbstractClasses();
                absc.mainAbstractClasesApp();
                break;
            case 24:
                ReadingFilesFileReader rffr = new ReadingFilesFileReader();
                rffr.mainFilesReader();
                break;
            case 25:
                TryWithResource twr = new TryWithResource();
                twr.mainTryResource();
                break;
            case 26:
                CreatingWritingTextFiles cwtf = new CreatingWritingTextFiles();
                cwtf.mainCWTextFiles();
                break;
            case 27:
                EqualsMethod em = new EqualsMethod();
                em.mainEqualsMethod();
                break;
            case 28:
                InnerClasses ic = new InnerClasses();
                ic.mainInnerClasses();
                break;
            case 29:
                EnumTypes et = new EnumTypes();
                et.mainEnumTypes();
                break;
            case 30:
                RecursionTrick rutu = new RecursionTrick();
                rutu.mainRecursion();
                break;
            case 31:
                SerializationSavingObjects sso = new SerializationSavingObjects();
                sso.mainSerializationSO();
                break;
            case 32:
                SerializingArrays sa = new SerializingArrays();
                sa.mainSerialArrays();
                break;
            case 33:
                TransientKeyword tk = new TransientKeyword();
                tk.mainTransientKeyword();
                break;
            case 34:
                PassingByValue pbv = new PassingByValue();
                pbv.mainPassingByValue();
                break;
            default:
                System.out.println("There is no course with that code");
                break;
        }

    }
}
