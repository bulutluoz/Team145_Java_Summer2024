package day04_dataCasting_wrapperClasses;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        // non-primitive data turleri hem deger, hem de hazir method'lar barindirirlar

        System.out.println(str.toUpperCase()); // JAVA CANDIR


        // primitive data turleri icin hazir method'lar YOKTUR

        int sayi = 10;

        // Java primitive data turlerinde bazi hazir method'lar kullanabilmemiz icin
        // WRAPPER CLASS'lari olusturmustur
        // boolean, char     , byte, short, int    , long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        Integer sayiWrapper = sayi;
        sayi = sayiWrapper;

        // primitive variable'lar ile ayni data turunun wrapper class'indaki variable'lar arasinda
        // gecis mumkundur

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768


        String fiyat1 = "23";
        String fiyat2 = "45";

        // iki urunun fiyatini toplayin

        System.out.println( fiyat1 + fiyat2 ); // 2345

         int sonuc = Integer.parseInt(fiyat1) + Integer.parseInt(fiyat2);

        System.out.println("Iki urunun toplam fiyati : " + sonuc); // Iki urunun toplam fiyati : 68

        char chr1 = 'c';
        //chr1'i buyuk harf olarak yazdirin

        System.out.println(Character.toUpperCase(chr1)); // C


        char chr2 = 'M';
        //chr2'yi kucuk harf olarak yazdirin

        System.out.println(Character.toLowerCase(chr2)); // m





    }
}
