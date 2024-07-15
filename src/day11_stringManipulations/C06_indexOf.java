package day11_stringManipulations;

import java.util.Scanner;

public class C06_indexOf {

    public static void main(String[] args) {

        // Kullanicinin girdigi metin'de birden fazla a harfi oldugu biliniyorsa
        // 2. a'nin index'ini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metni giriniz...");
        String str = scanner.nextLine();


        int birinciKullanimIndexi = str.indexOf("a");

        int ikinciKullanimIndexi = str.indexOf("a",birinciKullanimIndexi+1);

        System.out.println("2.a'nin indexi : " + ikinciKullanimIndexi);
    }
}
