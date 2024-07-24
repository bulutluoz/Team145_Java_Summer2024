package day16_methodKullanma_MethodOverloading;

import day15_methodOlusturmaVeKullanma.C02_MethodOlusturma;

import java.util.Scanner;

public class C02_FaktoryelHesaplama {

    public static void main(String[] args) {
        // Verilen pozitif tamsayinin faktoryel degerini bize donduren bir method olusturun.
        // 6! = 6 * 5 * 4 * 3 * 2 * 1 ==> 720


        C02_MethodOlusturma.faktoryelDegeriYazdir(6);  // 6! = 720

        // Kullanicidan pozitif bir tamsayi alip
        // sayi ile sayinin faktoryel degerini toplayip sayi variable'ina atayin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        sayi = sayi + faktoryelDegeriDondur(sayi);

        // 23.satirda method calisip sayinin faktoryel degerini getirir
        // toplama ve atama islemi yapilip sayi degeri degisir
        // ama biz konsolda goremeyiz, cunku yazdirmadik



    }

    public static int faktoryelDegeriDondur( int sayi ){

        int faktoryelDegeri = 1;

        for (int i = 1; i <=sayi ; i++) {

            faktoryelDegeri *= i;

        }

        return faktoryelDegeri;
    }
}


