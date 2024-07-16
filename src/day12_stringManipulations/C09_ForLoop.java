package day12_stringManipulations;

import java.util.Scanner;

public class C09_ForLoop {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin
        // 1'den baslayarak, girilen sayiya kadar (sayi dahil)
        // butun tamsayilari aralarinda bir bosluk birakarak yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz..");
        int sayi = scanner.nextInt(); // 333


        for (int i = 1; i <=333 ; i++) {

            System.out.print(i + " ");

        }

    }
}
