package day06_MantiksalKarsilastirmalar_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
            BAGIMSIZ if cumleleri adindan da anlasilacagi gibi
            kodun geri kalanindan bagimsizdir

            Kendisine verilen sarta odaklanir
            ve o sart true olursa if body'sine yazilan kodu calistirir

            Birden fazla bagimsiz if cumlesi varsa
            hepsinin if body'leri calisabilecegi gibi
            hic birinin if body'si calismayabilir de

            Bu kod calistirildiginda
            tum bagimsiz if cumleleri kendi sartlarini kontrol eder
            sart saglanirsa kendi body'sindeki kodlari calistirir
            sart saglanmazsa if cumlesi calisir
            ama if body'si devreye girmemis olur
         */

        // kullanicidan 2 tam sayi alin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // sayi1 > sayi2 ise "ilk sayi daha buyuk"
        if (sayi1>sayi2){
            System.out.println("ilk sayi daha buyuk");
        }

        // sayi1 cift sayi ise "ilk sayi cift bir sayidir"
        if (sayi1 % 2 == 0){
            System.out.println("ilk sayi cift bir sayidir");
        }

        // sayi2 100'den buyukse "ikinci sayi cok buyuk"
        if (sayi2>100){
            System.out.println("ikinci sayi cok buyuk");
        }

        // sayi2 3'e bolunebiliyorsa "ikinci sayi 3'un tam kati" yazdirin
        if (sayi2 % 3 == 0){
            System.out.println("ikinci sayi 3'un tam kati");
        }



    }
}
