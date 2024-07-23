package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_BasariliSifreAlma {

    public static void main(String[] args) {

        // day12 C08'de yaptigimiz sifre kontrolu sorusunu
        // sifre basarisiz oldugunda hatalari yazdirip, false donen
        // sifre basarili oldugunda ise true donen bir method haline getirin
        //        System.out.println(sifreKontrolEt("Sa gd")); // false
        //        System.out.println(sifreKontrolEt("agsgsjsjk90876")); // true

        // olusturdugunuz methodu kullanarak
        // kullanici hatasiz bir sifre girinceye kadar tekrar tekrar sifre isteyin
        // kabul edilebilir bir sifre girdiginde "Sifreniz basarili olarak kaydedildi" yazdirin

        Scanner scanner = new Scanner(System.in);
        String sifre = "";
        boolean sifreUygunMu = false;

        while ( !sifreUygunMu ){  // sifreUygunMu == false

            System.out.println("Lutfen sifrenizi giriniz...");
            sifre = scanner.nextLine(); // ali can ==> Alican1234 ==> aliCan1234

            sifreUygunMu = sifreKontrolEt(sifre);

        }

        System.out.println("Sifreniz basarili olarak kaydedildi");




    }

    public static boolean sifreKontrolEt(String sifre){

        int hataSayaci = 0;

        //  - ilk harf kucuk harf olmali
        if (  ! Character.isLowerCase(sifre.charAt(0))  ){
            System.out.println("Ilk karakter kucuk harf olmali");
            hataSayaci++;
        }

        //  - son karakter rakam olmali
        if ( ! Character.isDigit( sifre.charAt( sifre.length()-1)  )  ){
            System.out.println("Son karakter rakam olmali");
            hataSayaci++;
        }

        //  - sifre bosluk icermemeli
        if ( sifre.contains(" ")){
            System.out.println("Sifre bosluk barindiramaz");
            hataSayaci++;
        }

        //  - uzunlugu en az 10 karakter olmali
        if (sifre.length() < 10){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            hataSayaci++;
        }

        if (hataSayaci == 0 ){
            return true;
        }else {
            return false;
        }

    }
}
