package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_ArrayiListeCevirme {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,4,5,6));

        System.out.println(sayilar); // [2, 4, 5, 6]
        sayilar.add(9);
        System.out.println(sayilar); // [2, 4, 5, 6, 9]
        sayilar.remove(0);
        System.out.println(sayilar); // [4, 5, 6, 9]


        Integer[] arr = {4,7,9,0,1};

        // arr'yi listeye cevirin

        List<Integer> listArr = Arrays.asList(arr);

        System.out.println(listArr); // [4, 7, 9, 0, 1]

        // bir array'i asList() ile List'e cevirmenin 2 tane cok negatif yan etkisi vardir
        // 1- array'den gecis yapildigi icin listenin size'ini etkileyen add, remove gibi method'lari kullanamazsiniz

        // listArr.add(5); // UnsupportedOperationException
        // listArr.remove(0); // UnsupportedOperationException

        // 2- kaynak array ve donusturdugumuz liste ozdes olarak calisir
        //    birinde yapilan degisiklikler OTOMATIK olarak otekine de islenir

        System.out.println(Arrays.toString(arr)); // [4, 7, 9, 0, 1]
        System.out.println(listArr); // [4, 7, 9, 0, 1]

        arr[0] = 10;

        System.out.println(Arrays.toString(arr)); // [10, 7, 9, 0, 1]
        System.out.println(listArr); // [10, 7, 9, 0, 1]


        // bu cevirme islemini daha saglikli yapmak icin
        // bos bir list olusturup,
        // loop ile array'deki tum elementleri listeye kopyalayabiliriz
    }
}
