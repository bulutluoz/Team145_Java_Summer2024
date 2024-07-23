package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {

    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlar toplamini bulmak icin pozitif bir tamsayi giriniz..");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int dummyNumber = girilenSayi;

        while (  dummyNumber != 0   ){

            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;

        }

        System.out.println("Girdiginiz " + girilenSayi +" sayisinin rakamlar toplami : " + rakamlarToplami);


    }
}
