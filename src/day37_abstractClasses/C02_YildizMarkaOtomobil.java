package day37_abstractClasses;

public class C02_YildizMarkaOtomobil extends C01_ArabaAbstractClass{


    @Override
    public void motor() {
        System.out.println("Yildiz arabalari 1.4 TYCV motor kullanir");
    }

    @Override
    public void sase() {
        System.out.println("Yildiz arabalari guvenli saseler kullanir");
    }

    @Override
    public void gosterge() {

    }

    /*
        Abstract class'lar bir obje olusturmak icin degil,
        kendisini parent edinecek child class'larin
        MUTLAKA kendisine uyarlamasi(implement) gereken
        method'lari belirleyen OZEL CLASS"LARDIR

        1- abstract parent class'daki
           abstract method'lar
           concrete child class'lar tarafindan MUTLAKA uyarlanmalidir
        2- abstract parent class'daki
           concrete method'lar
           inheritance kurallarina tabiidir
           yanii
            - child isterse parent'daki concrete method'u aynen kullanir
            - isterse override edip Kendisine Uyarlar (implement)

        3- Abstract class'lar class olduklari icin
           constructor'a sahiptir
           AMMA abstract class'daki abstract method'lar CALISTIRILAMAYACAGI icin
           ABSTRACT CLASS"LARDAN OBJE OLUSTURULAMAZ

        4- Bir abstract class'a sonradan bir abstract method eklenirse
           o abstract class'a extends etmis olan tum concrete class'lar CTE verir
           yeni eklenen abstract method'u
           tum child class'lara implement etmeniz gerekir

        5- Abstract class'in icinde hem abstract, hem de concrete method bulunabilir
           AMMAAA concrete class'da abstract method OLAMAZ
     */

    public static void main(String[] args) {
        // C01_ArabaAbstractClass araba1 = new C01_ArabaAbstractClass();
        // 'C01_ArabaAbstractClass' is abstract; cannot be instantiated
        // araba class'i abstract oldugundan araba class'indan obje olusturulamaz

        // araba1.klima(); // Arabalar isterlerse klimali olabilirler
        // araba1.motor();
        // araba class'indaki motor(), abstract oldugundan body'si yoktur
        // Java bunun icin abstract class'lardan obje olusturulmasina izin vermez


        C01_ArabaAbstractClass araba1 = new C02_YildizMarkaOtomobil();
        araba1.motor(); // Yildiz arabalari 1.4 TYCV motor kullanir
        araba1.klima(); // Arabalar isterlerse klimali olabilirler
        araba1.sase(); // Yildiz arabalari guvenli saseler kullanir
        araba1.sunroof(); // Arabalar isterlerse sunroof barindirabilir
    }

    // public abstract void method1(); // Modifier 'abstract' not allowed here
}
