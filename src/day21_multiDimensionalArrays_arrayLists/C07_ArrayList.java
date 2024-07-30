package day21_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {

    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>();

        System.out.println(isimler); // []

        System.out.println(isimler.add("Cem")); // true

        System.out.println(isimler); // [Cem]

        isimler.add(0,"Murat");

        System.out.println(isimler); // [Murat, Cem]

    }
}
