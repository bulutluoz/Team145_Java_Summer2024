package day42_collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C07_TekrarlariSilme {

    public static void main(String[] args) {

        // verilen bir array'de tekrar eden elementleri silip
        // array'i her elementin sadece 1 tane oldugu hale donusturen
        // ve bize donduren bir method olusturun

       int[] sayilar = {2,4,5,4,3,5,6,7,3,2,4,5,8,2,3,4,5,1,2,3};

       tekrarsizArrayYap(sayilar);

        System.out.println("Method call'dan sonra sayilar : " + Arrays.toString(sayilar));

        sayilar = tekrarsizArrayYap(sayilar);

        System.out.println("Method sonucunu sayilar'a atadiktan sonra : " + Arrays.toString(sayilar));

    }

    public static int[] tekrarsizArrayYap( int[] sayilar){

        Set<Integer> tekrarsizSet = new TreeSet<>();

        for (Integer each : sayilar){

            tekrarsizSet.add(each);
        }

        // array'deki elementleri Set'e ekleyerek
        // tekrarsiz bir Set elde ettik
        // simdi sayilar array'ini Set'deki elementlerden olusan bir hale donusturmemiz gerekir

        // method'da arr : [2, 4, 5, 4, 3, 5, 6, 7, 3, 2, 4, 5, 8, 2, 3, 4, 5, 1, 2, 3]
        // Tekrarsiz Set : [1, 2, 3, 4, 5, 6, 7, 8]

        // array'e eleman eklemek icin index'e ihtiyacimiz var
        // ama Set index desteklemez onun icin for-each loop kullanir
        // bu durumda for-each ile kullanilmak uzere kendi index'imizi olusturmaliyiz

        sayilar = new int[tekrarsizSet.size()]; // [0, 0, 0, 0, 0, 0, 0, 0]

        int index = 0;

        for (Integer each : tekrarsizSet){

            sayilar[index] = each;
            index++;

        }

        return sayilar;
    }
}
