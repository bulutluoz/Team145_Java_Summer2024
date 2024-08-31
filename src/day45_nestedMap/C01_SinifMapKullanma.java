package day45_nestedMap;

public class C01_SinifMapKullanma extends SinifMapDepo{

    public static void main(String[] args) {

        System.out.println(sinifMap);

        sinifMapeOgrenciEkle(104,"Furkan","Bakir","12","M","MF");

        System.out.println(sinifMap);

        /*
            {
             101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
             102={sinif=11, sube=M, soyisim=Cem, Isim=Veli, bolum=Soz},
             103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
             104={sinif=12, sube=M, soyisim=Bakir, Isim=Furkan, bolum=MF}
             }

         */

        // 103 numarali ogrencinin soyismini yazdirin

        // sinifMap.get(103); // {sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM}

        System.out.println(sinifMap.get(103).get("sube")); // H

        // 104 numarali ogrencinin bolumunu yazdirin

        System.out.println(sinifMap.get(104).get("bolum")); // MF


        // 102 numarali ogrencinin subesini K yapin
        sinifMap.get(102).put("sube","K");


        // 104 numarali ogrencinin bolumunu TM yapin
        sinifMap.get(104).replace("bolum","TM");

        System.out.println(sinifMap);
        /*
            {
             101={sinif=10, sube=H, soyisim=Can, Isim=Ali, bolum=MF},
             102={sinif=11, sube=K, soyisim=Cem, Isim=Veli, bolum=Soz},
             103={sinif=11, sube=H, soyisim=Cem, Isim=Ali, bolum=TM},
             104={sinif=12, sube=M, soyisim=Bakir, Isim=Furkan, bolum=TM}
             }
         */

    }
}
