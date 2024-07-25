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

        // 2.index'deki elementi 5 yapin
        arr[2] = 5;

        // 4.index'deki element 7 olsun
        arr[4] = 7;

        System.out.println(Arrays.toString(arr)); // [0, 0, 5, 0, 7, 0]

        // array'in 3.index'indeki elementi yazdirin

        System.out.println( arr[3] ); // 0

        // array'in 1. ve 2.index'indeki elementlerin toplamini yazdirin

        System.out.println( arr[1] + arr[2]  ); // 0 + 5 ==> 5


       // 7.eleman(index = 6)  olarak 10 atayin

       // arr[6] = 10 ;
       // ArrayIndexOutOfBoundsException
       // Index 6 out of bounds for length 6


        // 3.index'deki elementi silip array'i 5 elemanli hale getirin
        // Array'e yeni bir element eklenemez veya var olan bir element silinemez
        // yani length'i degismez


        System.out.println(Arrays.toString(arr)); // [0, 0, 5, 0, 7, 0]

        // array'e yeni 5 uzunlugunda bir deger atamasi yaparsak
        // eski array'in icindeki elementler yok olur

        arr = new int[5];

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]



    }
}
