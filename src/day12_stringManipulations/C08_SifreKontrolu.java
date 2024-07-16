package day12_stringManipulations;

import java.util.Scanner;

public class C08_SifreKontrolu {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyip,
        // asagidaki sartlari kontrol edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        // sartlar birbirinden bagimsiz oldugundan
        // ve TUM HATALARI yazdirmamiz istendiginden
        // bagimsiz if cumleleri kullanacagiz

        // ANCAK bagimsiz if cumleleri kullanildiginda
        // en sonda sifrenin basarili veya hatali oldugunu anlamak icin
        // FLAG veya SAYAC kullanilmalidir
        // biz sayac kullanmayi tercih ettik

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

        if (hataSayaci == 0){
            System.out.println("sifre basariyla kaydedildi");
        }


    }
}
