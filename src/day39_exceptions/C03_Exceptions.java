package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        // kullanicidan  iki tamsayi isteyin
        // kullanici tamsayi girmezse, hata mesaji yazdirip
        // yeniden deger isteyin
        // kullanici 2 tamsayi girdikten sonra
        // sayilari bolup, sonucun tam sayi kismini yazdirin


        int sayilarDuzgunGirildiMi = 1; // flag olarak kullanacagim
        Scanner scanner;
        int sayi1 = 0;
        int sayi2 = 0;

        while (sayilarDuzgunGirildiMi == 1){

            try {
                scanner = new Scanner(System.in);

                System.out.println("Lutfen bolunecek sayiyi giriniz...");
                sayi1 = scanner.nextInt();

                System.out.println("Lutfen bolecek sayiyi giriniz...");
                sayi2 = scanner.nextInt();

                sayilarDuzgunGirildiMi = 2;

            } catch (InputMismatchException e) {

                System.out.println("Tamsayi GIRMELISINIZ...");
            }

        }

        // while loop'un bitip , java'nin 40.satira gelmesi icin
        // kullanici 2 tamsayi girmis olmalidir

        // kullanicinin bolen sayiyi 0 girme riskine karsi onlem olarak
        // if-else olusturabiliriz

        if ( sayi2 == 0 ){
            System.out.println("Bolen sayi 0 OLAMAZ");
        }else{
            System.out.println( sayi1 / sayi2 );
        }


    }
}
