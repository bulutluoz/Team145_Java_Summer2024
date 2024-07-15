package day11_stringManipulations;

public class C03_endsWith {

    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // metin "zevkli" ile mi bitiyor ?

        System.out.println(str.endsWith("zevkli")); // true

        // metin "li" ile mi bitiyor ?

        System.out.println(str.endsWith("li")); // true

        // metin "vkli" ile mi bitiyor ?

        System.out.println(str.endsWith("vkli")); // true

        // metin "Java ogrenmek cok zevkli" ile mi bitiyor ?

        System.out.println(str.endsWith("Java ogrenmek cok zevkli")); // true

        // metin "" ile mi bitiyor ?

        System.out.println(str.endsWith("")); // true



    }
}
