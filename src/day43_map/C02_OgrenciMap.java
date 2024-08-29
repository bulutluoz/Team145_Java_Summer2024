package day43_map;

import java.util.*;

public class C02_OgrenciMap {

    public static void main(String[] args) {

        Map< Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        // {
        //      101=Ali-Can-11-H-MF,
        //      102=Veli-Cem-10-K-TM,
        //      103=Ali-Cem-11-K-TM,
        //      104=Ayse-Can-10-H-MF,
        //      105=Sevgi-Cem-11-M-TM,
        //      106=Sevgi-Can-10-K-MF,
        //      107=Esra-Han-11-M-SOZ
        //      }

        // 103 numarali ogrencinin value'sunu yazdirin
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // olmayan bir key ile value'yu yazdirsak
        System.out.println(ogrenciMap.get(111)); // null

        // aranan key yoksa standart bir cevap yazmasini istersek
        System.out.println(  ogrenciMap. getOrDefault(105,"bu numarada ogrenci yok"));
        // Sevgi-Cem-11-M-TM

        System.out.println(  ogrenciMap. getOrDefault(125,"bu numarada ogrenci yok"));
        // bu numarada ogrenci yok

        // butun key'leri yazdirin
        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 107]

        // butun key'leri kaydedin

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();


        // ogrenci map'inde 107 numarali ogrenci var mi ?

        System.out.println(ogrenciMap.containsKey(107)); // true
        System.out.println(ogrenciMap.containsKey(147)); // false

        // tum value'leri yazdirin
        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM,
        //  Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]

        // tum value'leri kaydedin

        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        // LinkedList<String> ogrenciValueList = (LinkedList<String>) ogrenciMap.values();
        // ClassCastException

        // Set<String> ogrenciValueSet = (Set<String>) ogrenciMap.values();
        // ClassCastException

        System.out.println(ogrenciValueCollection);
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        // value'larda Ali var mi ?
        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true

        // value'larda Ali var mi ?
        // bir loop ile value collection'indaki tum String value'leri kontrol edip
        // Ali var mi bilgisine ulasabiliriz

        boolean aliVarMi = false;

        for(String eachValue : ogrenciValueCollection){

            if (eachValue.contains("Ali")){
                aliVarMi = true;
            }
        }
        System.out.println("Ali var mi? : " + aliVarMi);
    }
}
