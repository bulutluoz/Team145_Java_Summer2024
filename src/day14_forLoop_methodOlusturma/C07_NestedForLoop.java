package day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C07_NestedForLoop {

    public static void main(String[] args) {
        /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                *
                * *
                * * *
                * * * *
                * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir ; i++) { // outer loop ==> satirlari kontrol eder

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
