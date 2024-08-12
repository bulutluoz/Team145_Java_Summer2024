package day31_accessModifier_Encapsulation;

public class T02_Runner {

    public static void main(String[] args) {

        T01_PublicVeEncapsulationKarsilastirma obj1 = new T01_PublicVeEncapsulationKarsilastirma();

        obj1.sayiPublic = 50;  // write
        System.out.println(obj1.sayiPublic); // 50 read


        obj1.setSayiPrivate(  90  ); // write
        System.out.println(  obj1.getSayiPrivate()   ); // 90 read

        /*

            Bir variable PUBLIC yapmak ile
            PRIVATE yapip GETTER VE SETTER olusturmak arasinda
            yapilabilen islevler acisindan HIC BIR FARK YOKTUR

            Pek cok developer
            datalarin guvenli bir sekilde kullanimini saglamak adina
            public yapmak yerine
            private yapip, IHTIYACA GORE Getter ve Setter method'lari ile
            baska class'larin erisimine acarlar


         */





    }
}
