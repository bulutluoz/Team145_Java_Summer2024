package day41_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>( Arrays.asList(4, 6, 7, 2, 3, 5, 6));
        // INDEX kullanmadan sayilar listesindeki tek sayilari silin

        Iterator itr = sayilar.iterator();

        while ( itr.hasNext() ){ // itr'nin yaninda bir sayi oldugu muddetce ayni islemi yap


            if (  ((Integer)itr.next() % 2) != 0 ){

                itr.remove();
            }


        }

        System.out.println(sayilar); // [4, 6, 2, 6]


        // sayilar listesinin yeni halinde
        // INDEX kullanmadan 5'den buyuk sayilari silin

        // yukarida olusturdugmuz itr objesini
        // yeni soruda KULLANAMAYIZ
        //    4, 6, 7, 2, 3, 5, 6
        // bunun sebebi scope'dan dolayi degil,
        // iterator'in yapisi geregi next() ile sona kadar goturdugumuzden
        // artik gidecek eleman kalmadigi icindir.

        // yeni soru icin ya yeni obje olusturmali
        // veya var olan itr'ye yeni deger atamaliyiz

        itr = sayilar.iterator();


        while ( itr.hasNext()){

            if ( (Integer)itr.next() > 5 ){

                itr.remove();
            }
        }


        System.out.println(sayilar); //  [4, 2]
    }
}
