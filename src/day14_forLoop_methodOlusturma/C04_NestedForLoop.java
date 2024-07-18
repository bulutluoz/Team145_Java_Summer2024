package day14_forLoop_methodOlusturma;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        // bir for loop kullanarak 1 2 3 4 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*1 + " ");
        }

        System.out.println("");

        // bir for loop kullanarak 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*2 + " ");
        }

        System.out.println("");

        // bir for loop kullanarak 3 6 9 12 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*3 + " ");
        }

        System.out.println("");

        // bir for loop kullanarak 4 8 12 16 yazdirin

        for (int i = 1; i <=4 ; i++) {

            System.out.print(i*4 + " ");
        }
        System.out.println("");


        System.out.println("======================");

        /*
            for loop kullanarak asagidaki sayilari yazdirin
                    1 2 3 4
                    2 4 6 8
                    3 6 9 12
                    4 8 12 16

            Eger for loop ile 2 boyutlu bir sekil olusturacaksak
            ic ice 2 loop kullanmamiz gerekir

            DISARDAKI loop (outer loop) satirlari kontrol eder
            ICERDEKI loop (inner loop) her satirdaki sutunlari kontrol eder
         */

        for (int i = 1; i <=4 ; i++) { // outer loop ==> satirlari kontrol eder

            for (int j = 1; j <=4 ; j++) { // inner loop ==> her satirdaki sutunlari

                System.out.print(  i * j + " "  );
            }
            System.out.println("");
        }



    }
}
