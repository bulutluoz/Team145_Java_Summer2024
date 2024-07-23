package day17_whileLoop_doWhileLoop;

public class C07_Karsilastirma {

    public static void main(String[] args) {

        /*
             - while loop once sarti kontrol edip, sarti sagliyorsak loop body calistirir
               do-while loop ise once body'yi calistirir, sonra kontrol yapar

             - Do-while loop'un artisi da eksisi de budur
               EGER en azindan bir kere loop body'sinin calismasini isterseniz avantaj olur

               EGER sarti saglamiyorsa HIC CALISMASIN derseniz dezavantaj olur

         */


        int sayi = -20;

        // sayi 0'dan buyukse , 0 oluncaya kadar birer azaltip yazdirin

        while (sayi > 0){

            System.out.print(sayi + " ");
            sayi--;
        }



        do {

            System.out.print(sayi + " ");
            sayi--;

        } while (sayi > 0);
    }
}
