package day07_ifStatements_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseSatatements {
    public static void main(String[] args) {

        /*
            If-else statements
            bir olay icin SADECE 2 ihtimal sozkonusu ise kullanilir
            if-else kullandigimizda
            if body'si veya else body'sinden SADECE biri calisir

            ikisinin birlikte calismasi mumkun degildir
            ikisinin de calismayip bos ekran olmasi mumkun degildir
         */

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){

            System.out.println("Eskenar ucgen");

        }else {

            System.out.println("Eskenar degil");
        }
    }
}
