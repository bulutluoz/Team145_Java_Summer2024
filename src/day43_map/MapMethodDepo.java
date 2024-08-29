package day43_map;

import java.util.HashMap;
import java.util.Map;

public class MapMethodDepo {

    // bir ogrenci map'i olusturup
    // icine ogrenci ekleyen
    // ve map'in son halini bize donduren bir method olusturun

    public static Map<Integer,String> ogrenciMapOlustur(){


        Map< Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        return ogrenciMap;
    }
}
