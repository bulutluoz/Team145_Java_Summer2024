package day09_ternary_switch;

import java.util.Scanner;

public class C03_SwitchStatements {

    public static void main(String[] args) {

        /*
            switch(kontrolEdilecekVariable) {  }
            Java kontrolEdilecekVariable'in degerine
            uygun olan case'den calismaya baslar
            ve switch statement'in sonuna kadar calisir

            EGER case'lerin birbirinden bagimsiz olmasini isterseniz
            her case'in bitimine break; yazmaliyiz

            EGER birden fazla case icin ayni islem yapilacaksa
            break ile kontrol edilebilir

         */

        // kullaniciya haftanin kacinci gununu yazdirmak istedigini sorun
        // 1-7 arasindaki degerler icin pazartesi'den pazar'a kadar gun isimlerini yazdirin
        // 1-7 arasindaki sayilardan farkli bir sayi girerse hata mesaji verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("haftanin kacinci gununu yazdirmak istersiniz ?");
        int gunNo = scanner.nextInt();


        switch (gunNo){

            case 1 :
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("gun numarasi 1 ile 7 arasinda olmali...");
        }
    }
}
