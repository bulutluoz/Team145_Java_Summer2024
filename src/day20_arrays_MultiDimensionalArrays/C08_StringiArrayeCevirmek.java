package day20_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C08_StringiArrayeCevirmek {

    public static void main(String[] args) {

        String str = "Ali topu at, at topu Ali";

        String[] atArrayi = str.split("at");

        System.out.println(Arrays.toString(atArrayi));

        // [Ali topu , , ,  topu Ali]

        // cumledeki en uzun kelimeyi yazdirin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler));
        // [Ali, topu, at,, at, topu, Ali]

        C04_EnUzunVeEnKisaKelime.enKisaVeEnUzunIsmiYazdir(kelimeler);
        // en uzun : topu     en kisa : at



    }
}
