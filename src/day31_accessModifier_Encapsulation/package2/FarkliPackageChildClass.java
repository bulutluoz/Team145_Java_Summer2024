package day31_accessModifier_Encapsulation.package2;

import day31_accessModifier_Encapsulation.package1.Datalar;

public class FarkliPackageChildClass extends Datalar {

    public static void main(String[] args) {

        //System.out.println(sayiPrivate);
        //methodPrivate();

        //System.out.println(strDefaultAccMod);
        //methodDefaultAccMod();

        System.out.println(chrProtected);
        methodProtected();

        System.out.println(dblPublic);
        methodPublic();
    }

}
