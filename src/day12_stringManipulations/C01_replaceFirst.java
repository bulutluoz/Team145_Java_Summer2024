package day12_stringManipulations;

import java.util.Scanner;

public class C01_replaceFirst {

    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        // t harflerini T yapin
        System.out.println(str.replace('t', 'T'));  // Ali Topu aT, aT Ali aT
        System.out.println(str.replace("t", "T")); // Ali Topu aT, aT Ali aT

        // cumlede kullanilan ilk a yerine X yazin
        System.out.println(str.replace('a', 'X')); // Ali topu Xt, Xt Ali Xt

        // System.out.println(str.replaceFirst('a', 'X'));
        // replaceFirst() de char KULLANILMAZ

        System.out.println(str.replaceFirst("a", "X")); // Ali topu Xt, at Ali at


        // kullanicidan bir metin isteyin
        // girilen metinde varsa, ilk kullanilan sayi yerine X yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        /*
            regex ==> regular expression (duzenli kisaltma, belirlenmis kisaltmalar)
            \\s : space	 	\\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits		\\D : digit olmayan hersey
            \\w : harf, rakam veya _	\\W : harf, rakam veya _ olmayan hersey

         */
        System.out.println(metin.replaceFirst("\\d", "X"));


        // Kullanicidan kredi karti numarasini isteyin
        // kullanici kart numarasi arasinda bosluklar birakabilir
        // bosluklara dokunmadan, sadece sayilarin yerine * yazdirin

        System.out.println("Lutfen kart numaranizi giriniz...");
        String kartNo = scanner.nextLine();

        System.out.println(kartNo.replaceAll("\\d", "*"));
    }
}
