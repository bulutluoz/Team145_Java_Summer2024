package day06_MantiksalKarsilastirmalar_ifStatements;

public class C01_AndOperatoru {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Eger sonuca odakli bir islem yapiyorsak
        // ilk false bulundugunda genel sonuc false olacagindan
        // geriye kalan islemleri yapmaya gerek KALMAZ
        // boylece islem HIZLI yapilmis olur
        boolean genelSonuc = a>=b     &&   a<b     &&      a>b-8 ;

        System.out.println(genelSonuc); // false


        // bazen yapilmayan 2. ve 3.islemlerde atamalar olabilir
        // eger o islemler yapilmazsa atamalar da yapilmamis olur
        // bu durumda sonuc yine false olsa da
        // tum islemlerin yapilmasini isteriz
        // bunun icin & kullaniriz


        boolean sonuc1;
        boolean sonuc2;
        boolean sonuc3;

        genelSonuc =  (sonuc1= a>=b)     &  (sonuc2 = a<b)     &      (sonuc3=a>b-8) ;

        System.out.println(genelSonuc); // false
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);


    }
}
