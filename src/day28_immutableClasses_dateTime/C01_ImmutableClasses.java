package day28_immutableClasses_dateTime;

public class C01_ImmutableClasses {

    public static void main(String[] args) {
        /*
            Immutable class'lardan olusturulan objelere
            olusturma aninda deger atanabilir
            FAKATTT sonradan degerleri DEGISTIRILEMEZ

            immutable class'lara ornek : String, Wrapper Class'larin tamami


         */

        String str = "Java Candir";

        str = "Java guzeldir";

        System.out.println(str); // Java guzeldir

        str = "Agam bizimle egleniyir";

        String abc = "";

        for (int i = 0; i <100 ; i++) {

            abc += i ;
        }


    }
}
