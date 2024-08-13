package day32_inheritance;

public class C05_TeknikPersonel extends C01_Personel{

    public static void main(String[] args) {

        C05_TeknikPersonel teknikPersonel1 = new C05_TeknikPersonel();

        System.out.println(teknikPersonel1.getHastaneIsmi()); // Yildiz Hastanesi

        // teknikPersonel1.getHastaneIsmi() = "Devrim Hastanesi";

        // System.out.println(teknikPersonel1.hastaneIsmi); // Devrim Hastanesi

        System.out.println(hastaneAdresi); // Cankaya

        // hastaneAdresi = "Yenimahalle";
        // Cannot assign a value to final variable 'hastaneAdresi'


    }
}
