package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_SayiToplama {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullanicinin girdigi pozitif sayilarin toplami 500 veya daha fazla oldugunda
        // toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici 0 veya negatif sayi girerse "sayi pozitif olmalidir " yazdirin
        // ve girilen uygun olmayan sayiyi sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while ( toplam < 500){ // ( ) icine hangi durumda calismaya devam edecegini yaziyoruz

            System.out.println("Lutfen toplanmak uzere pozitif bir tamsayi giriniz...");
            sayi = scanner.nextInt();

            if (sayi>0){

                toplam += sayi;
                sayac++;
            }else { // sayi 0 veya negatif
                System.out.println("sayi pozitif olmalidir");
            }

        }

        System.out.println("Girdiginiz "+sayac + " adet pozitif tamsayinin toplami : " + toplam);
    }
}
