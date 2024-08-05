package day26_constructors_staticKeyword;

public class C02_StaticBlock {

    /*
        Bir class'da static block varsa
        herseyden (hatta main method'dan bile) once calisir

        class calismaya baslamadan once yapilmasi gereken islemler varsa
        static block bu islemleri yapmak icin kullanilir

        bir class'da birden fazla static block varsa
        KENDI ICLERINDE once ustteki calisir
     */



    C02_StaticBlock(){

        System.out.println("Constructor calisti");

    }

    static {
        System.out.println("2.static block calisti");
    }

    static {
        System.out.println("static blok calisti");
    }



    public static void main(String[] args) {

        System.out.println("main method calisti");



    }


    public static void method1(){
        System.out.println("method1 calisti ");
    }
}
