package day18_scope;

public class C03_Static_Instance_Variables {

    public static String hIsmi = "Yildiz Hastanesi";
    public static String hTelefonu = "0312 2343434";
    public static String hAdresi = "Cankaya";

    public String pIsmi = "Isim atanmadi";
    public String pAdresi = "Adres atanmadi";
    public String pTelefonu = "Telefon atanmadi";

    public static void main(String[] args) {


        C03_Static_Instance_Variables pers1 = new C03_Static_Instance_Variables();

        System.out.println(pers1.pAdresi); // Adres atanmadi
        System.out.println(pers1.pIsmi); // isim atanmadi
        System.out.println(pers1.pTelefonu); // Telefon atanmadi

        pers1.pAdresi = "Yenimahalle";
        pers1.pIsmi = "Murat";
        pers1.pTelefonu = "5322343434";

        System.out.println(pers1.pAdresi); // Yenimahalle
        System.out.println(pers1.pIsmi); // Murat
        System.out.println(pers1.pTelefonu); // 532 2343434

        System.out.println(hIsmi); // Yildiz Hastanesi
        System.out.println(pers1.hIsmi); // Yildiz Hastanesi
        // Static member 'hIsmi' accessed via instance reference


        C03_Static_Instance_Variables pers2 = new C03_Static_Instance_Variables();
        System.out.println(pers2.pAdresi); // Adres atanmadi
        System.out.println(pers2.pIsmi); // isim atanmadi
        System.out.println(pers2.pTelefonu); // Telefon atanmadi

        pers2.pTelefonu = "5445434343";
        pers2.pIsmi = "Furkan";
        pers2.pAdresi = "Sincan";

        System.out.println(pers2.pAdresi); // Sincan
        System.out.println(pers2.pIsmi); // Furkan
        System.out.println(pers2.pTelefonu); // 5445434343

        System.out.println(pers1.pAdresi); // Yenimahalle
        System.out.println(pers1.pIsmi); // Murat
        System.out.println(pers1.pTelefonu); // 532 2343434


        pers2.hAdresi = "Altindag";

        System.out.println(hAdresi); // Altindag
        System.out.println(pers2.hAdresi); // Altindag
        System.out.println(pers1.hAdresi); // Altindag


        pers1.hAdresi = "Sincan";
        System.out.println(hAdresi); // Sincan
        System.out.println(pers2.hAdresi); // Sincan
        System.out.println(pers1.hAdresi); // Sincan





    }
}
