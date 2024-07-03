package day03_scanner_dataCasting;

import java.util.Scanner;

public class C05_BilgileriDegistirme_Swap {

    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1.tamsayiyi giriniz...");

        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2.tamsayiyi giriniz...");

        int sayi2 = scanner.nextInt();


       int bosKova = 0 ;


       bosKova = sayi2;


       sayi2 = sayi1 ;



       sayi1 = bosKova;


        System.out.println("Sayi1'in yeni degeri : " + sayi1);
        System.out.println("Sayi2'nin yeni degeri : " + sayi2);
    }
}
