package day07_ifStatements_IfElseStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri_FlagYontemi {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int flag = 10;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kucuk");
            flag = 11;
        }
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
            flag = 11;
        }
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den kucuk"
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            flag = 11;
        }
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            flag = 11;
        }


        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        if (flag == 10){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }

    }
}
