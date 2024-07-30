package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListedenElemanSilme {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("A","G","K","A","M","A"));

        System.out.println(harfler); // [A, G, K, A, M, A]

        harfler.remove("A"); // listeden ilk buldugu A'yi siler

        System.out.println(harfler); // [G, K, A, M, A]

        System.out.println(harfler.remove("A")); // true

        System.out.println(harfler); // [G, K, M, A]

        System.out.println(harfler.remove("X")); // false

        System.out.println(harfler); // [G, K, M, A]

        // eger silmek icin index verirsek

        System.out.println(harfler.remove(2)); // M

        System.out.println(harfler); // [G, K, A]

        // System.out.println(harfler.remove(5)); // IndexOutOfBoundsException

        List<String > harfler2 = new ArrayList<>(Arrays.asList("A","K"));


        System.out.println(harfler.removeAll(harfler2)); // true

        System.out.println(harfler); // [G]

        // listeyi tertemiz etmek isterseniz

        harfler.clear();

        System.out.println(harfler); // []


    }
}
