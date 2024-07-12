package day10_stringManipulations;

public class C07_substring2 {
    public static void main(String[] args) {

        String str = "Ahmet hocadan ders alip ogrenemeyen var mi";

        System.out.println(str.substring(6)); // hocadan ders alip ogrenemeyen var mi

        System.out.println(str.substring(0, 7)); // Ahmet h

        /*
            java'da genel olarak
            baslangic index'leri DAHIL
            bitis index'leri HARIC'tir
         */

        System.out.println(str.substring(2,4)); // me


        System.out.println(str.substring(3,4) ); // e  bize String olarak e verir, method'lari kullanabiliriz
        System.out.println(str.charAt(3)      );// e bize char olarak e verir


        System.out.println(str.substring(4, 4)); // hiclik

        // System.out.println( str.substring( 5,2) ); // StringIndexOutOfBoundsException

        // bastan 10 karakteri yazdirin
        System.out.println(str.substring(0,10)); // Ahmet hoca

        // 15.index'den baslayip, 8 karakter yazdirin
        System.out.println(str.substring(15,23)); // ers alip



    }
}
