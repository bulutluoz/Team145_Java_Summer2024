package day09_ternary_switch;

public class C01_Ternary {
    public static void main(String[] args) {

        // basit bir if-else ile yapilabilecek kodlari
        // tek satirda yapabilmek icin ternary tercih EDILEBILIR

        int sayi = -15;

        // ornegin verilen sayinin tek veya cift oldugunu YAZDIRMAK icin

        System.out.println(   sayi % 2 == 0 ?  "Cifts sayi " : "Tek sayi"      );


        // verilen sayi negatif ise degerini 10 artirin
        //              negatif degilse degerini 3 azaltin

        sayi = sayi<0 ? sayi+10 : sayi-3 ;

        // verilen gereksinimde sadece deger degistirme istenmis
        // onun icin yazdirmaya gerek yok

        // ama biz kodumuzun dogru calistigini gormek icin
        // sayiyi yazdirabiliriz
        // kodun dogru calistigini gordukten sonra, sout'u silmek lazim
        // System.out.println(sayi);


        // Ternary operatoru YA sout icinde kullanilmali
        //                   YA DA mutlaka ATAMA yapilmalidir

        // sayi<0 ? sayi+10 : sayi-3 ;


        sayi = 11;

        // sayi cift ise cift sayi yazdirin
        //      cift sayi degilse degerini 5 artirin

        // ternary true ve false icin yazdirma olursa
        //           veya iki durumda da atama olursa  kullanilabilir

        System.out.println( sayi%2 == 0 ? "Cift sayi" : sayi +5);

        System.out.println(sayi);
        // bu kod sayinin 5 fazlasini yazdirir
        // ama sayiyi 5 artirmaz

        if (sayi % 2 == 0){
            System.out.println("Cift sayi");
        }else {
            sayi += 5;
        }
    }
}
