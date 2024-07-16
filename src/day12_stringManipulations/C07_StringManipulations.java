package day12_stringManipulations;

import java.util.Scanner;

public class C07_StringManipulations {

    public static void main(String[] args) {

        //  Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //	- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi girin");
        String isim = scanner.nextLine();
        System.out.println("lütfen soyisminizi girin");
        String soyisim = scanner.nextLine();

        if (isim.length() > soyisim.length()){
            // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            System.out.println(

                    isim.substring(0,1).toUpperCase()
                    + isim.substring(1).toLowerCase()
                    +" " // isim ile soyisim arasinda bir bosluk
                    + soyisim.substring(0,1).toUpperCase()
                    + soyisim.substring(1).toLowerCase()
            );


        }


        if (soyisim.length() > isim.length()){
            // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

            System.out.println(
                    isim.toUpperCase().charAt(0)
                    + isim.substring(1).toLowerCase()
                    + " "
                    + soyisim.toUpperCase()
            );
        }

    }
}
