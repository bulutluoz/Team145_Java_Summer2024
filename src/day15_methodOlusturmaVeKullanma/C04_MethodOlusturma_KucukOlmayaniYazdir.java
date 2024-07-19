package day15_methodOlusturmaVeKullanma;

public class C04_MethodOlusturma_KucukOlmayaniYazdir {

    public static void main(String[] args) {

        // verilen iki tamsayidan kucuk olmayani yazdirin


        kucukOlmayaniYazdir(7,9); // 9
        kucukOlmayaniYazdir(10,10); // 10
        // kucukOlmayaniYazdir(5);
        // kucukOlmayaniYazdir(5,6,7);

    }


    public static void kucukOlmayaniYazdir(int sayi1 , int sayi2){

        System.out.println( sayi1<sayi2 ? sayi2 : sayi1); // 44
    }


}
