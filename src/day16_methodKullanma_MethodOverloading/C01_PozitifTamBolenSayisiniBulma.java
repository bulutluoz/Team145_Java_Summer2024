package day16_methodKullanma_MethodOverloading;

public class C01_PozitifTamBolenSayisiniBulma {

    public static void main(String[] args) {

        // Verilen sayinin pozitif tam bolenleri sayisini bulup
        // bize donduren bir method olusturun.

        // Ornek input : 20, pozitif tam bolenleri : 1,2,4,5,10,20
        //       output : 6

        System.out.println(pozitifTamBolenSayisi(20)); // 6

        System.out.println(pozitifTamBolenSayisi(100)); // 1,2,4,5,10,20,25,50,100 ==> 9


    }


    public static int pozitifTamBolenSayisi( int sayi ){

        int pozTamBolenSayisi = 0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i == 0){
                pozTamBolenSayisi++;
            }

        }

        return pozTamBolenSayisi;

    }
}
