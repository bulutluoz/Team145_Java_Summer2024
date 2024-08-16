package day34_InheritanceDataTypeKullanimi;

public class C04_AvciKuslar extends C03_Kuslar{
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        //Hayvanlar class'indaki kartal demek icin
        C02_Hayvanlar kartalHayvani = new C04_AvciKuslar();
        System.out.println(kartalHayvani.omur); // H yasar ve olur
        System.out.println(kartalHayvani.solunum); //  K akcigerle nefes alir
        System.out.println(kartalHayvani.cogalma); // K yumurtayla cogalir
        System.out.println(kartalHayvani.kanat); // K kanatlidir
        System.out.println(kartalHayvani.hareket); // A ucarlar
        System.out.println(kartalHayvani.beslenme); // A et yerler
        System.out.println(kartalHayvani.gaga); // A sivri gagalidir
        System.out.println(kartalHayvani.pence); // A pencelidir



        //Kuslar class'indaki kartal demek icin
        C03_Kuslar kartalKusu = new C04_AvciKuslar();
        System.out.println(kartalKusu.omur); // H yasar ve olur
        System.out.println(kartalKusu.solunum); //  K akcigerle nefes alir
        System.out.println(kartalKusu.cogalma); // K yumurtayla cogalir
        System.out.println(kartalKusu.kanat); // K kanatlidir
        System.out.println(kartalKusu.hareket); // H hareket ederler
        System.out.println(kartalKusu.beslenme); // H beslenirler
        System.out.println(kartalKusu.gaga); // K  gagalari vardir
        // System.out.println(kartalKusu.pence); // K veya H 'de yok CTE


        // AvciKuslar class'indaki kartal icin
        // Constructor objenin hangi class'dan olusturuldugunu,
        // Data Turu ise hangi class'in ozelliklerini alacagini belirler

        C04_AvciKuslar avciKartal = new C04_AvciKuslar();
        System.out.println(avciKartal.omur); // H yasar ve olur
        System.out.println(avciKartal.solunum); //  K akcigerle nefes alir
        System.out.println(avciKartal.cogalma); // K yumurtayla cogalir
        System.out.println(avciKartal.kanat); // K kanatlidir
        System.out.println(avciKartal.hareket); // A ucarlar
        System.out.println(avciKartal.beslenme); // A et yerler
        System.out.println(avciKartal.gaga); // A sivri gagalidir
        System.out.println(avciKartal.pence); // A pencelidir

    }

}
