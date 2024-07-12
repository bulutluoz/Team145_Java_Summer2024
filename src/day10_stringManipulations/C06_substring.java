package day10_stringManipulations;

public class C06_substring {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.length()); // 30

        // 12.karakteri yazdirin
        System.out.println(str.charAt(11)); // c

        // 10.karakterden baslayip, sona kadar butun metni yazdirin
        System.out.println(str.substring(9)); // gectikce guzellesiyor

        // ilk kelime haric geriye kalan metni yazdirin  "gun gectikce guzellesiyor"
        System.out.println(str.substring(5)); // gun gectikce guzellesiyor

        // ilk harf haric, kalan metni yazdirin
        System.out.println(str.substring(1));// ava gun gectikce guzellesiyor

        // son 5 karkteri yazdirin
        System.out.println(str.substring(str.length() - 5)); // siyor

        // length 30 , son harfin index'i 29

        System.out.println(str.substring(29)); // r
        System.out.println(str.substring(30)); // hiclik
        //System.out.println(str.substring(355)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()-1)); // r
        System.out.println(str.substring(str.length())); // hiclik
        //System.out.println(str.substring(str.length()+1)); // StringIndexOutOfBoundsException


    }
}
