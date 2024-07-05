package day05_matematikselIslemler_Concatenation;

public class C05_Concatenation {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";

        int a = 5;
        int b = 3;

        // sadece variable'lari kullanarak asagida istenen metinleri yazdirin

        // Java Candir 35

        System.out.println( s1 + s3 + s2 +  s3 + b + a   ); // Java Candir 35

        // Java Candir 8

        System.out.println(  s1 + s3 + s2 +  s3 + (b + a)    ); // Java Candir 8

        // 15 Java

        System.out.println(  a * b + s3 + s1    ); // 15 Java

        // 35 Candir

        System.out.println(  b + a + s3 + s2    ); // 8 Candir

        System.out.println(  s4 + b + a + s3 + s2    ); // 35 Candir

        System.out.println(  b + s4 + a + s3 + s2    ); // 35 Candir


        // Java8Candir

        System.out.println( s1 + a + b + s2   ); // Java53Candir

        System.out.println( s1 + (a + b) + s2   ); // Java8Candir
    }
}
