package day33_ConstructorCall;

public class C04_CorollaRunner {
    /*
        Child class'dan olusturulan bir obje
        kendi class'indaki ozelliklerin yaninda
        parent ve grandparent class'larindaki tum ozellikleri de tasir

        ANCAK daha once demistik ki
        bir objeye ilk deger atamasi (initialize) yapilabilmesi icin
       MUTLAKA constructor calismalidir

       java child class'dan bir obje olusturuldugunda
       sadece child class constructor'inin degil
       parent ve grandparent constructor'larinin da calismasini saglamak icin

       EXTENDS kullanan class'larda var olan
       HER CONSTRUCTOR'in ilk satirina
       CONSTRUCTOR CALL olma mecburiyeti getirmistir

       Eger kodu yazan kisi ilk satirda constructor call yazmazsa
       Java otomatik olarak
       gorunmeyen super() constructor call yerlestirir.
     */

    public static void main(String[] args) {

        C03_Corolla corolla1 = new C03_Corolla();
        System.out.println(corolla1.model); // Corolla
        System.out.println(corolla1.sanzuman); // Multidrive
        System.out.println(corolla1.lastik); // Turkiyede uretilen pirelli lastik
        System.out.println(corolla1.uretimYeri); // Turkiye
        System.out.println(corolla1.fren); // Abs
        System.out.println(corolla1.aku); // Inci
        System.out.println(corolla1.cekis); // P Toyota araclar onden cekislidir
        System.out.println(corolla1.kasa); // GP Kasa secilmedi



    }
}













