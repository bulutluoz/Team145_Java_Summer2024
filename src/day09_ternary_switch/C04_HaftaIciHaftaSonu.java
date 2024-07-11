package day09_ternary_switch;

import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {

    public static void main(String[] args) {
        // kullaniciya haftanin kacinci gunu oldugunu sorun
        // 1-7 arasindaki degerler icin haftaici veya haftasonu yazdirin
        // 1-7 arasindaki sayilardan farkli bir sayi girerse hata mesaji verin

        Scanner scanner = new Scanner(System.in);
        System.out.println("gun numarasini giriniz");
        int gunNo = scanner.nextInt();


        switch (gunNo){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("haftaici");
                break;
            case 6 :
            case 7 :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gun numarasi 1 ile 7 arasinda olmali...");
        }
    }
}
