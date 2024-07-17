package day13_forLoop;

public class C03_BasitForLoop {

    public static void main(String[] args) {

        // 1000'den geriye dogru 3 basamakli 37 ile bolunebilen sayilari yazdirin

        for (int i = 1000; i >= 100 ; i--) {

            if ( i % 37 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println("");
        // verilen pozitif tamsayi degeri icin faktoryel degerini hesaplayin
        // 6! = 6 * 5 * 4 * 3 * 2 * 1

        int sayi = 21 ;
        int faktoryelDegeri = 1 ;

        for (int i = sayi ; i >= 1 ; i--) {

            faktoryelDegeri *= i;
        }

        System.out.println(sayi + "! = " + faktoryelDegeri);

    }
}
