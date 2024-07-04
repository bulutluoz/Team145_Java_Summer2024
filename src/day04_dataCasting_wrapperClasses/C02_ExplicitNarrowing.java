package day04_dataCasting_wrapperClasses;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        // Eger atanacak deger
        // variable'in alabilecegi max degerden buyukse
        // java max degerden bir sonrasi olarak min degere gecis yapip
        // oradan saymaya devam eder

        int sayi1 = 29;
        int sayi2 = 130;
        int sayi3 = 140;
        int sayi4 = 256;
        int sayi5 = 530;


        byte sayiByte = (byte) sayi1;
        System.out.println("byte olarak 29 : " + sayiByte); // 29

        sayiByte = (byte) sayi2;
        System.out.println("byte olarak 130 : " + sayiByte); // -126

        sayiByte = (byte) sayi3;
        System.out.println("byte olarak 140 : " + sayiByte); // -116

        sayiByte = (byte) sayi4;
        System.out.println("byte olarak 256 : " + sayiByte); // 0

        sayiByte = (byte) sayi5;
        System.out.println("byte olarak 530 : " + sayiByte); // 0 - 256 - 512 ==> 18

    }
}
