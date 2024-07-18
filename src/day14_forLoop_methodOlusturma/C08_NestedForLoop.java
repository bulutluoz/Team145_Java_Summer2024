package day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                0
                0 1
                0 1 2
                0 1 2 3
                0 1 2 3 4

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // outer loop ==> satirlari kontrol eder

            for (int j = 1; j <=i ; j++) { // inner loop ==> her satirdaki sutunlari

                System.out.print( j-1 + " " );

            }
            System.out.println("");
        }

    }
}
