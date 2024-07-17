package day13_forLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinToplami {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("baslangic degeri olarak pozitif tamsayi giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("bitis degeri olarak pozitif tamsayi giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if ( bitis < baslangic || baslangic < 0 || bitis < 0){
            System.out.println("baslangic veya bitis degeri uygun degil");
        }else {

            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i ;

            }
            System.out.println("Girilen degerler arasindaki tamsayilarin toplami : " + toplam);

        }

    }
}
