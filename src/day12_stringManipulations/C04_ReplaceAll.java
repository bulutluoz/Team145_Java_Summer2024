package day12_stringManipulations;

import java.util.Scanner;

public class C04_ReplaceAll {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve Kredi karti numarasini alin
        // isim ve soyismin ilk harfini buyuk harfe cevirip, kalanlari * yapin
        // kredi karti numarasindaki sayilari * yapip asagidaki formatta yazdirin

        // isminiz : A** **** Y*****  // Ali Mert YOZGAT
        // Kart no : **** **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen kart numaranizi giriniz...");
        String kartNo = scanner.nextLine();

        System.out.println(
              "isminiz :" + isim.substring(0,1).toUpperCase() // ismin ilk harfini alip buyuk harf yaptim
              + isim.substring(1).replaceAll("\\S","*") // ismin ilk harften sonrasini alip, space disindki herseyi * yaptim
              + " " // isim ile soyisim arasindaki bosluk
              + soyisim.substring(0,1).toUpperCase() // soyismin ilk harfini alip buyuk harf yaptim
              + soyisim.substring(1).replaceAll("\\S","*") // soyismin ilk harften sonrasini alip, space disindki herseyi * yaptim
              + "\nKart no : " + kartNo.replaceAll("\\d","*") // kartta digit olanlari * yaptim
        );

    }
}
