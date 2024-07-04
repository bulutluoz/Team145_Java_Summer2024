package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C06_CharKontrolu {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin
        // girilen karakter sayi ise true, sayi degilse false yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz...");

        char girilenKarakter = scanner.next().charAt(0);  // kullanicinin girdigi String'in ilk karakterini alir

        System.out.println(Character.isDigit(girilenKarakter));
    }
}
