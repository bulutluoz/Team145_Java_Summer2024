package day24_constructors;

public class C03_Runner {

    public static void main(String[] args) {


               C02          obj           =            new        C02()       ;
        // Class adi  objenin ismi   atama isareti   keyword   Constructor

        /*
            Java'da bir objenin olusturulup
            sahip olacagi ilk degerleri alabilmesi icin
            MUTLAKA bir CONSTRUCTOR calismalidir
         */


        System.out.println(obj.adres);
        System.out.println(obj.isim);
        System.out.println(obj.kareAl(4));
        obj.telefonYazdir();


        C02 obj2;
        // sadece esitligin sol tarafi (deklarasyon) ile C02'ye ulasamayiz
        //System.out.println(obj2.adres); Variable 'obj2' might not have been initialized
        //System.out.println(obj2.kareAl(4));
        //System.out.println(obj2.isim);

        // sadece esitligin sag tarafini(deger) kullanarak C02'ye ulasabiliriz
        System.out.println(new C02().isim);
        System.out.println(new C02().adres);


    }
}
