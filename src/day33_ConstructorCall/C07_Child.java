package day33_ConstructorCall;

public class C07_Child extends C06_P {

    C07_Child(){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");
    }

    C07_Child(String s){
        super(5);
        System.out.println("C String parametreli constructor calisti");
    }

    C07_Child(int a){
        System.out.println("C int parametreli constructor calisti");
    }

}
