package day43_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public static void soyisimdenOgrenciArama( Map<Integer,String> ogrenciMap , String arananSoyisim){
        // verilen soyisim'e sahip ogrencilerin
        // sinif sube isim ve soyisimlerini
        // alt alta yazdirin


        // 1- tum value'lari alirim ve kaydederim
        Collection<String> ogrenciValueleriColl = ogrenciMap.values();


        // 2- herbir value'u split ile ayirip
        //    soyisminin istenen soyisim olup olmadigini kontrol ederim
        for (String eachValue : ogrenciValueleriColl){

            String[] eachValueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]

            if (eachValueArr[1].equalsIgnoreCase(arananSoyisim)){

                System.out.println(eachValueArr[2] + " " + eachValueArr[3] + " "+
                        eachValueArr[0] + " " + eachValueArr[1] );

            }

        }

        // 3- Eger soyisim istenen soyisim ile ayni ise
        //    split ettigim bilgiden sinif sube isim ve soyisimlerini yazdiririm


    }

    public static void subeListesiYazdir(Map<Integer,String> ogrenciMap , String sinif , String sube){

        System.out.println("========" +sinif + "/"+sube + " sinif listesi=======");


        // tum ogrencilerin key'lerini bir Set olarak kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107]

        for (Integer eachKey : ogrenciKeySeti){
            // diyelim ki eachKey = 101 oldu

            // key Set'indeki herbir key'i kullanarak
            // O key'e ait value'yu kaydedelim
            String value = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // kaydettigimiz value'u split edip
            // sinif ve sube degerlerini istenen sinif ve sube degerleriyle karsilastiralim

            String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]

            if ( valueArr[2].equalsIgnoreCase(sinif) && valueArr[3].equalsIgnoreCase(sube)){
                // sinif ve sube istenen degerlere sahipse
                // ogrencinin numara, isim ve soyismini yazdiralim

                System.out.println( eachKey +" " + valueArr[0] + " " + valueArr[1]);

            }




        }




    }

    public static void isimdenOgrenciArama(Map<Integer,String> ogrenciMap , String arananIsim){

        // verilen isme sahip ogrencilerin
        // Numara, sinif, sube, isim ve soyisimlerini yazdiran
        // bir method olusturun


        // key'leri bir Set olarak kaydedelim


        // Herbir key'i ele alip
        // o key'e ait value'yu kaydedelim


        // value'yu split edip isim degerini arananIsim ile karsilastiralim


        // isim aranan isme esit ise numara, sinif, sube, isim ve soyismini yazdiralim



    }



}
