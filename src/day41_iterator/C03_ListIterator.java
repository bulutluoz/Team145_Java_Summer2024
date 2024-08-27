package day41_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C03_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>( Arrays.asList(4, 6, 7, 2, 3, 5, 6));
        // INDEX kullanmadan sayilar listesindeki sayilari
        // 1'er artirin

        ListIterator lit = sayilar.listIterator();
        // ListIterator interface'i , Iterator'in child'idir


        while ( lit.hasNext() ){

            lit.set(   (Integer)lit.next()  + 1       );
        }

        System.out.println(sayilar); //  [5, 7, 8, 3, 4, 6, 7]


        // sayilar listesindeki sayilari
        // INDEX kullanmadan sondan basa dogru yazdirin

        // ITERATOR ile calistigimizda ilk sormamiz gereken soru
        // ITERATOR NEREDE ?
        // bu soru icin ITERATOR su an en sonda

        while (  lit.hasPrevious() ){

            System.out.print( lit.previous() + " ");
        }

        System.out.println("");


        // INDEX KULLANMADAN sayilar listesindeki cift sayilari silin
        // ITERATOR NEREDE ? su an en basta

        while ( lit. hasNext() ){

            if (   (Integer) lit.next() % 2 == 0 ){

                lit.remove();
            }
        }

        System.out.println(sayilar); // [5, 7, 3, 7]

    }
}
