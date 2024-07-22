package day16_MethodKullanma_MethodOverloading;

public class C07_WhileLoop {

    public static void main(String[] args) {

        /*
            Eger baslangic ve bitis degerleri biliniyorsa
            veya bir islemi kac kere tekrarlayacigimizi biliyorsak
            For Loop avantajlidir

            Cunku while loop
            - baslangic degeri
            - bitis degeri
            - ve artis/azalis miktarini otomatik olarak bize vermez

         */

        // 1'den 10'a kadar (1 ve 10 dahil) tum sayilari toplayin

        int toplam = 0;

        for (int i = 1; i <=10 ; i++) {

            toplam += i;

        }

        System.out.println("toplama isleminin sonucu : " + toplam); // 55


        // 20'den 30'a kadar olan sayilari (20 ve 30 dahil) while loop ile toplayin
        toplam = 0 ;

        int i = 20;

        while ( i <= 30){

            toplam += i ;

            i++;

        }
        System.out.println("toplama isleminin sonucu : " + toplam); // 275

    }
}
