package day42_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C09_BelirliElementleriSilme {

    public static void main(String[] args) {

        // Verilen String bir Set'deki
        // istenmeyen harf iceren elementleri silin

        Set<String> isimler = new HashSet<>();
        isimler.add("Cem");
        isimler.add("Murat");
        isimler.add("Furkan");
        isimler.add("Cem");
        isimler.add("Cem");
        isimler.add("Sabri");
        isimler.add("Ridvan");

        System.out.println(isimler); // [Cem, Furkan, Murat, Ridvan, Sabri]

        String istenmeyenHarf = "e";

        // isimler.removeIf( eachIsim -> eachIsim.contains(istenmeyenHarf));

        Iterator itr = isimler.iterator();


        while (itr.hasNext()){

            if (((String) itr.next()).contains(istenmeyenHarf)){
                itr.remove();
            }

        }

        System.out.println(isimler);
    }
}
