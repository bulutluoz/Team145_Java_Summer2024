package day10_stringManipulations;

import java.util.Scanner;

public class C05_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 = "Furkan";
        String str2 = "FURKAN";
        String str3 = "furkan";
        String str4 = "FuRkAn";
        String str5 = "furkan ";

        // Verilen iki String'in buyuk-kucuk harf onemli olmaksizin
        // metin olarak ayni oldugunu kontrol etmek icin equalsIgnoreCase() kullanilir

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str2.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str4)); // true
        System.out.println(str3.equalsIgnoreCase(str5));// false


        // kullaniciya gun ismini sorun
        // kullanici cumartesi girerse "Ohhhh bugun yan gel yat" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz..");
        String girilenGunismi = scanner.nextLine();

        if (girilenGunismi.equalsIgnoreCase("cumartesi")){
            System.out.println("Ohhhh bugun yan gel yat");
        }
    }
}
