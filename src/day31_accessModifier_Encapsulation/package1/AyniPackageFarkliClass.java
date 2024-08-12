package day31_accessModifier_Encapsulation.package1;

import javax.xml.crypto.Data;

public class AyniPackageFarkliClass {

    public static void main(String[] args) {

        // System.out.println(Datalar.sayiPrivate);
        // Datalar.methodPrivate();

        System.out.println(Datalar.strDefaultAccMod);
        Datalar.methodDefaultAccMod();

        System.out.println(Datalar.chrProtected);
        Datalar.methodProtected();

        System.out.println(Datalar.dblPublic);
        Datalar.methodPublic();
    }
}
