package day11_stringManipulations;

public class C08_LastIndexOf {

    public static void main(String[] args) {

        String str = "ali topu tut, tut ali tut";

        // cumlede "tut" un ilk kullanim index'i
        System.out.println(str.indexOf("tut")); // 9

        // cumlede "tut" un ikinci kullanim index'i
        System.out.println(str.indexOf("tut",10)); // 14

        // cumlede "tut" un ucuncu kullanim index'i
        System.out.println(str.indexOf("tut",15)); // 22


        // cumlede "ali" nin ilk kullanim index'i
        System.out.println(str.indexOf("ali")); // 0


        // cumlede "ali" nin ikinci kullanim index'i
        System.out.println(str.indexOf("ali",1)); // 18


        // cumlede "top" un ilk kullanim index'i
        System.out.println(str.indexOf("top")); // 4

        // "ali topu tut, tut ali tut"

        // cumlede "ali" nin son kullanim index'i
        System.out.println(str.lastIndexOf("ali")); // 18

        // cumlede "tut" un son kullanim index'i
        System.out.println(str.lastIndexOf("tut")); // 22

        // cumlede "top" nin son kullanim index'i
        System.out.println(str.lastIndexOf("top")); // 4

        // top icin ilk kullanim indexi = 4, son kullanim indexi = 4 ==> 1 kere kullanilmis

        // tut icin ilk kullanim indexi = 9, son kullanim indexi = 22 ==> 1'den fazla kullanilmis

        // Varol icin ilk kullanim indexi = -1, son kullanim indexi = -1 ==> yok

    }
}
