package day15_methodOlusturmaVeKullanma;

public class C03_MethodOlusturma_AsalMi {

    public static void main(String[] args) {

        // verilen bir sayi asal ise true, asal degilse false yazdiran bir method olusturun

        asalMi(82); // false
        asalMi(97); // true

        /*
            method deklarasyonunda () icindeki variable'lara PARAMETRE
            method call'da () icindeki degerlere ARGUMENT denilir

            eger parametre ve argument uyumlu olmazsa
            Java compiler error verir ve kod calistirilamaz

            uyumlu olmak icin parametre ve argumentlerin
            hem kac tane oldugu, hem de data turleri onemlidir
         */

        // asalMi(20.4);
        // asalMi(true);
        // asalMi("naber?");

        // asalMi(50,44);
        // 'asalMi(int)' in 'C03' cannot be applied to '(int, int)'


    }

    public static void asalMi(int sayi){
        boolean asalMi = true;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                asalMi = false;
                break;
            }
        }
        System.out.println(asalMi);
    }
}
