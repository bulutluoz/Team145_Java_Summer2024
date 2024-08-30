package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;

public class C05_SoyisimUpdate {

    public static void main(String[] args) {

        // verilen ogrenci numarasinin bilgilerine ulasip
        // soyismini istenen yeni deger olarak update edin
        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap = MapMethodDepo.soyismiGuncelle(ogrenciMap,103,"Celik");
        ogrenciMap = MapMethodDepo.soyismiGuncelle(ogrenciMap,105,"Mutlu");

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Celik-11-K-TM,
        //  104=Ayse-Can-10-H-MF, 105=Sevgi-Mutlu-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}


    }
}
