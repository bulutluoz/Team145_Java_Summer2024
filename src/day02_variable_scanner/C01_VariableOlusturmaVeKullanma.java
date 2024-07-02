package day02_variable_scanner;

public class C01_VariableOlusturmaVeKullanma {

    public static void main(String[] args) {


        int sayi = 10;


        // sayi = "Ali";  // Required type: int   Provided: String
        // sayi variable'i olusturulurken icine konulacak degerlerin data turu olarak int yazdik
        // int data turundeki sayi variable'ina SADECE tamsayi degerleri atayabiliriz

        System.out.println("sayi"); // sayi

        System.out.println( sayi  ); // 10

        sayi = 20;

        System.out.println(sayi); // 20

        sayi = 2 * sayi + 1 ;


        System.out.println(sayi); // 41

    }



}
