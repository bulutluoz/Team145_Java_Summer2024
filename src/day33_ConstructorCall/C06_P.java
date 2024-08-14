package day33_ConstructorCall;

public class C06_P extends C05_GP {

    C06_P(){
        System.out.println("P parametresiz constructor calisti");
    }

    C06_P(String s){
        this();
        System.out.println("P String parametreli constructor calisti");
    }

    C06_P(int a){
        super("Veli");
        System.out.println("P int parametreli constructor calisti");
    }
}
