package day20_arrays_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_MetniSifrele {

    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin ve asagida verilen yontemle sifreli hale getirin
        // tum metin kucuk harfe cevrilecek
        // harfler disindaki karakterler sifrelenmeyecek
        // harflerin yerine o harften 3 sonraki harf getirilecek
        // or: a==> d , k==> n   y==> b  z==> c

        Scanner scanner = new Scanner(System.in);

        System.out.println("sifrelenecek metni giriniz");
        String metin = scanner.nextLine().toLowerCase();

        String[] karakterler = metin.split("");

        System.out.println(Arrays.toString(karakterler));

    }
}
