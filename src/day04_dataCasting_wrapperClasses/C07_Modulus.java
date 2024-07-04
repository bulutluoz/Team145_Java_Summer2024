package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C07_Modulus {

    public static void main(String[] args) {

        System.out.println( 85 % 6 ); // 1

        System.out.println( 28 % 8 ); // 4

        System.out.println( 28 / 8 ); // 3

        System.out.println( 1276 % 10 ); // 6

        System.out.println( 1276 / 10 ); // 127


        // kullanicidan bir tamsayi isteyin girilen sayinin birler basamagini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        System.out.println( "Girdiginiz sayinin birler basamagi : " + girilenSayi % 10);

        // girilen sayinin cift olup olmadigini kontrol etmek icin
        // girilenSayi % 2 = 0 ise cifttir, sifira esit degilse tektir

        // girilen sayinin 5'e bolunup bolunmedigini kontrol etmek icin
        // girilenSayi % 5 = 0 ise sayi 5'e tam bolunur, sifira esit degilse 5'e tam bolunmuyor

    }
}
