package day20_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C05_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // Verilen bir array’e istenen bir elemani ekleyip
        // bize donduren bir method yazin, eski array’e yeni degeri atayin.

        int[] arr = {3,4,7,1,9,2};
        int eklenecekEleman = 8 ;

        // arr[4] = 8 ; // ArrayIndexOutOfBoundsException
        // 4 elemanli olarak olusturulan bir array'e 5.elementi direkt ekleyemezsiniz

        // arr = new int[5]; bu islemi yaparsak eski degerler silinmis olur

        arr =  arrayeBirElemanEkle(arr,eklenecekEleman); // arr'nin son hali : [3, 4, 7, 1, 9, 2, 8]

        arr =  arrayeBirElemanEkle(arr,-3); // arr'nin son hali : [3, 4, 7, 1, 9, 2, 8, -3]

        arr =  arrayeBirElemanEkle(arr,-5); // arr'nin son hali : [3, 4, 7, 1, 9, 2, 8, -3, -5]



        System.out.println( "arr'nin son hali : " + Arrays.toString(arr));


    }

    public static int[] arrayeBirElemanEkle(int[] arr , int eklenecekEleman){

        // once 1 fazla elemana sahip yeni bir array olusturalim
        // yeniArr ==> [0, 0, 0, 0, 0]
        int[] yeniArr = new int[arr.length+1];

        // eski array'de var olan tum elemanlari yeni array'e kopyalayalim
        // yeniArr ==> [3, 4, 7, 1, 0]

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        }

        // sonuncu index'e eklenecekEleman'i atayalim
        // yeniArr ==> [3, 4, 7, 1, 8]

        yeniArr[yeniArr.length-1] = eklenecekEleman;


        // eski arr'ye yeniArr degerini atayalim

        arr = yeniArr;

        return arr;

    }
}
