package day44_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        // sayilar listesi deklare edilirken Integer'lardan olusacagi soylendigi icin
        // Integer olmayan hic bir datayi ekleyemeyiz

        List<Object> herseyListesi = new ArrayList<>();

        herseyListesi.add(4);
        herseyListesi.add(true);
        herseyListesi.add('e');
        herseyListesi.add("Ali");

        int[] arr = {3,4,5,6};

        herseyListesi.add(arr);

        // Bir listeye herseyi eklemek KOLAYLIK gibi gorunse de
        // elemanlara ulasma ve kullanma acisindan zorluk olusturabilir

        System.out.println(herseyListesi); // [4, true, e, Ali, [I@e580929]

        // 0.index'deki sayinin 2 katini yazdirin

        System.out.println(   (Integer)herseyListesi.get(0) * 2 ); // 8

        // 3.index'deki String'in length'ini yazdirin

        System.out.println(  ((String)herseyListesi.get(3)).length()  ); // 3

        // 4.indexdeki array'i yazdirin

        System.out.println(Arrays.toString(  (int[]) herseyListesi.get(4))  );
        // [3, 4, 5, 6]

        // 4.index'deki array'in lengt'ini yazdirin

        System.out.println(    ((int[])herseyListesi.get(4)).length   ); // 4

    }
}
