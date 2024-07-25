package day19_arrays;

import java.util.Arrays;

public class C03_ArraydekiElemanlaraDegerAtamaVeKullanma {

    public static void main(String[] args) {

        int[] arr = new int[5]; // [0, 0, 0, 0, 0]

        System.out.println(arr); // [I@2752f6e2

        // Bir array'i direkt olarak yazdiramayiz
        // Eger yazdirmak istersek Arrays.toString() kullanmaliyiz

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]

        // bir array olusturulup uzunlugu deklare edildikten sonra
        // o array'deki element sayisi DEGISTIRILEMEZ

        arr = new int[6];  // [0, 0, 0, 0, 0, 0]


        // array'deki elementlere nasil deger atayabilir veya kullanabiliriz ?


    }
}
