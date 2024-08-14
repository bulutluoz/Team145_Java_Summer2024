package day33_ConstructorCall;

public class C05_GP {
    C05_GP(){
        System.out.println("GP parametresiz constructor calisti");
    }

    C05_GP(String s){
        this(4);
        System.out.println("GP String parametreli constructor calisti");
    }

    C05_GP(int a){
        System.out.println("GP int parametreli constructor calisti");
    }
}
