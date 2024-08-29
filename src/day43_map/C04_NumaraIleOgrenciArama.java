package day43_map;

import java.util.Map;

public class C04_NumaraIleOgrenciArama {

    public static void main(String[] args) {

        // ogrenci map'inde verilen numarali ogrencinin
        // sinif, sube, isim ve soyismini yazdirin

        int ogrenciNo = 103;

        Map<Integer, String> ogrenciMap = MapMethodDepo.ogrenciMapOlustur();

        String istenenOgrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Cem-11-K-TM

        String[] istenenOgrenciValueArr = istenenOgrenciValue.split("-"); // [Ali, Cem, 11, K, TM]

        System.out.println(istenenOgrenciValueArr[2] + " " + istenenOgrenciValueArr[3] + " "
                           + istenenOgrenciValueArr[0] + " " + istenenOgrenciValueArr[1]);
    }
}
