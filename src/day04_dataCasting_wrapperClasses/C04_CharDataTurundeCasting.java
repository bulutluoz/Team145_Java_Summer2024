package day04_dataCasting_wrapperClasses;

public class C04_CharDataTurundeCasting {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        System.out.println( chr1 + chr2 + chr3 ); // 97 + 98 + 99 ==> 294

        char chr4 = 101;

        System.out.println( chr4 ); // e

        // EGER char data turundeki bir variable
        // matematiksel islemde kullanilirsa
        // ASCII table'daki degeri ile isleme girer
        char chr5 = 'k';

        // chr5'den sonra gelen 3 karakteri yazdirin

        System.out.println(   chr5 + 1  ); // k==>107 +1   ==> 108
        System.out.println(   (char) (chr5 + 1)     ); // l

        System.out.println(   (char) (chr5+2)     ); // m

        System.out.println(   (char)(chr5+3)   ); // n


        System.out.println(  'A' < 'a'); // true

        System.out.println( 'c' < 'a'); // false

        System.out.println( 't' - 'p'); // 116 - 112 ==> 4

    }
}
