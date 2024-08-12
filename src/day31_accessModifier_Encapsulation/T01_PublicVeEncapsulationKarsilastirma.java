package day31_accessModifier_Encapsulation;

public class T01_PublicVeEncapsulationKarsilastirma {

    // Bir variable'i public olusturmak ile
    // private olusturup HEM Getter, HEM Setter method'u olusturmak
    // AYNI SEYLER midir ?


    public int sayiPublic = 20;


    private int sayiPrivate = 70;

    public int getSayiPrivate() {
        return sayiPrivate;
    }

    public void setSayiPrivate(int sayiPrivate) {
        this.sayiPrivate = sayiPrivate;
    }




}
