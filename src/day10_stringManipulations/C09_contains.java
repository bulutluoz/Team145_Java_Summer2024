package day10_stringManipulations;

public class C09_contains {

    public static void main(String[] args) {

        String str = "hafta sonu java yok";

        // Verilen String'in isten bir harf veya metni icerip icermedigini anlamak icin kullanilir
        // contains method'u aranan harf veya metnin kac kere kullanildigi ile ILGILENMEZ
        // contains method'u aradigi metni case sensitive olarak arar


        System.out.println(str.contains("a")); // true

        System.out.println(str.contains("k")); // true

        System.out.println(str.contains("onu")); // true

        System.out.println(str.contains("A")); // false

        System.out.println(str.contains("Java")); // false

        System.out.println(str.contains("u j")); // true

        System.out.println(str.contains("hk")); // false

        System.out.println(str.contains("h                 k")); // false

        // System.out.println(str.contains('a')); // contains() char parametre kabul etmez

    }
}
