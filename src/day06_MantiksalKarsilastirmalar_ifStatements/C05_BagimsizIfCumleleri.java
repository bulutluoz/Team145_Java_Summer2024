package day06_MantiksalKarsilastirmalar_ifStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
            if cumlelerinde eger if body'de sadece 1 satir kod olacaksa
            {} kullanilmayabilir

            ANCAK suslu parantez KULLANILMADIGINDA
            if body'nin ilk ;'e kadar olan kisim kabul edilecegi UNUTULMAMALIDIR
         */

        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0) System.out.println("Uc ile bolunebilen sayi");
        System.out.println("Ne guzel sayi 3 ile bolundu");
        // 26.satir if body'sinde degildir
        // if cumlesi 25.satirdaki ilk ; ile bitmistir.



        if (sayi % 5 == 0){
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("Ne guzel sayi 5 ile bolundu");
        }
    }
}
