package day16_methodKullanma_MethodOverloading;

import java.util.Scanner;

public class C09_WhileLoop {

    public static void main(String[] args) {
        // asagidaki gorevi yapan bir method olusturun :)

        // kullanicidan istedigi kadar isim girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir (q veya Q olabilir)
        // girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin
        // esit sayida harfe sahip isimlerden herhangi biri olabilir

        enUzunKelimeyiBulVeYazdir();
        System.out.println(enUzunKelimeyiBulVeDondur());

    }


    public static void enUzunKelimeyiBulVeYazdir(){
        Scanner scanner = new Scanner(System.in);
        String enUzunKelime = "";
        String girilenKelime = "";

        while ( !girilenKelime.equalsIgnoreCase("q")  ){

            System.out.println("Lutfen bir kelime giriniz...\nBitirmek icin Q'ya basiniz..");
            girilenKelime = scanner.nextLine();

            if (girilenKelime.length() > enUzunKelime.length()){

                enUzunKelime = girilenKelime;

            }

        }

        System.out.println(enUzunKelime);
    }

    public static String enUzunKelimeyiBulVeDondur(){
        Scanner scanner = new Scanner(System.in);
        String enUzunKelime = "";
        String girilenKelime = "";

        while ( !girilenKelime.equalsIgnoreCase("q")  ){

            System.out.println("Lutfen bir kelime giriniz...\nBitirmek icin Q'ya basiniz..");
            girilenKelime = scanner.nextLine();

            if (girilenKelime.length() > enUzunKelime.length()){

                enUzunKelime = girilenKelime;

            }

        }
        return enUzunKelime;
    }
}
