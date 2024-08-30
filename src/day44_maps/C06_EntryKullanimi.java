package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;

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

    }
}
