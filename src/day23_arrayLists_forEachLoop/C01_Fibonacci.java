package day23_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_Fibonacci {

    public static void main(String[] args) {

        /*
            Fibonacci serisi ozel bir seri olup
            ilk 2 eleman haric, her eleman kendinde onceki 2 elemanin toplamina esittir

             0 1 1 2 3 5 8 13 21 34 55 89 ...

             Verilen pozitif bir n tamsayisini alarak,
             bize ilk n tane tane Fibonacci sayisini
             bir list olarak donduren bir method olusturun.

         */

        System.out.println(ilkNTaneFibonacciSayisi(5)); // [0, 1, 1, 2, 3]

        System.out.println(ilkNTaneFibonacciSayisi(0));
        // Sayi adedi pozitif olmalidir
        // []

        System.out.println(ilkNTaneFibonacciSayisi(1)); // [0]

        System.out.println(ilkNTaneFibonacciSayisi(2)); // [0, 1]

        System.out.println(ilkNTaneFibonacciSayisi(10));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]


    }

    public static List<Integer> ilkNTaneFibonacciSayisi( int fibonacciSayiAdedi){

        List<Integer> fibonacciListesi = new ArrayList<>();

        if (fibonacciSayiAdedi <=0 ){
            System.out.println("Sayi adedi pozitif olmalidir");
        } else if (fibonacciSayiAdedi == 1) {
            fibonacciListesi.add(0);
        } else if (fibonacciSayiAdedi == 2) {
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
        }else { // istenen fibonacci sayisi adedi 2'den fazla

            fibonacciListesi.add(0);
            fibonacciListesi.add(1);

            for (int i = 2; i < fibonacciSayiAdedi ; i++) {

                fibonacciListesi.add(   fibonacciListesi.get(i-2) + fibonacciListesi.get(i-1)     );

            }
        }

        return fibonacciListesi;
    }
}
