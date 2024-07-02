package day02_variable_scanner;

import java.util.Scanner;

public class C08_Scanner {

    public static void main(String[] args) {

        // kullanicidan ismini isteyin


        // Kullanicidan bilgiyi istemek icin Scanner class'ini kullaniriz
        // bilgiyi kullanicidan alip, kod dunyasinda kaydetmek icin 3 adim atmamiz gerekir
        // 1.adim : Scanner class'indan bir obje olusturalim

        Scanner scanner = new Scanner(System.in);

        // 2.adim kullaniciya ne istediginizi yazdirin
        System.out.println("Lutfen isminizi giriniz...");

        // 3.adim kullanicidan istedigimiz bilgiye uygun bir variable olusturup
        //        scanner objesi ile girilen bilgiye uygun next method'u kullanarak
        //        kullanicinin konsoldan girdigi bilgiyi alip, kod dunyasinda kaydederiz

        String girilenIsim = scanner.nextLine();


        // ismini buyuk harfe cevirip, yeni haliyle kaydedin

        girilenIsim = girilenIsim.toUpperCase();

        // ve islem sonucunda "Girilen isim : MEHMET AVCI" seklinde konsolda yazdirin

        System.out.println( "Girilen isim : " + girilenIsim);

    }
}
