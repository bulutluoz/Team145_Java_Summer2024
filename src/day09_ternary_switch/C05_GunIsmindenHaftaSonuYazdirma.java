package day09_ternary_switch;

import java.util.Scanner;

public class C05_GunIsmindenHaftaSonuYazdirma {

    public static void main(String[] args) {

        /*
            switch(kontrolEdilecekVariable) yazarken
            kontrolEdilecekVariable'in data turu
            boolean,long,float veya double OLAMAZ
         */

        // kullanicidan gun ismini isteyin
        // buyuk kucuk harf farketmeksizin
        // kullanicinin girdigi gun hafta ici ise "Calisma gunu"
        //                          hafta sonu ise "Tatil gunu" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz...");
        String gunIsmi = scanner.nextLine().toLowerCase();

        switch (gunIsmi){

            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("Calisma gunu");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("Tatil gunu");
                break;
            default:
                System.out.println("gecersiz gun ismi girdiniz...");
        }
    }
}
