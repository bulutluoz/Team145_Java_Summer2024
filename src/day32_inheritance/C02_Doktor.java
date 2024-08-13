package day32_inheritance;

public class C02_Doktor extends C01_Personel{

    /*
        Bir class olusturdugumuzda (doktor)
        baslangic olarak doktor class'inda personel class'inda bulunan
        tum variable ve method'lara ihtiyacimiz var DIYORSAK

        iki ihtimal var
        1- doktor class'inda da bu method ve variable'lari olusturabiliriz
           ama doktor disinda, hemsire, teknik personel, idari personel..
           gibi diger class'larda da bu variable ve method'lari tekrar olusturmak gerekir
           bu HIC MANTIKLI olmaz

        2- doktor class'i icin personel class'indaki
           tum variable ve method'lari INHERIT edebiliriz

        Bir class'in baska bir class'daki TUM OZELLIKLERI
        INHERIT edebilmesi icin o class'a CHILD olmalidir

        insanlardan farkli olarak
        Java'da child class'lar PARENT'larini secerler
        bir class baska bir class'i parent edinmek isterse
        extends ParentClassIsmi yazabilir
     */

    String brans = "Brans belirtilmemis";

    public static void main(String[] args) {

        C02_Doktor doktor1 = new C02_Doktor();
        // Obje uzerinden kullanmamizin sebebi
        // static olan main method icinde static olmayan ozelliklere ulasmaya calismamizdir

        // doktor1 objesi C02_Doktor class'inin objesi olmasina ragmen
        // isim variable ve maas method'unu C01_Personel class'indan kullanabiliyor
        // Cunku o class'i extends ile INHERIT etti

        System.out.println(doktor1.brans);
        System.out.println(doktor1.isim);
        doktor1.maas();




    }


    public void method1(){
        System.out.println(isim);
        maas();
    }


}
