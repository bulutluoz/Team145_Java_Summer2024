package day43_map;

import java.util.Map;

public class C05_SubeListesiYazdirma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        // sinif ve sube verildiginde
        // o siniftaki ogrencilerin
        // numara, isim, soyisim lerini liste olarak alt alta yazdiran bir method olusturun


        System.out.println( ogrenciMap.keySet());
        // [101, 102, 103, 104, 105, 106, 107]

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF,
        //  Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        MapMethodDepo.subeListesiYazdir(ogrenciMap,"11","M");

        /*
        ========11/M sinif listesi=======
        105 Sevgi Cem
        107 Esra Han
         */
    }
}
