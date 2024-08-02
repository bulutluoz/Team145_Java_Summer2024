package day25_constructors;

public class C05_DikkatEDilecekKonular {

    String str = "Java";
    int sayi = 10;
    int yas = 45;

    C05_DikkatEDilecekKonular(){
        str = "C";
        yas = 30;
    }

    C05_DikkatEDilecekKonular(String s , int y){
        sayi = 40;
        yas = 50;
        str = s;
    }

    public static void main(String[] args) {

        // 1- eger classda var olan constructor'larin parametrelerine uygun olmayan
        //    bir obje olusturmak istersek CTE olusur

        // C05_DikkatEDilecekKonular obj1 = new C05_DikkatEDilecekKonular("Ali");

        // 2- temel olarak obje olusturulurken yazdigimiz argument'lerin objeye atanmasini bekleriz
        //    AMMA kod okuma sorularinda SAZAN AVI yapmak icin farkli atamalar yapilabilir
        //    MUTLAKA kodu takip etmeli ve kod ne yapiyorsa o islemi yapmaliyiz

        C05_DikkatEDilecekKonular obj2 = new C05_DikkatEDilecekKonular("Ayse",34);

        // str : Ayse , sayi : 40 , yas : 50

    }




}
