package day11_stringManipulations;

public class C10_lastIndexOf {

    public static void main(String[] args) {

        String str = "ali topu tut, tut ali tut" ;

        // tut kelimesinin son kullanim index'i nedir?

        System.out.println(str.lastIndexOf("tut")); // 22


        // tut kelimesinin sondan ikinci kullaniminin index'i nedir?

        System.out.println(str.lastIndexOf("tut", 21)); // 14



        // tut kelimesinin sondan ucuncu kullaniminin index'i nedir?

        System.out.println(str.lastIndexOf("tut", 13)); // 9
    }
}
