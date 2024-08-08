package day29_dateTime_varargs;

public class C07_DikkatEdilecekler {

    public static void main(String[] args) {

        /*
            varargs method'larda parametre olarak kullanilir
            Dikkat edilecek konu
            parametreler yazilirken varargs'in EN SONDA olmasidir

            Varargs'dan sonra herhangi bir parametre olmamalidir
         */

        // verilen degisken sayidaki int argument'den
        // son argument haric, geriye kalanlari toplayip
        // bulunan toplamdan ilk argument'i cikarip bulunan sonucu yazdiran bir method olusturun

        islemYap(2,3,4,5); // 2+3+4 => 9   9-5 => 4 yazdiracak
        islemYap(1,2,3,4,5,6,7,8); // 1+2+3+4+5+6+7 => 28  28-8=> 20 yazdiracak
    }


    public static void islemYap(int... butunSayilar ){

        // son argumenti ayri bir argument olarak tanimlayamayiz
        // cunku varargs'dan sonra argument olmaz
        // AMMA  butun sayilari bir varargs (arr) olarak alip
        // varargs'daki son elementi istenen sekilde kullanabiliriz

        int bastakilerinToplami = 0 ;

        for (int i = 0; i <= butunSayilar.length-2 ; i++) {

            bastakilerinToplami += butunSayilar[i];

        }

        System.out.println("islem sonucu : " + (bastakilerinToplami - butunSayilar[butunSayilar.length-1]));

    }
}
