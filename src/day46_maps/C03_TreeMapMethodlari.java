package day46_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C03_TreeMapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",20);
        map1.put("B",40);
        map1.put("Z",2);
        map1.put("T",25);
        map1.put("R",30);
        System.out.println(map1); // {A=20, B=40, R=30, T=25, Z=2}
        map1.put("K",2);
        System.out.println(map1); // {A=20, B=40, R=30, T=25, Z=2, K=2}

        Map<String,Integer> map2 = new TreeMap<>();
        map2.put("A",20);
        map2.put("B",40);
        map2.put("Z",2);
        map2.put("T",25);
        map2.put("R",30);
        System.out.println(map2); // {A=20, B=40, R=30, T=25, Z=2}
        map2.put("K",2);
        System.out.println(map2); // {A=20, B=40, K=2, R=30, T=25, Z=2}
        map2.put("M",8);
        System.out.println(map2); // {A=20, B=40, K=2, M=8, R=30, T=25, Z=2}
        /*
            Constructor TreeMap secilmis olsa da
            Data turu olarak Map secildigi icin
            map2 BUTUN MAP"lerle ortak method isimlerine sahiptir

            TreeMap class'ina sonradan eklenen
            ve sadece TreeMap'lerin sahip oldugu method'lar
            map2'de gorunmez
         */


        TreeMap<String,Integer> map3 = new TreeMap<>();

        /*
            Constructor ve data turu TreeMap secildigi icin
            TreeMap'e eklenen ve parent'i olan Map'de olmayan
            pekcok ozelligi kullanabiliriz
         */

    }
}
