package day29_dateTime_varargs;

public class C06_Varargs {

    public static void main(String[] args) {

        // verilen degisken sayidaki int argument'den
        // ilk argument haric, geriye kalanlari toplayip
        // bulunan toplamdan ilk argument'i cikarip bulunan sonucu yazdiran bir method olusturun

        islemYap(2,3,4,5); // 3+4+5 => 12   12-2 => 10 yazdiracak
        islemYap(1,2,3,4,5,6,7,8); // 2+3+4+5+6+7+8 => 35  35-1=> 34 yazdiracak

    }

    public static void islemYap(int ilkArgument, int... geriyeKalanlar){

        // 1.adim geriyeKalanlar array'indeki tum elementleri toplayalim

        int toplam = 0;

        for (int each : geriyeKalanlar) {

            toplam += each;
        }

        System.out.println("Sonuc : " + (toplam-ilkArgument));

    }
}
