package day04_dataCasting_wrapperClasses;

public class C01_ExplicitNarrowing {

    public static void main(String[] args) {

        double dbl = 23.99 ;

        int sayiInt = (int) dbl;

        System.out.println("sayi int : " + sayiInt); // 23

        short shrt = (short) dbl;

        System.out.println("shrt : " + shrt);


        int sayi1 = 12;
        int sayi2 = 5;

        System.out.println("Sayilarin bolumu : " +   ( sayi1 / sayi2 )  );
        // bu bolme isleminin sonucu normalde 2.4'dur
        // ANCAKKK java bolunen sayilara bakar
        // EGER hem bolunen, hem de bolen int ise Java bolme isleminin sonucunun sadece tam sayi kismini yazdirir

        System.out.println( 8 / 3); // 2
        System.out.println(19 / 3); // 6


        // sayi1 / sayi2 isleminin sonucunu ondalikli olarak yazdirin

        double sonuc = sayi1 / sayi2 ;

        System.out.println("Bolme isleminin double sonucu : " + sonuc); // 2.0


        // 2.yontem olarak bolme islemini double'a cast yapsak

        System.out.println(       (double)   (sayi1 / sayi2)            ); // 2.0

        // bolme isleminin sonucunun ondalikli olmasi icin,
        // isleme giren sayilardan EN AZ biri ondalikli sayi olmalidir

        // 3.yontem sayilardan birini veya ikisini double'a cast edelim

        System.out.println(   (double)sayi1 / sayi2     ); // 2.4

        System.out.println(   sayi1 / (double)sayi2     ); // 2.4

        System.out.println(   (double)sayi1 / (double)sayi2     ); // 2.4


        int sayi = 2024;

        System.out.println(  sayi / 10 ); // 202,4 ==> 202

        System.out.println( sayi / 100 ); // 20,24 ==> 20

        sayi = sayi / 10;

        System.out.println(sayi / 10); // 20



    }
}
