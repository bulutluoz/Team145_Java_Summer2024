package day08_ifElseIfStatements_NestedifElse;

import java.util.Scanner;

public class C09_TernaryOperatoru {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // sayi cift ise "cift sayi", cift degilse "tek sayi" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if ( sayi % 2 == 0){

            System.out.println( "Cift sayi");
        } else {

            System.out.println("Tek sayi");
        }

        // If else ile yapilabilen basit islemlerde
        // 4 satir kod yazmak yerine
        // ternary operatoru ile tek satirda isi cozebiliriz

        System.out.println(  sayi % 2 == 0 ?  "Cift sayi" :  "Tek sayi"   );

    }
}
