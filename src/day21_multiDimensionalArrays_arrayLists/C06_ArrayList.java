package day21_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayList {

    public static void main(String[] args) {

        // 1- liste icine yazacagimiz elementlerin data turu primitive olamaz
        // 2- List olusturulurken asagidaki yazimlardan 3'u de kullanilabilir
        //    ama genelde 1.si tercih edilir

        List<Integer>  sayilar = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>() ;

        List<Boolean> sonuclar = new ArrayList<Boolean>();

        // bir arrayList ilk olusturuldugunda bos olur
        // elementler teker teker eklenir
        // teker teker eklenen elementler, ekleme sirasina gore list'e konur
        System.out.println(sayilar); // []

        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);

        System.out.println(sayilar); // [5, 6, 1]

        sayilar.add(1,0);

        System.out.println(sayilar); // [5, 0, 6, 1]

        List<Integer> list2 = new ArrayList<>(Arrays.asList(11,12,13));
        System.out.println(list2); // [11, 12, 13]

        sayilar.addAll(list2); // sayilarin sonuna list2'yi ekler

        System.out.println(sayilar); // [5, 0, 6, 1, 11, 12, 13]
        System.out.println(list2); // [11, 12, 13]

        // sayilarin en basina list2'yi ekleyelim

        sayilar.addAll(0, list2);

        System.out.println(sayilar); // [[11, 12, 13, 5, 0, 6, 1, 11, 12, 13]
        System.out.println(list2); // [11, 12, 13]




    }
}
