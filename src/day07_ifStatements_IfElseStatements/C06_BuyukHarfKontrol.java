package day07_ifStatements_IfElseStatements;

import java.util.Scanner;

public class C06_BuyukHarfKontrol {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.next().charAt(0);


        // 1.yontem ascii table'i kullanarak

        if (karakter >= 'A' && karakter<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

        // 2.yontem Character Wrapper Class ozelliklerini kullanalim

        if (Character.isUpperCase(karakter)){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

    }
}
