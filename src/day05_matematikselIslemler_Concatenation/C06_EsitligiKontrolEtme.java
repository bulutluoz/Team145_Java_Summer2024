package day05_matematikselIslemler_Concatenation;

public class C06_EsitligiKontrolEtme {

    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int c = 3;

        System.out.println(   a == b ); // false

        System.out.println( b == a+c ); // true

        System.out.println( b > c ); // true

        System.out.println( c > a ); // false

        System.out.println( a = b); // 8

        System.out.println( c = a-b ); // 0

        System.out.println( a != c); // true

        System.out.println( a != b ); // false

        System.out.println( a >= b ); // true


        System.out.println(   'a'  <= 'c'); // true

        System.out.println( 'a' == 'a'); // true

        System.out.println( 'b' != 'b'); // false

        System.out.println( 'd' != 'e'); // true

        // String'de == bekledigimiz sonuclari vermeyebilir

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;
        String s7 = new String("Ali");

        System.out.println( s1 == s2 ); // Ali == Ali ==> true
        System.out.println( s1 == s3 ); // Ali == Ali ==> true
        System.out.println( s1 == s6 ); // Ali == Ali ==> false
        System.out.println( s1 == s7 ); // Ali == Ali ==> false

        // SIMDILIK =='i String'leri karsilastirmak icin kullanmayacagiz
        // eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek
        // equals() kullanmaliyiz

        System.out.println( s1.equals(s2) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s3) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s6) ); // Ali equals Ali ==> true
        System.out.println( s1.equals(s7) ); // Ali equals Ali ==> true




    }
}
