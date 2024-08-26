package day40_exceptions;

import java.util.Scanner;

public class C09_KontrolluExceptionFirlatma {

    public static void main(String[] args) {

        // Kod'un herhangi bir satirinda kontrollu olarak exception firlatilabilir
        // Kontrollu bir sekilde baska bir bolume gecis veya
        // kullaniciya istenen mesaji iletme olabilir

        // kullanicidan yasini isteyin
        // 65 ve yukarisi ise emekli olabilir, 65 yas alti emekli olamaz
        // kullanici 20 yasdan kucuk veya 80 yasindan buyuk deger girerse
        // hata mesaji verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        try {

            if (yas <20 || yas >80){
                System.out.println("Bu yas icin emeklilik hesaplanamaz");
                throw new IllegalArgumentException();
            } else if (yas >= 65) {
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsin");
            }

            System.out.println("hatali giris yapilirsa bu satirlar atlansin");
            System.out.println("hatali giris yapilirsa bu satirlar atlansin");
            System.out.println("hatali giris yapilirsa bu satirlar atlansin");

        } catch (Exception e) {
            System.out.println("Istenen satirlari atlayip buraya geldi");
        }
    }
}
