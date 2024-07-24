package day16_methodKullanma_MethodOverloading;

import java.util.Scanner;

public class C08_WhileLoop {

    public static void main(String[] args) {

        // kullaniciya istedigi kadar pozitif sayi girmesini soyleyin
        // girilen sayilar pozitif ise sayiyi toplama ekleyin
        // girilen sayi negatif ise uyari verin ve sayiyi isleme almayin
        // girilen sayi 0 oldugunda islemi bitirin
        // ve kac tane pozitif sayi girildigini
        // ve toplamlarinin kac oldugunu yazdirin


        Scanner scanner = new Scanner(System.in);

        int sayi = 34 ; // 0'in disinda herhangi bir deger
        int toplam = 0;
        int sayac = 0;

        while( sayi != 0 ){

            // kullanicidan sayi isteyelim
            System.out.println("Lutfen pozitif bir tamsayi giriniz, bitirmek icin 0'a basiniz");
            sayi = scanner.nextInt();

            if (sayi > 0){

                toplam += sayi;
                sayac++;
            } else if ( sayi < 0) {

                System.out.println("Girdiginiz sayi pozitif olmali");
            }


        }

        System.out.println("Girdiginiz " + sayac + " adet pozitif tamsayinin toplami : " + toplam);


    }
}
