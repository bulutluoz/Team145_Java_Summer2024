package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_ScannerKullanimi {

    public static void main(String[] args) {


        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ondalikli bir sayi giriniz...");

        double ondalikliSayi = scanner.nextDouble();


        System.out.println("Lutfen bir tamsayi giriniz...");

        int tamSayi = scanner.nextInt();






    }

}
