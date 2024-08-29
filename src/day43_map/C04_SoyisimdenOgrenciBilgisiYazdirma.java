package day43_map;

import java.util.Map;

public class C04_SoyisimdenOgrenciBilgisiYazdirma {

    public static void main(String[] args) {

        // verilen soyisim'e sahip ogrencilerin
        // sinif sube isim ve soyisimlerini
        // alt alta yazdirin

        Map<Integer,String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();
        // esitligin sag tarafi depo'dan hazir map'i alip getirdi
        // biz gelen hazir map'i bu class'da olusturdugumuz
        // ogrenci map'ine atadik

        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF, 107=Esra-Han-11-M-SOZ}


        // 1- tum value'lari alirim ve kaydederim

        // 2- herbir value'u split ile ayirip
        //    soyisminin istenen soyisim olup olmadigini kontrol ederim

        // 3- Eger soyisim istenen soyisim ile ayni ise
        //    split ettigim bilgiden sinif sube isim ve soyisimlerini yazdiririm




    }
}
