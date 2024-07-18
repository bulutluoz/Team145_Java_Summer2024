package day14_forLoop_methodOlusturma;

import java.util.Scanner;

public class C03_StringiTersineCeviripKaydetme {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();
        String tersMetin = "";

        for (int i = metin.length()-1; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        System.out.println("Girilen metnin tersten yazilisi : " + tersMetin);


        // Girilen metnin PALINDROME (ters ve duz yazilisi ayni)
        // olup olmadigini yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin Palindrome");
        }else {
            System.out.println("Girilen metin Palindrome DEGIL.");
        }
    }
}
