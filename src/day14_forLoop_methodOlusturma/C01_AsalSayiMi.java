package day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C01_AsalSayiMi {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        for (int i = 2; i < sayi ; i++) {

            if ( sayi % i == 0 ){
                System.out.println("Girilen sayi asal degil");
                asalMi = false;
                break; // loop'u bitirir
                // boylece ilk bolen sayida asal olmadigini yazdirir
                // ve geriye kalan sayilari denemez
                // bu da zaman kazanci saglar
            }
        }

        if ( asalMi ){ // asalMi == true
            System.out.println("Girilen sayi asal");
        }

        // EGER flag olarak boolean bir variable secersek
        // if parantezi icinde sadece boolean flag variable'ini
        // yazmak yeterli olur

    }
}
