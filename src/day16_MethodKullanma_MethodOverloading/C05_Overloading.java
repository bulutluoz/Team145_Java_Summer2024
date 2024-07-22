package day16_MethodKullanma_MethodOverloading;

public class C05_Overloading {

    public static void main(String[] args) {

        // Java method call'daki signature'a %100 uyumlu olan bir method bulamazsa
        // auto-widening kullanarak calistirabilecegi method var mi diye kontrol eder
        // ve varsa calistirir

        topla(3,4); // topla int int
        // Iki double'in toplami : 7.0

        topla(3.1f ,4.5); // topla float double
        // Iki double'in toplami : 7.599999904632568

        topla('a','b'); // topla char char
        // 195.0

        // topla("a","b");

        // topla(true,false);


    }


    public static void topla(double a, double b){ // topla double double

        System.out.println("Iki double'in toplami : " + (a+b));
    }
}
