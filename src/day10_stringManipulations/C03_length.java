package day10_stringManipulations;

import java.util.Scanner;

public class C03_length {

    public static void main(String[] args) {

        /*
            Dikkat edilecekler
            1- Karakter sayisi = son harfin index'i + 1
               son harfin index'i = length -1

            2- String'de olmayan bir index'deki karakteri yazdirmak istersek
               Java StringIndexOutOfBoundsException verir

            3- bastan n. karakter icin  str.charAt(n-1)
               sondan m. karakter icin str.charAt( str.length() - m ) kullanilir

         */

        String str = "Java is the King";

        // str'daki karakter sayisi : 16
        // str'daki son harfin indeksi : 16 - 1

        System.out.println(str.charAt(16-1)); // g
        System.out.println(str.charAt(15)); // g

        // sondan 3.karakteri yazdirin
        System.out.println(str.charAt(16-3)); // i
        System.out.println(str.charAt(13));


        // Bir String'deki karakter sayisini bulmak icin length() kullanilir

        System.out.println(str.length()); // 16

        // Kullanicdan bir metin alip
        // metindek bastan 2. ve sondan 3. karakterleri yan yana yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String girilenMetin = scanner.nextLine();


        System.out.println( "" + girilenMetin.charAt(1) + girilenMetin.charAt(girilenMetin.length()-3) );

    }
}
