package day20_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_ArrayMethodlari {

    public static void main(String[] args) {
        /*
            String'de atama olmazsa degisiklikler kalici olmuyordu
            Ama arrays ve arrayList'de atama olmasa da
            method'la yapilan degisiklikler kalici olur
         */

        int[] arr = {2,9,5,0,1,-4};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [-4, 0, 1, 2, 5, 9]

        int[] arr2 = {-5,9,0,-3,7,6,6,8,-3};

        // sadece ilk 6 elemani siralayin, digerleri ayni kalsin

        Arrays.sort(arr2,0,6);

        System.out.println(Arrays.toString(arr2)); // [-5, -3, 0, 6, 7, 9, 6, 8, -3]


        int[] arr3 = {3,6,8};
        int[] arr4 = {6,3,8};
        int[] arr5 = {3,6,8};

        System.out.println( Arrays.equals(arr3,arr4)); // false
        System.out.println(Arrays.equals(arr3,arr5)); // true

        Arrays.sort(arr4); // {3,6,8}

        System.out.println( Arrays.equals(arr3,arr4)); // true

    }
}
