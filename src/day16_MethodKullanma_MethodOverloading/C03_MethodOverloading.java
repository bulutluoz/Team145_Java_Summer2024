package day16_MethodKullanma_MethodOverloading;

public class C03_MethodOverloading {

    public static void main(String[] args) {

        /*
            Bir class'da ISMI AYNI ama SIGNATURE"I farkli method'lar olusturulmasina
            OVERLOADING denir

            Java'da bir method cagrildiginda, eger ayni isimde birden fazla method varsa
            Java argument'lerle parametrelerin uyumuna bakar

            Java'da bir class icerisinde ayni isimde birden fazla method olusturulabilir
            ANCAK bu method'larin SIGNATURE'lari farkli olmalidir

            Method Signature = method adi + parametrelerin data turleri

            Eger method call'daki signature'a UYGUN bir method yoksa
            CTE olusur, Java kodu kirmizi cizer ve kod calismaz
         */

        String str = "Java Candir";

        System.out.println(str.substring(3)); // a Candir

        System.out.println(str.substring(3, 7)); // a Ca

        topla(3,7);
        // Iki int sayinin toplami : 10

        topla(5,4.8);
        // int ve double iki sayinin toplami : 9.8

        topla(2.4,5); // topla double int
        // double ve int iki sayinin toplami : 7.4

        // topla(2.4,4.3); // topla double double


    }

    public static void topla(int sayi1 , int sayi2){

        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    }// topla int int

    public static void topla (int sayi1 , double sayi2){

        System.out.println("int ve double iki sayinin toplami : " +  (sayi1+sayi2));
    }// topla int double

    public static void topla(int sayi1 , int sayi2, int sayi3 ){

        System.out.println("Uc int sayinin toplami : " + (sayi1+sayi2+sayi3));
    }// topla int int int

    public static void topla(double a , int b){
        System.out.println("double ve int iki sayinin toplami : " + (a+b));
    } // topla double int

}
