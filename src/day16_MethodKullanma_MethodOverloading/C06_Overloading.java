package day16_MethodKullanma_MethodOverloading;

public class C06_Overloading {

    public static void main(String[] args) {


    }

    public static void topla(int sayi){ // topla int

        System.out.println("Tek integer : " + (sayi + sayi));

    }//1  topla int

    public static void topla(int a, int b){ // topla int int

        System.out.println("int int : " + (a+b));
    }//2  topla int int

    public static void topla(double c, int d){ // topla double int

        System.out.println("double int : " + (c+d));
    }//3 topla double int

    public static void topla(float c, int d){ // topla float int

        System.out.println("float int : " + (c+d));
    }//4 topla float int

    public static void topla(double c, double d){ // topla double double

        System.out.println("double double : " + (c+d));
    }//5 topla double double


}
