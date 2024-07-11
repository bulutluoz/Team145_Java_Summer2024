package day09_ternary_switch;

public class C02_NestedTernary {

    public static void main(String[] args) {

        int sayi = 21;

        // verilen sayi pozitif ise "pozitif",
        //              negatif ise "negatif"
        //  pozitif veya negatif degilse "notr" yazdirin


        System.out.println(sayi > 0 ? "pozitif" : sayi < 0 ? "negatif" : "notr");


        // sayi tek ise "3'un kati" veya "3'un kati degil" yazdirin
        // sayi cift ise "5'in kati" veya "5'in kati degil" yazdirin

        System.out.println(

                sayi % 2 != 0
                        ? sayi % 3 == 0 ? "3'un kati" : "3'un kati degil"                 // sayi tek ise
                        : sayi % 5 == 0 ? "5'in kati" : "5'in kati degil"                 // sayi cift ise

        );

    }
}
