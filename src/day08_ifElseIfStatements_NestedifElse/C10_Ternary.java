package day08_ifElseIfStatements_NestedifElse;

import java.util.Scanner;

public class C10_Ternary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi 100'den buyukse sayiyi 10 azaltin
        // sayi 100'den buyuk degilse sayiya 20 ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        /*
        if (sayi>100) {
            sayi -=10;     //sayi = sayi-10;
        }else {
            sayi+=20;
        }

         */

        sayi = sayi >100 ?  sayi-10 : sayi+20 ;

        System.out.println(sayi);
    }
}
