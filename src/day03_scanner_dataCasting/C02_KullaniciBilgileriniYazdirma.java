package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_KullaniciBilgileriniYazdirma {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");

        String girilenIsim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");

        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");

        int girilenYas = scanner.nextInt();

        System.out.println(
                "Isminiz : " + girilenIsim +
                "\nSoyisminiz : " + girilenSoyisim +
                "\nYasiniz : " + girilenYas +
                "\nKaydiniz basariyla tamamlanmistir."
        );


    }
}
