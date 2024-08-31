package day45_nestedMap;

import java.util.Map;
import java.util.TreeMap;

public class C06_ElementleriSayma {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // her bir elementi ve kacar defa kullanildigini yazdirin

        String[] harfler = { "a", "b","d","a","r","a","b","d","d","a", "a" ,"t"};
        // output a : 4, b : 2, d : 3, r: 1

        Map<String,Integer> kullanimMiktarlariMap = new TreeMap<>();



        // array'deki her bir harfi ele alalim
        for (String eachHarf : harfler){

            if ( kullanimMiktarlariMap.containsKey(eachHarf)){

                Integer eskiValue = kullanimMiktarlariMap.get(eachHarf);
                kullanimMiktarlariMap.put(eachHarf,eskiValue+1);

            }else {
                kullanimMiktarlariMap.put(eachHarf,1);
            }

        }

        System.out.println(kullanimMiktarlariMap); // {a=5, b=2, d=3, r=1, t=1}




    }
}
