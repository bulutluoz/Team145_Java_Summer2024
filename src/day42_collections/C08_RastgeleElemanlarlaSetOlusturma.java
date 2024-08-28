package day42_collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C08_RastgeleElemanlarlaSetOlusturma {

    public static void main(String[] args) {

        // icinde 20'den kucuk 7 adet pozitif tamsayinin oldugu
        // bir Set olusturun

        Random random = new Random();
        Set<Integer> sayilar = new TreeSet<>();

        for (int i = 0; i <7 ; i++) {

            sayilar.add(random.nextInt(20)  );
        }

        System.out.println(sayilar);

        // islemi 7 kere yapmak cok mantikli degil
        // ayni sayi gelirse Set 7 elemanli olmaz

        Set<Integer> sayilar2 = new TreeSet<>();

        while ( sayilar2.size()<7){

            sayilar2.add(random.nextInt(20)  );
        }

        System.out.println(sayilar2);

    }
}
