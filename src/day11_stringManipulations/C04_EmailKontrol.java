package day11_stringManipulations;

import java.util.Scanner;

public class C04_EmailKontrol {

    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        //          - mail @ icermiyorsa "gecersiz mail"
        //          - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //          - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"  yazdirin.


        /*
            Eger tum kontrolleri yapmasini ve hatalari yazdirmasini istersek BAGIMSIZ IF cumleleri
            Eger buldugu ilk hatayi yazdirsin, ilk hata duzeltildikten sonra
            diger sartlari kontrol etsin diyorsaniz If Else Statement kullanmalisiniz
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String email = scanner.nextLine();


    }
}
