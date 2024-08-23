package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_KullanicidanToplanacakSayiAlma {

    // Kullanicidan toplanmak uzere sayilar isteyin
    // Kullanici sayi girisini bitirmek icin Q'ya basmalidir

    // Kullanici Q'ya bastiginda kac adet sayi girildigini
    // ve girilen sayilarin toplamini yazdirin

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double girilenSayi = 0;
        double girilenSayilarinToplami = 0;
        String girilenMetin = "";

        while ( ! girilenMetin.equalsIgnoreCase("Q")  ){ // calisma sarti

            scanner = new Scanner(System.in);

            System.out.println("Toplanmak uzere sayi giriniz...\nBitirmek icin Q'ya basiniz");

            try {
                girilenSayi = scanner.nextDouble(); // kullanici double disinda herhangi bir sey girerse exception olusur
                girilenSayilarinToplami += girilenSayi;

            } catch (InputMismatchException e) {

                girilenMetin = scanner.nextLine();

                if (!girilenMetin.equalsIgnoreCase("Q")){
                    System.out.println("Ya sayi girin ya da Q'ya basin :) ");
                }

            }

        }

        System.out.println("Girilen sayilarin toplami : " + girilenSayilarinToplami);

    }


}
