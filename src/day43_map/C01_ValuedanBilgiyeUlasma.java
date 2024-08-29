package day43_map;

import java.util.Arrays;

public class C01_ValuedanBilgiyeUlasma {

    public static void main(String[] args) {

        // bir ogrencinin bilgileri tek bir String halinde
        // asagida verilen formatla tutulmaktadir
        // ogrenci bilgisi verildiginde soyismi yazdirin

        String ogrenciBilgisi = "Ali-Can-10-H-MF";

        String[] ogrenciBilgiArrayi = ogrenciBilgisi.split("-");

        System.out.println(Arrays.toString(ogrenciBilgiArrayi));
        // [Ali, Can, 10, H, MF]

        // soyismini yazdirin

        System.out.println("Ogrencinin soyismi : " + ogrenciBilgiArrayi[1]); // Can

        // subesini yazdirin
        System.out.println("Ogrencinin subesi: " + ogrenciBilgiArrayi[3]); // H

        // bolumunu yazdirin
        System.out.println("Ogrencinin bolumu : " + ogrenciBilgiArrayi[4]); // MF
    }
}
