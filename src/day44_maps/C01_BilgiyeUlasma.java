package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Collection;
import java.util.Map;

public class C01_BilgiyeUlasma {

    public static void main(String[] args) {

        /*
            sadece value'ya ihtiyacimiz varsa
            orn :  10/K sinifindaki ogrencilerin isim ve soyisimlerini yazdirin
            - tum value'leri kaydederiz
              ogrenciMap.values() method'u collection olarak tum value'leri getirir

            - bir for-each loop ile her bir value'u ele alalim

            - bizim oglanin getirdigi value'yu split ile bolup
              bir array olarak kaydedelim ki bilgilere direk ulasabilelim

            - kaydettigimiz valueArr' inde sinif ve subeyi kontrol edip
              istenen sinif ve sube ile ayni ise
              ogrencinin isim ve soyismini yazdiralim


         */

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        Collection<String> ogrenciValueColl = ogrenciMap.values();

        for ( String eachValue : ogrenciValueColl ) { // "Ali-Can-11-H-MF"

            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if ( eachValueArr[2].equalsIgnoreCase("10") &&
                 eachValueArr[3].equalsIgnoreCase("K") ){

                System.out.println(eachValueArr[0] + " " + eachValueArr[1]);

            }
        }
    }
}
