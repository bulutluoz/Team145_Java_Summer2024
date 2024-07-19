package day15_methodOlusturmaVeKullanma;

public class C02_MethodOlusturma {

    public static void main(String[] args) {
        // verilen pozitif bir tamsayinin faktoryel degerini yazdiran bir method olusturun

       faktoryelDegeriYazdir(3); // 3! = 6
       faktoryelDegeriYazdir(5); // 5! = 120


    }

    public static void faktoryelDegeriYazdir( int sayi  ){
        int faktoryelSonucu = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryelSonucu *= i;
        }

        System.out.println(sayi + "! = " + faktoryelSonucu);
    }

}
