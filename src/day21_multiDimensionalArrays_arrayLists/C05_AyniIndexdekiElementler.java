package day21_multiDimensionalArrays_arrayLists;

import java.util.Arrays;

public class C05_AyniIndexdekiElementler {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de
        // ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //		input :      int[][] arr =  {{3,4,5}, {2,3,6,7}};
        //	  output:                       [5, 7, 11]

        int[][] arr =  {{3,4,5}, {2,3,6,7}};

        int ortakIndexSayisi = arr[0].length < arr[1].length ? arr[0].length : arr[1].length ;

        int[] ortakIndexArr = new int[ortakIndexSayisi]; // [0, 0, 0]


        for (int i = 0; i <ortakIndexArr.length ; i++) {

            ortakIndexArr[i] = arr[0][i] + arr[1][i];
        }

        System.out.println(Arrays.toString(ortakIndexArr)); // [5, 7, 11]

    }
}
