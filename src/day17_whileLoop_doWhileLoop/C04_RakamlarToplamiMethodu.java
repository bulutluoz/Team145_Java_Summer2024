package day17_whileLoop_doWhileLoop;

public class C04_RakamlarToplamiMethodu {

    public static void main(String[] args) {

        // While loop kullanarak verilen bir sayinin rakamlar toplamini
        // hesaplayip bize donduren bir method olusturun

        System.out.println(rakamlarToplaminiBul(10023)); // 6
        System.out.println(rakamlarToplaminiBul(345)); // 12

    }

    public static int rakamlarToplaminiBul( int sayi ){

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int dummyNumber = sayi;

        while (  dummyNumber != 0   ){

            birlerBasamagi = dummyNumber % 10;
            rakamlarToplami += birlerBasamagi;
            dummyNumber /= 10;

        }

        return rakamlarToplami;

    }
}
