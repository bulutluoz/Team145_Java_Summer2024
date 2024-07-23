package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici 0'a bastiginda islemi bitirin
        // ve girilen sayilar icerisinde en kucuk olan sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);

        int sayi = 0;
        int enKucukSayi = Integer.MAX_VALUE;

        do {

            System.out.println("Lutfen bir tam sayi giriniz..");
            sayi = scanner.nextInt();

            if ( sayi < enKucukSayi  &&   sayi != 0){

                enKucukSayi = sayi;

            }

        }while ( sayi != 0);

        System.out.println("Girilen en kucuk sayi : " + enKucukSayi);

    }
}
