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

        String[] karakterler = metin.split(""); // [b, u,  , s, o, r, u,  , b, u,  , k, a, d, a, r, .]

        System.out.println(Arrays.toString(karakterler));

        // System.out.println((char) ('a'+ 3) ); // d
        // System.out.println( (char) ('w' + 3)); // z
        // System.out.println( (char) ('y' + 3-26)); // |
        // System.out.println( (char) ('z' + 3-26)); // |

        for (int i = 0; i < karakterler.length ; i++) {
            
            if (metin.charAt(i) >= 'a' && metin.charAt(i)<='w'){ // a <==>w
                
                karakterler[i] = (char)(metin.charAt(i)+3)+"";
                
            } else if (metin.charAt(i) >= 'x' && metin.charAt(i)<='z') { // x <==> z
                karakterler[i] = (char)(metin.charAt(i)+3-26)+"";
            } // kucuk harf olmayan karakterler aynen kalacak

        }

        System.out.println(Arrays.toString(karakterler));

        String yeniMetin = String.join("",karakterler);

        System.out.println("Metnin yeni hali : " + yeniMetin);
    }
}
