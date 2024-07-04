package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C08_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245  ise output = 11


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        int rakamlarToplami = 0;
        int oAnkiSayininBirlerBasamagi = 0;

        // 1. adim sayi : 245, rakamlarToplami : 0

        oAnkiSayininBirlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + oAnkiSayininBirlerBasamagi;

        int sayininYeniHali = girilenSayi/10;

        // 2.adim sayininYeniHali = 24 , rakamlarToplami = 5

        oAnkiSayininBirlerBasamagi = sayininYeniHali % 10;

        rakamlarToplami = rakamlarToplami + oAnkiSayininBirlerBasamagi;

        sayininYeniHali = sayininYeniHali /10;

        // 3.adim
        rakamlarToplami = rakamlarToplami+ sayininYeniHali;


        System.out.println("Girdiginiz " + girilenSayi + "'nin rakamlar toplami : " +rakamlarToplami);
    }
}
