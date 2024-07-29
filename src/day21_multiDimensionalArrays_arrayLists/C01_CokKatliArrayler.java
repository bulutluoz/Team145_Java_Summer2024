package day21_multiDimensionalArrays_arrayLists;

import java.util.Arrays;

public class C01_CokKatliArrayler {

    public static void main(String[] args) {

        int[][] ikiKatliArr = { {2,3,4} , {4,8} , {7} , {1,5,6,9} };

        // Cok katli array'lerde bir sey yazdirmak istedigimizde
        // yazdiracagimiz seyin bir array mi
        // yoksa direkt yazdirabilecegimiz bir eleman mi oldugunu anlamaliyiz

        System.out.println(ikiKatliArr[0][1]); // 3
        System.out.println(ikiKatliArr[2][0]); // 7

        System.out.println(Arrays.toString(ikiKatliArr[3])); // [1, 5, 6, 9]

        System.out.println(Arrays.toString(ikiKatliArr[2])); // [7]

        // ikikatliArr 'nin tamamini bir array olarak yazdirin
        System.out.println(Arrays.toString(ikiKatliArr)); // [[I@2752f6e2, [I@e580929, [I@1cd072a9, [I@7c75222b]
        // cok katli array'leri yazdirmak icin

        System.out.println(Arrays.deepToString(ikiKatliArr));
        // [[2, 3, 4], [4, 8], [7], [1, 5, 6, 9]]


        int[] arr1 = {3,6,7};
        int[] arr2 = {3,5,6,8};
        int[] arr3 = {7,8,0,9};

        int[][] cokKatliArr = {arr1, arr2, arr3};


    }
}
