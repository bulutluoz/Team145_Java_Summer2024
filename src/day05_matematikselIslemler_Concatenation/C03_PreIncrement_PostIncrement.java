package day05_matematikselIslemler_Concatenation;

public class C03_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 20;

        // a'nin degerini olusturdugunuz bir b variable'ina atayin
        // sonra a'yi bir artirin

        int b = a;
        a++;

        System.out.println("15.satirda a: " + a + " , b : " + b ); // a : 21   b: 20


        a= 20;

        // once a'yi 1 artirin
        // sonra a'nin degerini b'ye atayin

        a++;

        b = a;

        System.out.println("27.satirda a: " + a + " , b : " + b ); // a : 21   b: 21


        a= 20;

        // a'nin degerini yazdirin
        // sonra a'nin degerini 1 artirin

        System.out.println("35.satirda a : " + a); // 20
        a++;

        // burada a'nin degeri 21 ama biz bunu konsolda gormeyiz


        a = 20;

        // a'nin degerini 1 artirin
        // sonra a'nin degerini yazdirin

        a++;

        System.out.println("48.satirda a : " + a); // 21

        // burada a'nin degeri 21


    }
}
