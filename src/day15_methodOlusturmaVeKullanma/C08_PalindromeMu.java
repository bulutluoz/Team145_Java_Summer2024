package day15_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C08_PalindromeMu {

    public static void main(String[] args) {

        // kullanicidan bir metin alip
        // palindrome olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kontrol icin bir metin giriniz...");
        String metin = scanner.nextLine();

        // palindrome olmasi icin metin ile tersten yazilisi ayni olmali

        String tersMetin = C06_MetniTerseCevir.metniTersineCevir(metin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girdiginiz metin palindrome");
        }else {
            System.out.println("Girdiginiz metin palindrome degil");
        }



    }
}
