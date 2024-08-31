package day45_nestedMap;

import java.util.HashMap;
import java.util.Map;

public class C05_MapsMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new HashMap<>();

        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        System.out.println(harfler); // {A=20, B=40, R=30, T=25, Z=2}

        harfler.put("S",12);

        System.out.println(harfler); // {A=20, B=40, R=30, S=12, T=25, Z=2}

        // A'nin degerini 23 yapalim
        // Map'de varolan bir key icin replace ve put ayni islevi yapar

        // harfler.replace("A",23);
        harfler.put("A",23);

        System.out.println(harfler); // {A=23, B=40, R=30, S=12, T=25, Z=2}

        // olmayan element icin kullanilirsa

        harfler.replace("K",5);
        System.out.println(harfler); // {A=23, B=40, R=30, S=12, T=25, Z=2}
        System.out.println(harfler.replace("K", 10)); // null

        // replace yerine put kullanirsak
        // varsa update eder yoksa ekler

        harfler.put("K",12);
        System.out.println(harfler); // {A=23, B=40, R=30, S=12, T=25, Z=2, K=12}

        System.out.println(harfler.replace("K", 5));
        System.out.println(harfler); // {A=23, B=40, R=30, S=12, T=25, Z=2, K=12}

        // replace (key,yeniValue)
        // map'de key varsa
        // key'e ait value'yu yeniValue olarak update eder, ve delil olarak eskiValue'yu getirir
        // map'de key yoksa
        // key olmadigindan update edemez ve delil olarak null dondurur


        harfler.replace("A",23,27);
        System.out.println(harfler); // {A=27, B=40, R=30, S=12, T=25, Z=2, K=12}

        harfler.replace("B",20,25);
        System.out.println(harfler); // {A=27, B=40, R=30, S=12, T=25, Z=2, K=12}

        // eger key'e ait eski deger sizin verdiginiz deger ile ayni ise update eder
        // eski deger ile sizin verdiginiz deger ayni degilse update etmez
        // "B'nin value'su 20 ise sen o value'yu 25 yap"

        harfler.putIfAbsent("A",44);
        System.out.println(harfler); // {A=27, B=40, R=30, S=12, T=25, Z=2, K=12}
        // Eger A YOKSA degeri 44 olacak sekilde map'e ekle

        harfler.putIfAbsent("C",12);
        System.out.println(harfler); // {A=27, B=40, R=30, S=12, C=12, T=25, Z=2, K=5}

        System.out.println(harfler.remove("R")); // 30
        System.out.println(harfler); // {A=27, B=40, S=12, C=12, T=25, Z=2, K=5}

        System.out.println(harfler.remove("M")); // null
        System.out.println(harfler); // {A=27, B=40, S=12, C=12, T=25, Z=2, K=5}

        // varsa silip value'yu delil olarak getirir
        // yoksa silemez ve delil olarak null getirir


        System.out.println(harfler.remove("B", 40)); // true
        System.out.println(harfler); // {A=27, S=12, C=12, T=25, Z=2, K=5}

        System.out.println(harfler.remove("A", 40)); // false
        System.out.println(harfler); // {A=27, S=12, C=12, T=25, Z=2, K=5}

        // key varsa ve degeri bizim verdigimiz deger ise key'i silip, delil olarak true dondurur
        // key yoksa veya deger yanlissa silemez ve delil olarak false dondurur




    }
}
