package day45_nestedMap;

import java.util.Set;

public class C02_IstenenListeyiOlusturma extends SinifMapDepo{

    public static void main(String[] args) {

        // sinif map'inde 11.siniftaki ogrencilerin
        // numara , sinif, sube, isim ve soyisimlerini liste olarak yazdirin

        System.out.println(sinifMap);
        /*
            {
            101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
            102={sinif=11, sube=M, soyisim=Cem, Isim=Veli, bolum=Soz},
            103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
            104={sinif=10, sube=H, soyisim=Can, Isim=Ayse, bolum=MF},
            105={sinif=11, sube=M, soyisim=Cem, Isim=Sevgi, bolum=TM},
            106={sinif=10, sube=K, soyisim=Can, Isim=Sevgi, bolum=MF},
            107={sinif=11, sube=M, soyisim=Han, Isim=Esra, bolum=SOZ}}
         */

        // 11.siniftakileri bulmak icin herbir ogrencinin sinif bilgisini kontrol etmeliyiz
        Set<Integer> sinifKeySeti = sinifMap.keySet();

        // sinifKeySeti ile bir for-each loop olusturabiliriz

        for (Integer eachKey : sinifKeySeti){

            if(sinifMap.get(eachKey).get("sinif").equalsIgnoreCase("11")){

                System.out.println(
                     eachKey + " " +
                     sinifMap.get(eachKey).get("sinif")   + " " +
                     sinifMap.get(eachKey).get("sube")   + " " +
                     sinifMap.get(eachKey).get("Isim")   + " " +
                     sinifMap.get(eachKey).get("soyisim")
                );
            }

        }
    }
}
