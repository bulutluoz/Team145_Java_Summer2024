package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici 0'a bastiginda islemi bitirin
        // ve girilen sayilar icerisinde en kucuk olan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        int sayi = 43;
        /*
            while loop'un en zayif tarafi
            kullanicidan alacagimiz deger icin baslangicta bizim bir deger atamamizdir

            Eger loop'u kullanicidan alacagimiz bir variable'a gore kurguladigimizda
            bizim ilk deger atamasi yapmamiz gerekiyorsa
            loop'un calismasini saglayacak bir deger ATAMALIYIZ

            Eger ilk deger atamasinda yanlis yapmak istemezseniz
            while loop yerine do-while kullanabilirsiniz
         */
        int enKucukSayi = Integer.MAX_VALUE; //


        while ( sayi != 0){

            System.out.println("Lutfen bir tam sayi giriniz..");
            sayi = scanner.nextInt();

            if ( sayi < enKucukSayi  &&   sayi != 0){

                    enKucukSayi = sayi;

            }
        }

        System.out.println("Girilen en kucuk sayi : " + enKucukSayi);
    }
}
