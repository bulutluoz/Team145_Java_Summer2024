package day10_stringManipulations;

import java.util.Scanner;

public class C04_equals {
    public static void main(String[] args) {

        String str1 = "Furkan";
        String str2 = "FURKAN";
        String str3 = "furkan";
        String str4 = "FuRkAn";

        // Verilen iki String'in metin olarak ayni oldugunu kontrol etmek icin equals() kullanilir

        System.out.println( str1.equals(str2)  ); // false
        System.out.println( str2.equals(str3)  ); // false
        System.out.println( str1.equals(str4)  ); // false

        // bir kullanicinin sifresi "Ali1453" tur
        // Kullanicidan bir sifre isteyin
        // girilen sifre dogru ise, "Sisteme giris yapabilirsiniz"
        //               dogru degilse "Sifre yanlis, daha sonra tekrar deneyin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals("Ali1453")){
            System.out.println("Sisteme giris yapabilirsiniz");
        }else System.out.println("Sifre yanlis, daha sonra tekrar deneyin");

    }
}
