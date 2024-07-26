package day20_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C07_ArraydeElemanAratma {

    public static void main(String[] args) {

        int[] arr = { -2,5,3,9,1,8,15,-4};

        // Array'de bir elemanin var olup olmadigini kontrol etmek icin

        System.out.println(Arrays.binarySearch(arr, -2)); // 0
        System.out.println(Arrays.binarySearch(arr, 5)); // 1
        System.out.println(Arrays.binarySearch(arr, 3)); // -2
        System.out.println(Arrays.binarySearch(arr, 9)); // 3
        System.out.println(Arrays.binarySearch(arr, 1)); // -2
        System.out.println(Arrays.binarySearch(arr, 8)); // -4
        System.out.println(Arrays.binarySearch(arr, 15)); // 6
        System.out.println(Arrays.binarySearch(arr, -4)); // -1

        System.out.println(Arrays.binarySearch(arr, 4)); // -2
        System.out.println(Arrays.binarySearch(arr, 20)); // -9
        System.out.println(Arrays.binarySearch(arr, -20)); // -1
        System.out.println(Arrays.binarySearch(arr, 0)); // -2

        // Array'de saglikli bir arama yapilabilmesi icin once sort() calistirilmalidir
        // siralama yapilmamis bir array'de binarySearch() sonucu ONGORULEMEZ
        // dogru islem yapip elemanin oldugu index'i verebilir
        // ama yanlislik yapip var olan elemani yok olarak da raporlayabilir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [-4, -2, 1, 3, 5, 8, 9, 15]

        System.out.println(Arrays.binarySearch(arr, -2)); // 1
        System.out.println(Arrays.binarySearch(arr, 5)); // 4
        System.out.println(Arrays.binarySearch(arr, 3)); // 3
        System.out.println(Arrays.binarySearch(arr, 9)); // 6
        System.out.println(Arrays.binarySearch(arr, 1)); // 2
        System.out.println(Arrays.binarySearch(arr, 8)); // 5
        System.out.println(Arrays.binarySearch(arr, 15)); // 7
        System.out.println(Arrays.binarySearch(arr, -4)); // 0

        System.out.println(Arrays.binarySearch(arr, 4)); // -5
        System.out.println(Arrays.binarySearch(arr, 20)); // -9
        System.out.println(Arrays.binarySearch(arr, -20)); // -1
        System.out.println(Arrays.binarySearch(arr, 0)); // -3

        /*
            binarySearch
            1- var olan elementler icin index doner
            2- olmayan elementlerin olmadigini anlamamiz icin basina - koyar
            3- olmayan elementler icin index degil sira numarasi - olarak verilir
         */






















    }
}
