package day26_constructors_staticKeyword;

public class C01_Hemsire {

    static String hastaneIsmi = "Yildiz hastanesi";
    static String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Doktor Murat";

    static String hemsireIsmi = "Isim atanmadi";
    String hemsireAdresi = "Adres atanmadi";
    String hemsireTel = "Tel atanmadi";

    public static void main(String[] args) {

        C01_Hemsire hemsire1 = new C01_Hemsire();
        hemsire1.hemsireIsmi = "Ayse";
        hemsire1.hemsireAdresi = "Kizilay";
        hemsire1.hemsireTel = "5324323232";
        System.out.println("Hemsire1 : " + hemsire1);
        // Hemsire1 : , hastaneIsmi='Yildiz hastanesi', hastaneAdresi='Cankaya', bashekimIsmi='Doktor Murat',
        //              hemsireIsmi='Ayse', hemsireAdresi='Kizilay', hemsireTel='5324323232'

        C01_Hemsire hemsire2 = new C01_Hemsire();
        hemsire2.hemsireIsmi = "Fatma";
        hemsire2.hemsireAdresi = "Ulus";
        hemsire2.hemsireTel = "5453454545";
        hemsire2.hastaneAdresi = "Yenimahalle";

        System.out.println("Hemsire1 : " + hemsire1);
        // Hemsire1 : , hastaneIsmi='Yildiz hastanesi', hastaneAdresi='Yenimahalle', bashekimIsmi='Doktor Murat',
        //              hemsireIsmi='Fatma', hemsireAdresi='Kizilay', hemsireTel='5324323232'

        System.out.println("Hemsire2 : " + hemsire2);
        // Hemsire2 : , hastaneIsmi='Yildiz hastanesi', hastaneAdresi='Yenimahalle', bashekimIsmi='Doktor Murat',
        //              hemsireIsmi='Fatma', hemsireAdresi='Ulus', hemsireTel='5453454545'


        C01_Hemsire hemsire3 = new C01_Hemsire();
        hemsire3.hemsireIsmi = "Kemal";
        hemsire3.hemsireAdresi = "Altindag";
        hemsire3.hemsireTel = "5554353535";
        hemsire3.hastaneAdresi = "Altindag";


        System.out.println("Hemsire1 : " + hemsire1);
        // Hemsire1 : , hastaneIsmi='Yildiz hastanesi', hastaneAdresi='Altindag', bashekimIsmi='Doktor Murat',
        //              hemsireIsmi='Kemal', hemsireAdresi='Kizilay', hemsireTel='5324323232'


        System.out.println("Hemsire2 : " + hemsire2);
        //Hemsire2 : , hastaneIsmi='Yildiz hastanesi', hastaneAdresi='Altindag', bashekimIsmi='Doktor Murat',
        //             hemsireIsmi='Kemal', hemsireAdresi='Ulus', hemsireTel='5453454545'


        System.out.println("Hemsire3 : " + hemsire3);
        // Hemsire3 : , hastaneIsmi='Yildiz hastanesi', hastaneAdresi='Altindag', bashekimIsmi='Doktor Murat',
        //              hemsireIsmi='Kemal', hemsireAdresi='Altindag', hemsireTel='5554353535'



    }







    @Override
    public String toString() {
        return
                ", hastaneIsmi='" + hastaneIsmi + '\'' +
                ", hastaneAdresi='" + hastaneAdresi + '\'' +
                ", bashekimIsmi='" + bashekimIsmi + '\'' +
                ", hemsireIsmi='" + hemsireIsmi + '\'' +
                ", hemsireAdresi='" + hemsireAdresi + '\'' +
                ", hemsireTel='" + hemsireTel + '\'';
    }
}
