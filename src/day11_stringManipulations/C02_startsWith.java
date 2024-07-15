package day11_stringManipulations;

public class C02_startsWith {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        // str Java ile mi basliyor ?
        System.out.println(str.startsWith("Java")); // true

        // str J ile mi basliyor ?
        System.out.println(str.startsWith("J")); // true

        // str Ja ile mi basliyor ?
        System.out.println(str.startsWith("Ja")); // true

        // str "Java cok" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok")); // true


        // str "j" ile mi basliyor ?
        System.out.println(str.startsWith("j")); // false

        // str "a" ile mi basliyor ?
        System.out.println(str.startsWith("a")); // false



        // str "Java cok guzel" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok guzel")); // true


        // str "" ile mi basliyor ?
        System.out.println(str.startsWith("")); // true


        // str " Java" ile mi basliyor ?
        System.out.println(str.startsWith(" Java")); // false


        // "Java cok guzel"

        // 5.index ve sonrasi "cok" ile mi basliyor ?

        System.out.println(str.startsWith("cok", 5)); // true

        System.out.println(str.startsWith(" ", 8)); // true




    }
}













