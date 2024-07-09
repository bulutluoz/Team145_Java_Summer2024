package day07_ifStatements_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan notunu alin
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not=scanner.nextDouble();

        if (not >= 50) System.out.println("Sinifi Gectin");
        else System.out.println("Maalesef kaldin");
    }
}
