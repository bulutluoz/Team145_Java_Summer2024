package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_IstenmeyenElementleriSilme {

    public static void main(String[] args) {

        /*
            String'de method ile yapilan degisiklikler
            atama yapilmazsa kalici olmuyordu

            ANCAK
            array ve arrayList'de method ile yapilan degisiklikler
            atama olmasa da KALICI olur
         */

        // Verilen String bir listede
        // istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Can"));

        System.out.println(istenmeyenElemanlariSil(isimler, "e")); // [Ali, Fatma, Can]

        System.out.println(istenmeyenElemanlariSil(isimler, "a")); // [Ali]

        System.out.println(istenmeyenElemanlariSil(isimler, "A")); // []


    }


    public static List<String> istenmeyenElemanlariSil( List<String> ilkList , String istenmeyenHarf ){

        // [Ali, Veli, Ayse, Fatma, Can]

        for (int i = 0; i < ilkList.size() ; i++) {

            if (ilkList.get(i).contains(istenmeyenHarf)){

                ilkList.remove(ilkList.get(i));
                i--;
            }

        }

        return ilkList;
    }
}
