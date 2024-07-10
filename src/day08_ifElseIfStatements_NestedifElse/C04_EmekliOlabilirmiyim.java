package day08_ifElseIfStatements_NestedifElse;

import java.util.Scanner;

public class C04_EmekliOlabilirmiyim {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E: erkek, K:kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        // kullanici kucuk buyuk harf girebilir diye
        // kontrolu kolay yapabilmek icin toUpperCase() kullandik

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();



    }
}
