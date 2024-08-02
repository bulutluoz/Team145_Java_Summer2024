package day25_constructors;

public class C03_ArabaRunner {

    public static void main(String[] args) {

        C02_Araba araba1 = new C02_Araba();
        // bir obje default constructor kullanilarak olusturulursa
        // default cons. body'sinde kod olmadigindan
        // obje ilk deger olarak
        // instance variable'lara atanan degerleri alir

        System.out.println( "Marka : " + araba1.marka +
                            ", Model : " + araba1.model +
                            ", Renk : " + araba1.renk +
                            ", Yil : " + araba1.yil +
                            ", Fiyat : " + araba1.fiyat
        );

        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.renk = "Kirmizi";
        araba1.yil = 2010;
        araba1.fiyat = 5000;
        System.out.println(araba1);
        // Ozellikler : Marka='Toyota', Model='Corolla', Renk='Kirmizi', Yil=2010, Fiyat=5000

        C02_Araba araba2 = new C02_Araba();
        System.out.println(araba2);
        // Ozellikler : Marka='Marka atanmadi', Model='Model atanmadi', Renk='Renk atanmadi', Yil=1900, Fiyat=0

        araba2.marka = "Audi";
        araba2.yil = 2004;
        araba2.fiyat = 3000;
        System.out.println(araba2);
        // Ozellikler : Marka='Audi', Model='Model atanmadi', Renk='Renk atanmadi', Yil=2004, Fiyat=3000

        // EGER ozellikleri daha obje olusturulurken atamak isterseniz
        // O ZAMAN ozellikleri parametre olarak CONSTRUCTOR'a yollariz
        // CONSTRUCTOR ICINDE yolladigimiz degerleri objeye atama yapariz



    }
}
