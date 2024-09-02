package day46_maps;

import java.util.TreeMap;

public class C04_TreeMapMethodlari {

    public static void main(String[] args) {

        TreeMap<String,Integer> harfler = new TreeMap<>();
        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        System.out.println(harfler); // {A=20, B=40, R=30, T=25, Z=2}

        harfler.put("K",23);
        System.out.println(harfler); // {A=20, B=40, K=23, R=30, T=25, Z=2}

        // TreeMap DOGAL SIRALI oldugunda
        // bir elemanin sirada onundekiler veya arkasindakiler ile ilgili
        // pek cok method vardir

        // 1- headMap verilen Key'den basa kadar olan tum map'i verir
        // {A=20, B=40, K=23, R=30, T=25, Z=2}

        System.out.println(harfler.headMap("R"));
        // {A=20, B=40, K=23}  R dahil degil, cunku bitis
        System.out.println(harfler.headMap("L"));
        // {A=20, B=40, K=23} L yok ama olsaydi, bulunacagi yerden basa kadar olan map'i verir

        System.out.println(harfler.headMap("R", true));
        // {A=20, B=40, K=23, R=30} R dahil, cunku inclusive=true secildi
        System.out.println(harfler.headMap("L",true));
        // {A=20, B=40, K=23}  L inclusive=true secildi AMMA map'de L yok


        // 2 - tail Map : girilen key dahil, sonrasindeki Entry'leri verir
        // {A=20, B=40, K=23, R=30, T=25, Z=2}

        System.out.println(harfler.tailMap("K"));
        // {K=23, R=30, T=25, Z=2}
        System.out.println(harfler.tailMap("L"));
        // {R=30, T=25, Z=2}

        System.out.println(harfler.tailMap("K", false));
        // K dahil olmadan sonrasindaki Entry'ler {R=30, T=25, Z=2}
        System.out.println(harfler.tailMap("L",false));
        // L dahil olmadan diyoruz ama zaten L olmadigindan degisen birsey olmaz
        // {R=30, T=25, Z=2}


        // 3- lowerKey : verilen key'den kucuk olan key'lerin en buyugu
        //               diger bir deyisle verilen key'den bir onceki key
        //    floorKey : verilen key'den kucuk veya esit olan tum key'ler icinde en buyugu verir
        //               diger deyisle verilen key'i asagi dogru yuvarlar

        // {A=20, B=40, K=23, R=30, T=25, Z=2}
        System.out.println(harfler.lowerKey("K")); // B
        System.out.println(harfler.lowerKey("S")); // R
        System.out.println(harfler.lowerKey("A")); // null

        System.out.println(harfler.floorKey("K")); // K
        System.out.println(harfler.floorKey("S")); // R


        // 4- higherKey : verilen key'den buyuk olan key'ler icerisinde en kucuk olani verir
        //    ceilingKey : verilen key'den buyuk esit olan key'ler icerisinde en kucuk olani verir
        // {A=20, B=40, K=23, R=30, T=25, Z=2}

        System.out.println(harfler.higherKey("K")); // R
        System.out.println(harfler.higherKey("S")); // T

        System.out.println(harfler.ceilingKey("K")); // K
        System.out.println(harfler.ceilingKey("S")); // T

        // {A=20, B=40, K=23, R=30, T=25, Z=2}
        System.out.println(harfler.descendingMap());
        // {Z=2, T=25, R=30, K=23, B=40, A=20}

        // harfler = (TreeMap<String, Integer>) harfler.descendingMap(); // ClassCastException


        System.out.println(harfler.pollFirstEntry()); // A=20
        // ilk entry'yi siler ve bize getirir

        System.out.println(harfler); // {B=40, K=23, R=30, T=25, Z=2}

        System.out.println(harfler.firstEntry()); // B=40
        System.out.println(harfler.lastEntry()); // Z=2

        System.out.println(harfler); // {B=40, K=23, R=30, T=25, Z=2}
    }
}
