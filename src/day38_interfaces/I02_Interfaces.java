package day38_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    // interface'de olusturulan her variable
    // public static ve final'dir
    // bu keyword'leri yazsak da, yazmasak da bu degismez

    int SAYI = 10;
    public String STR ="Java";
    static final short SAYI_SHRT = 67;
    public static final double SAYI_DBL = 23;
    // char chr;

    public static void main(String[] args) {

        System.out.println(SAYI); // sayi variable'inin onunde static yazmadigi halde
                                  // static main method icinden kullanabiliriz
                                  // cunku interface icindeki tum variable public, static ve final'dir

        // sayi = 44;                sayi variable'inin onunde final yazmasa da
                                  // interface icindeki tum variable public, static ve final'dir
                                  // final variable'larin degeri DEGISTIRILEMEZ

        // interface icinde olusturulan her variable public, static ve final'dir
        // final oldugu icin sonradan degistirme imkani yoktur
        // char chr;  normalde class level variable'lara atama yapmak zorunlu degildir
        // Ancak interface'de sonradan atama yapamayacagimiz icin basta deger atamak ZORUNLUDUR

        System.out.println( Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Math.PI);

        // Genel bir kabul olarak
        // Java'da public static final varioable'lar
        // kullanicilarin dikkatini cekmek icin tamamen buyuk harflerle isimlendirilir




    }
}
