package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C02_KeyVeValueyaBirlikteUlasma {

    public static void main(String[] args) {
        // verilen soyisme sahip ogrencilerin
        // numara, isim, sinif ve subelerini yazdirin

        /*
            Eger key ve value'ye birlikte ulasmak istersek

            - key'leri ogrenciMap.keySet() ile alip, bir Set'e kaydederiz

            - bir for-each loop ile her bir key'e ait value'ye ulasip kaydederiz

            - value birlesik bir String oldugundan
              value'daki bilgilere ulasabilmek icin split("-") kullanalim

            - array'deki soyismi arananSoyisim ile karsilastirip
              arananSoyisim ile ayni ise ogrencinin istenen bilgilerini yazdiralim


         */
        String arananSoyisim = "Can";

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107]

        for (Integer eachKey : ogrenciKeySeti ){ // 101

            String eachValue = ogrenciMap.get(eachKey); // "Ali-Can-11-H-MF"

            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if (eachValueArr[1].equalsIgnoreCase(arananSoyisim)){

                System.out.println( eachKey + " "+
                                    eachValueArr[0] + " "+
                                    eachValueArr[2] + " "+
                                    eachValueArr[3]);
            }

        }

    }
}
