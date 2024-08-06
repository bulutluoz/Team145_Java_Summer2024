package day27_passByValue;

import java.util.Arrays;

public class C04_Array_PassByValue {

    public static void main(String[] args) {

        int[] arr = {3,7,9};

        elemanlari2Artir(arr); // method'da [5, 9, 11]

        System.out.println("elemanlari artirma methodu sonrasinda arr : " + Arrays.toString(arr));
        // [5, 9, 11]

        yeniArrAta(arr); // method'da [5, 87, 12]

        System.out.println("yeni arr ata methodu sonrasinda arr : " + Arrays.toString(arr));
        // [5, 9, 11]
    }

    // icinde rastgele 100'den kucuk 3 sayinin oldugu yeni bir array olusturup
    // arr'ye olusturulan yeni arr'yi atayan
    // ve arr'nin son halini yazdiran bir method olusturun

    public static void yeniArrAta(int[] arr ){

        int[] yeniArr = {5,87,12};
        arr = yeniArr;

        System.out.println("yeni arr ata method'unda arr : " + Arrays.toString(arr)); //

    }




    // array'deki tum elementlerin degerini 2 artirip
    // son halini yazdiran bir method olusturun

    public static void elemanlari2Artir( int[] arr){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += 2;
        }

        System.out.println("elemanlari artir method'unda arr : " + Arrays.toString(arr));

    }

}
