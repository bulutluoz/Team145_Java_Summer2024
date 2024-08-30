package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C06_EntryKullanimi {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF,
        //  105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}


        // her bir ogrenciye ait key ve value'yu tek bir deger olarak ele alip
        // tek bir for-each loop ile gozden gecirebilir miyiz ?

        // Java'daki Entry class'i key ve value'yu birlikte
        // tek bir eleman olarak ele almamiza imkan tanir

        Set< Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();
        // Bu bir Set oldugu icin for-each loop ile elemanlari gozden gecirebiliriz
        // 11.siniftaki ogrencileri 12.sinif yapin

        System.out.println(ogrenciEntrySeti);
        // [101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF,
        //  105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ]

        // for-each loop ile herbir Entry'i ele alalim

        for (Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){

            /* her bir entry'den key ve value'ye ulasma sansi var

            System.out.println(eachEntry.getKey() + "======" + eachEntry.getValue());
            101======Ali-Can-11-H-MF
            102======Veli-Cem-10-K-TM
            103======Ali-Cem-11-K-TM
            104======Ayse-Can-10-H-MF
            105======Sevgi-Cem-11-M-TM
            106======Sevgi-Can-10-K-MF
            107======Esra-Han-11-M-SOZ
             */

            // gorev 11.siniflari 12.sinif yapmak

            // value'yu array'e cevirelim
            String[] valueArr = eachEntry.getValue().split("-");

            // array'de sinifi kontrol edelim 11 ise 12 olarak degistirelim
            if (valueArr[2].equalsIgnoreCase("11")){
                valueArr[2] = "12";

                // degistirilmis hali yeniValue olarak kaydedelim
                String yeniValue = String.join("-",valueArr);

                // map'de update icin key ve yeniValue birlikte kullanmamiz gerekiyordu
                // Entry'de value'yu setValue() ile guncellemeniz yeterli olur

                eachEntry.setValue(yeniValue);
            }


        }

        System.out.println(ogrenciMap);
        // {101=Ali-Can-12-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-12-K-TM,
        //  104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-12-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-12-M-SOZ}

    }
}
