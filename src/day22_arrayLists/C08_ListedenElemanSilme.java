package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ListedenElemanSilme {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,5,6,1,2,9));

        System.out.println(sayilar); // [3, 5, 6, 1, 2, 9]

        // remove() method'u iki turlu calisir
        // remove(index)
        // remove(istenenElement)
        // liste sayilardan olusuyorsa Java sayi girildiginde direk index kabul eder

        sayilar.remove(3);

        System.out.println(sayilar); // [3, 5, 6, 2, 9]

        // sayilar.remove(9); // IndexOutOfBoundsException


        // BIZ ILLA DA ELEMAN olan 9'u SILMEK ISTERSEK

        Integer silinecekSayi = 9;

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [3, 5, 6, 2]

    }
}
