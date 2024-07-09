package day07_ifStatements_IfElseStatements;

import java.util.Scanner;

public class C07_KucukHarfKontrol {

    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir karakter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.next().charAt(0);

        // 1.yontem ascii table kullanarak

        if (karakter >= 'a' && karakter <= 'z'){

            System.out.println(   (char) (karakter-32)    );

        }else {
            System.out.println(karakter);
        }


        // 2.yontem Wrapper class ozelliklerini kullanarak

        if (Character.isLowerCase(karakter)){

            System.out.println(Character.toUpperCase(karakter));
        }else {
            System.out.println(karakter);
        }




    }
}
