package day02_variable_scanner;

public class C07_VariableIsimVermeKurallari {

    public static void main(String[] args) {

        // variable isimleri kucuk harfle baslar
        // _ ve $ ile de baslayabilir ama TAVSIYE EDILMEZ

        int sayi = 10;

        int Sayi = 20;

        int SaYi = 30;

        System.out.println(Sayi); // 20

        System.out.println(sayi); // 10

        // int s a y i = 24;
        // int s%ayi = 25;
        int sayi_123$ = 12;

        int sayi1 = 67;
        // int 1sayi = 65;

        int _sayi = 43; // tavsiye edilmez
        int $sayi = 9; // tavsiye edilmez

        // int class = 23;
        // int int = 34;

        char kelimeninIlkHarfi = 'a';
        char kelimeninilkharfi = 'b';
    }
}
