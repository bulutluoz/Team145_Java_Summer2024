package day39_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {

        // verilen iki tamsayiyi birbirine bolup
        // sonucun tamsayi kismini yazdirin

        int sayi1 = 287;
        int sayi2 = 0;

        if ( sayi2 == 0 ){
            System.out.println("Bolen sayi 0 OLAMAZ");
        }else{
            System.out.println( sayi1 / sayi2 );
        }
    }
}
