package day41_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {

    public static void main(String[] args) {

        int[] arr = {3,5,6,1,2,4,5};

        // arr'in tum elementlerini 1'er artirin

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i] + 1 ;
        }

        System.out.println(Arrays.toString(arr)); // [4, 6, 7, 2, 3, 5, 6]


        // arr'in tum elemanlarini INDEX KULLANMADAN 2 artirin

        for( int each : arr ){

            each +=2 ;
        }

        System.out.println(Arrays.toString(arr)); // [4, 6, 7, 2, 3, 5, 6]



        // INDEX kullanmadan array'deki tum elemanlari
        // for-each loop ile elden gecirebiliriz
        // ANCAKKK for-each loop ile kalici degisiklik yapamayiz

        List<Integer> sayilar = new ArrayList<>( Arrays.asList(4, 6, 7, 2, 3, 5, 6));
        // INDEX kullanmadan sayilar listesindeki tek sayilari silin

        // JAVA index kullanmadan bir listedeki tum elemanlari
        // gozden gecirebilmemiz icin Iterator ve ListIterator interface'lerini olusturmustur

        System.out.println(sayilar); // [4, 6, 7, 2, 3, 5, 6]


        // [   4,    6,    7,    2,    3,    5,    6   ]

        Iterator itr = sayilar.iterator();

        System.out.println(itr.hasNext()); // true

        itr.next(); // itr objesini yanindaki sayinin sonrasina gecirir
                    // gecerken de o sayiyi uzerine alir
        itr.remove();  // itr'nin uzerine aldigi elemani siler

        System.out.println(sayilar); // [6, 7, 2, 3, 5, 6]

        System.out.println(itr.hasNext()); // true

        itr.next();

        itr.remove(); //

        System.out.println(sayilar); // [7, 2, 3, 5, 6]










    }
}
