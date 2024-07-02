package day02_variable_scanner;

public class C05_PrimitiveDataTurleri {

    public static void main(String[] args) {

        boolean emekliMi = true;
        boolean ogrenciMi = false;
        // boolean sayiMi = "true";


        char ilkHarf = 'A';
        char karakter1 = '*';
        char karakter2 = ' '; // bosluk da bir karakterdir
        //char karakter3 = ''; // iki tek tirnak arasinda MUTLAKA tek karakter olmalidir
        char karakter4 = '5';
        // char karakter5 = 'ali'; // // iki tek tirnak arasinda SADECE tek karakter olmalidir


        // bir ilkokula program yaptigimizi dusunelim
        // ogrenciYasi variable'i icin

        byte ogrenciYasi1 = 8; // hafizada 8 bit yer kaplar
        short ogrenciYasi2 = 10; // hafizada 16 bit yer kaplar
        int ogrenciYasi3 = 7; // hafizada 32 bit yer kaplar
        long ogrenciYasi4 = 7; // hafizada 64 bit yer kaplar

        // ondalikli sayi

        float sayi1 = 23.5f ;
        float sayi2 = 3.4F;

        double sayi3 = 4.5;


        float a = 20f;
        float b = 6f;

        System.out.println(a/b); // 3.3333333


        double c = 20;
        double d = 6;

        System.out.println(c/d); // 3.3333333333333335

    }
}
