package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;

public class C03_ValueUpdate {

    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        //  104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}


        // 102 numarali ogrencinin adini Kemal olarak degistirin

        ogrenciMap.replace(102,"Kemal");

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Kemal, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF,
        //  105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}


        ogrenciMap.replace(102,"Kemal-Cem-10-K-TM"); // eski value : Veli-Cem-10-K-TM
        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Kemal-Cem-10-K-TM, 103=Ali-Cem-11-K-TM,
        //  104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}


        // kod ile 104 numarali ogrencinin soyismini Yilmaz yapin


    }
}
