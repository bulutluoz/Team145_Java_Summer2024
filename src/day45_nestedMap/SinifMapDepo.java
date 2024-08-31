package day45_nestedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SinifMapDepo {

    public static Map<Integer, Map<String,String> > sinifMap = new HashMap<>();

    static {
        /*

                sinifMap= { 101={Isim=Ali, soyisim=Can, sinif=10, sube=H, bolum=MF },
                            102={Isim=Veli, soyisim=Cem, sinif=11, sube=M, bolum=Soz
                            103={Isim=Ali, soyisim=Cem, sinif=11, sube=H, bolum=TM }

         */
        // {"Isim"="Ali", "soyisim"="Can", "sinif"="10", "sube"="H", "bolum"="MF" }
        Map<String,String > ogrenciMap101 = new HashMap<>();
        ogrenciMap101.put("Isim","Ali");
        ogrenciMap101.put("soyisim","Can");
        ogrenciMap101.put("sinif","10");
        ogrenciMap101.put("sube","H");
        ogrenciMap101.put("bolum","MF");

        sinifMap.put(101,ogrenciMap101);
        sinifMapeOgrenciEkle(102,"Veli","Cem","11","M","Soz");
        sinifMapeOgrenciEkle(103,"Ali","Cem","11","H","TM");
        sinifMapeOgrenciEkle(104,"Ayse","Can","10","H","MF");
        sinifMapeOgrenciEkle(105,"Sevgi","Cem","11","M","TM");
        sinifMapeOgrenciEkle(106,"Sevgi","Can","10","K","MF");
        sinifMapeOgrenciEkle(107,"Esra","Han","11","M","SOZ");

    }

    public static void sinifMapeOgrenciEkle(Integer oNo, String isim, String soyisim,
                                            String sinif, String sube, String bolum){
        Map<String,String > ogrenciMap = new HashMap<>();
        ogrenciMap.put("Isim",isim);
        ogrenciMap.put("soyisim",soyisim);
        ogrenciMap.put("sinif",sinif);
        ogrenciMap.put("sube",sube);
        ogrenciMap.put("bolum",bolum);

        sinifMap.put(oNo,ogrenciMap);

    }

    public static void topluSinifArtir(){
        Set<Integer> sinifKeySeti =  sinifMap.keySet();

        for (Integer eachKey : sinifKeySeti){

            String ogrenciSinifi = sinifMap.get(eachKey).get("sinif").toLowerCase();


            switch (ogrenciSinifi){

                case "9" :
                    sinifMap.get(eachKey).put("sinif","10");
                    break;
                case "10" :
                    sinifMap.get(eachKey).put("sinif","11");
                    break;
                case "11" :
                    sinifMap.get(eachKey).put("sinif","12");
                    break;
                case "12" :
                    sinifMap.get(eachKey).put("sinif","mezun");

            }

        }
    }


}
