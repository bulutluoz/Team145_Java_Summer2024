package day23_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElemanlar {

    public static void main(String[] args) {

        // Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[] arr1 = {3,5,6,5,3,6,3,5,5};
        int[] arr2 = {3,8,8,0,9,3,3,6};

        List<Integer> ortakElemanlarListesi = new ArrayList<>();

        for (int each1 : arr1){

            for (int each2 : arr2){

                if (each1 == each2 && !ortakElemanlarListesi.contains(each1)){

                    ortakElemanlarListesi.add(each1);
                }

            }

        }

        System.out.println(ortakElemanlarListesi); // [3, 6]

    }
}
