package day06_MantiksalKarsilastirmalar_ifStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // kullanicidan bir ucgenin kenar uzunluklarini alin
        // kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        if (kenar1 == kenar2  && kenar1 == kenar3 && kenar1>0){

            System.out.println("Eskenar ucgen");
        }

    }
}
