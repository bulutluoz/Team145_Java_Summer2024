package day08_ifElseIfStatements_NestedifElse;

import java.util.Scanner;

public class C06_NestedIfElse_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // kullanici E ve K disinda bir cinsiyet girerse
        // veya 15 yasdan kucuk, 80 yasdan buyuk yas girerse uyarin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E: erkek, K:kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        // kullanici kucuk buyuk harf girebilir diye
        // kontrolu kolay yapabilmek icin toUpperCase() kullandik

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        /*
            Eger bir if else'de karar vermek icin baktigimiz
            variable sayisi birden fazla ise nested if else statement tercih edilebilir

            Oncelikle bakacagimiz 2 degiskenden birini
            ana degısken kabul edip sadece ona gore bir if else olustururuz

            biz cinsiyeti ana degisken kabul edelim
         */

        if (cinsiyet == 'K'){ // kadinlari secer

            // burada sadece kadinlar var
            if (yas<15 || yas>80){
                System.out.println("Bu yas degerleri icin emeklilik hesaplanamaz");
            } else if (yas>=60) {
                System.out.println("Kadin 60 yasindan itibaren emekli olabilir");
            } else{
                System.out.println("Emeklilik yasi 60, daha "+ (60-yas) + " yil calismali");
            }

        } else if (cinsiyet == 'E') { // erkekleri secer
            // burada sadece erkekler var
            if (yas<15 || yas>80){
                System.out.println("Bu yas degerleri icin emeklilik hesaplanamaz");
            } else if (yas>=65) {
                System.out.println("Erkek 65 yasindan itibaren emekli olabilir");
            } else{
                System.out.println("Emeklilik yasi 65, daha "+ (65-yas) + " yil calismali");
            }

        }else { // cinsiyet olarak K veya E disinda deger girenler

            System.out.println("Cinsiyet E veya K olarak girilmelidir");
        }

    }
}
