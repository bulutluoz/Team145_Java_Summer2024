package day46_maps;

import java.util.Map;
import java.util.TreeMap;

public class C02_KullanimAdetleriniBulma {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // her bir elementi ve kacar defa kullanildigini yazdirin

        String[] harfler = { "a", "b","d","a","r","a","b","d","d","a", "a" ,"t"};
        // output a=5, b=2, d=3, r=1, t=1

        Map<String,Integer> kullanimMiktarlariMap = new TreeMap<>();


        for (String each : harfler ){

            kullanimMiktarlariMap.computeIfPresent( each , (k,v) -> v+1 );
            kullanimMiktarlariMap.putIfAbsent(each,1);


        }

        System.out.println(kullanimMiktarlariMap);




    }
}
