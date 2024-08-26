package day40_exceptions;

import java.util.Scanner;

public class C01_MultipleExceptions1 {

    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // verilen tamsayiyi index olarak kabul edip
        // Asagida verilen String ve array'de o index'de olan elementleri yazdirin

        String str = "Java candir";
        int[] arr = {1,2,4,5,6,3,4,5,7,8,9,2,3,4,0};

        /*
            Bu soruda 3 adet exception olusma riski var

            InputMissmatchException
            StringIndexOutOfBoundsException
            ArrayIndexOutOfBoundsException

            Bu soruda InputMissmatchException'i dikkate almayip
            kalan 2 exception'i nasil kontrol altina alabilecegimizi inceleyelim
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen index olarak kullanmak icin bir tamsayi giriniz...");
        int girilenIndex = scanner.nextInt();

        // Bir kodda birden fazla exception riski varsa
        // oncelikle olusma riski bulunan exception'lari inceleyip
        // aralarinda parent-child iliskisi var mi bakilir
        // parent child iliskisi yoksa 3 farkli sekilde kontrol altina alabiliriz


        // 1- farkli 2 try-catch yapabiliriz

        try {

            System.out.println(str.charAt(girilenIndex)); //

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Verilen index String'in sinirlari disinda");
        }


        try {
            System.out.println(arr[girilenIndex]); //
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verilen index Array'in sinirlari disinda");
        }


    }
}
