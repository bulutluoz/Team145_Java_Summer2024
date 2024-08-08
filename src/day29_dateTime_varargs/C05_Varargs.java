package day29_dateTime_varargs;

public class C05_Varargs {

    public static void main(String[] args) {
        /*
            Varargs ==> variety of arguments

            EGER bir method'da parametre sayisi degisken olsun istiyorsak
            parametreleri tek tek yazmak yerine varargs kullanabiliriz

            dataTuru... seklinde tanimlanan varargs kendisine belirlenen data turunden
                        istenen sayida argumenti kabul eder ve
                        array altyapisini kullanir
         */

        // verilen iki sayiyi toplayip, toplami yazdiran bir method olusturun
        topla(13,41); // 54
        topla(3,5,6); // 14
        topla(4,5,6,7); // Verilen 4 adet argumanin toplami : 22
        topla(4,8,9,2,3); // Verilen 5 adet argumanin toplami : 26
        topla(1,2,3,4,5,6); // Verilen 6 adet argumanin toplami : 21
        topla(2,3,4,5,6,7,8);  // Verilen 7 adet argumanin toplami : 35
        topla(3,4,5,6,7,8,7,6,5,4,3,2,1,2,3,4,5,6,7); // Verilen 19 adet argumanin toplami : 88

    }

    public static void topla(int... a){
        // gonderilen tum argumentler a arr'ine kaydedilmistir
        int toplam = 0 ;

        for (int i = 0; i <a.length ; i++) {

            toplam += a[i] ;
        }

        System.out.println("Verilen "+ a.length + " adet argumanin toplami : " + toplam);
    }

    private static void topla(int a, int b, int c) {
        System.out.println(a+b+c);
    }


    public static void topla(int a,int b){
        System.out.println(a+b);
    }
}
