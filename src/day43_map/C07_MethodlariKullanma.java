package day43_map;

import java.util.Map;

public class C07_MethodlariKullanma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.soyisimdenOgrenciArama(ogrenciMap,"Cem");

    }
}
