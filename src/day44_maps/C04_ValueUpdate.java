package day44_maps;

import day43_map.MapMethodDepo;

import java.util.Map;
import java.util.Set;

public class C04_ValueUpdate {

    public static void main(String[] args) {

        // 10/K sinifindaki ogrencilerin subelerini Z yapin

        // Key olmadan update yapamayacagimiz icin
        // Yola value collection'i ile degil
        // keySet ile cikmaliyiz

        /*
            - butun key'leri bir sete kaydedelim
            - butun key'leri bir for loop ile elden gecirelim
            - ele aldigimiz key'in value'sunu kaydedelim
            - value'daki bilgilere ulasmak icin array'e cevirelim
            - array'de istenen sarti saglayip saglamadigini kntrol edelim,
              sagliyorsa array'de update yapalim 10/K --> 10/Z
              ( eger if body'sinde update'i yaparsak,
                sadece sarti saglayan value'leri degistirip,
                sonra map'e eklemis oluruz)
         */
        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        Set<Integer> keySeti = ogrenciMap.keySet();

        for ( Integer eachKey : keySeti ) { // 101

            String eachValue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if (eachValueArr[2].equalsIgnoreCase("10") &&
                eachValueArr[3].equalsIgnoreCase("K")){

                eachValueArr[3] = "Z"; // sarti saglayanlarin subesini degistirir

                String yeniValue = String.join("-",eachValueArr);
                ogrenciMap.put(eachKey,yeniValue);

            }
            // eger if'in disinda array'i birlestirip map'e eklersek
            // degisim olsun  - olmasin butun value'leri yeniden map'e eklemis oluruz


        }

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-Z-TM, 103=Ali-Cem-11-K-TM,
        //  104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-Z-MF, 107=Esra-Han-11-M-SOZ}

    }
}
