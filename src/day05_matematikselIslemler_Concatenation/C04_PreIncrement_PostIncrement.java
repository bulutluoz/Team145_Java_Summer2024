package day05_matematikselIslemler_Concatenation;

public class C04_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        /*
            ++ ve --'nin ozel bir kullanimi vardir
            EGER bir satirda sadece ++a veya a++ varsa, ikisi de ayni islevi yapar
            ve a'nin degerini bir artirirlar.
            ayni sekilde bir satirda sadece --a veya a-- varsa ayni islevi yaparlar
         */

        int a = 20;
        int b = 40;

        a++;
        b--;

        System.out.println("20.satirda a : " + a + ", b : " + b); // 21 , 39

        ++a;
        --b;

        System.out.println("25.satirda a : " + a + ", b : " + b); // 22 , 38


        System.out.println(a++);//22

        System.out.println("30.satirda a : " + a + ", b : " + b); // 23 , 38


        System.out.println(++a);//24

        System.out.println("35.satirda a : " + a + ", b : " + b); // 24 , 38

        System.out.println(b--);//38


        System.out.println("40.satirda a : " + a + ", b : " + b); // 24 , 37


        System.out.println(--b);// 36




        System.out.println("48.satirda a : " + a + ", b : " + b); // 24 , 36


        a = b++;


        System.out.println("54.satirda a : " + a + ", b : " + b); // 36 , 37



        a= ++b;


        System.out.println("61.satirda a : " + a + ", b : " + b); // 38 , 38


        b = a++ / 2 ;


        System.out.println("67.satirda a : " + a + ", b : " + b); // 39 , 19


        b = ++a / 2 ;



        System.out.println("74.satirda a : " + a + ", b : " + b); // 40 , 20














    }
}
