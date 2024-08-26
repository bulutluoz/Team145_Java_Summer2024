package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_TryCatchCalismaMantigi {

    public static void main(String[] args) {

        // Kullanicidan 3 sayi alip
        // toplamini yazdirin

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("1.sayiyi giriniz..");
            double sayi1 = scanner.nextDouble();
            System.out.println("1.sayi sorunsuz alinip kaydedildi");


            System.out.println("2.sayiyi giriniz..");
            double sayi2 = scanner.nextDouble();
            System.out.println("2.sayi sorunsuz alinip kaydedildi");


            System.out.println("3.sayiyi giriniz..");
            double sayi3 = scanner.nextDouble();
            System.out.println("3.sayi sorunsuz alinip kaydedildi");

            System.out.println("Sayilarin toplami : " + (sayi1+sayi2+sayi3));


        } catch (InputMismatchException e) {

            System.out.println("Sayi girmeliydiniz...");
        }

    }

}


