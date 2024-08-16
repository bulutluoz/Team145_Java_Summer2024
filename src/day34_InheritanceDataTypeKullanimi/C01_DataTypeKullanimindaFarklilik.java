package day34_InheritanceDataTypeKullanimi;

import day33_ConstructorCall.C01_Araba;
import day33_ConstructorCall.C02_Toyota;
import day33_ConstructorCall.C03_Corolla;

import java.util.ArrayList;
import java.util.List;

public class C01_DataTypeKullanimindaFarklilik {

    /*
        Hayvallarla ilgili semada

        hem hayvanlar class'inda, hem kuslar class'inda, hem de ucan kuslar class'inda kartal var

        her class'daki kartal ayni klartal olmasina ragmen
        ozellikleri farkli olabilir

        CUNKU cumlemize her zaman
        Hayvanlar class'indaki kartal da , tum hayvanlar gibi... ile baslariz

        bu durumda
        Hayvanlar class'indaki kartal da , tum hayvanlar gibi...
        Kuslar class'indaki kartal da , tum kuslar gibi...
        AvciKuslar class'indaki kartal da , tum AvciKuslar gibi... cumleleri bize farkli sonuclar uretebilir

        Bu konuda gercek dunyamizda 2 farkli durum mumkundur,
        Java bu iki durumu da realize etmistir

        1- Obje hangi class'dan olusturulmussa
           o class'daki tum objelerle ortak ozelliklere sahip olur
           (ozellik variable olarak olusturulursa)

        2- Obje tabii ki olusturuldugu class'daki tum objelerle
           baslangic itibariyle ortak ozellikleri tasir
           AMMA semada daha guncel bilgi varsa onu kullanmalidir
           (ozellik method olarak olusturulursa)

     */

    public static void main(String[] args) {



        String str = "Java super";
        // String class ismi mi ?
        //        yoksa data turu mu ?
        // String java'nin olusturdugu bir class'dir
        // biz 45. satiri yazdigimizda
        // olusturulan str variable'inin data turu de String olarak tanimlanir
        // str data turu olan String class'indaki tum ozellikleri kullanabilir
        // toLowerCase() String class'indaki bir hazir method iken
        // Styring'i data turu kabul eden str icin bir ozellik olur
        System.out.println(str.toLowerCase());


        C01_Araba araba1 = new C01_Araba();
        C02_Toyota toyota1 = new C02_Toyota();


        /*
            Bir obje olusturulurken standart syntax
            ArrayList<String > list2 = new ArrayList<>();

            ama istenirse sol tarafta data turu olarak kullanilan class ismi yerine
            constructor'i kullanilan class'in parent/grantParent'lari da kullanilabilir

            Bu child class'dan olusturulan bir objeye
            parent class'lardaki ortak ozellikleri vermenin yontemidir



         */




        C03_Corolla corolla1 = new C03_Corolla();
        C02_Toyota corolla2 = new C03_Corolla();
        C01_Araba corolla3 = new C03_Corolla();

        List<String > list1 = new ArrayList<>();
        ArrayList<String > list2 = new ArrayList<>();

    }
}
