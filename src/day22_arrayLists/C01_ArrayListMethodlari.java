package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,8,0,1,9,3));

        System.out.println(sayilar); // [2, 5, 8, 0, 1, 9, 3]

        // listedeki eleman sayisini yazdirin

        System.out.println("listedeki elaman sayisi : "+sayilar.size()); // 7

        // listenin bos olup olmadigini yazdirin

        System.out.println(sayilar.isEmpty()); // false

        List<String > isimler = new ArrayList<>();

        System.out.println(isimler.isEmpty()); // true

        // bir elemanin listede olup olmadigini kontrol etmek icin

        System.out.println(sayilar.contains(2)); // true
        System.out.println(sayilar.contains(21)); // false
    }
}
