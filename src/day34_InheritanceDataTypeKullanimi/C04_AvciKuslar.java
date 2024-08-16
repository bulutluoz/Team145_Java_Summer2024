package day34_InheritanceDataTypeKullanimi;

public class C04_AvciKuslar extends C03_Kuslar{
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        /*
                ozellikler variable olarak olusturuldugunda
                DOMINANT olan Data Turu secilen class'dir

                Java aramaya data turu secilen class'dan baslar
                ve ilk buldugu degeri kullanir

         */

        // Hayvanlar class'indaki bir hayvan olsturalim
        C02_Hayvanlar hayvan1  = new C02_Hayvanlar();
        System.out.println(hayvan1.omur); // H yasar ve olur
        System.out.println(hayvan1.solunum); //  H nefes alirlar
        System.out.println(hayvan1.cogalma); // H cogalirlar
        //System.out.println(hayvan1.kanat); // H class'inda yok CTE
        System.out.println(hayvan1.hareket); // H hareket ederler
        System.out.println(hayvan1.beslenme); // H beslenirler
        //System.out.println(hayvan1.gaga); // H class'inda yok CTE
        //System.out.println(hayvan1.pence); // H class'inda yok CTE


        // Hayvanlar class'indaki bir kus olusturalim
        C02_Hayvanlar kusHayvani = new C03_Kuslar();
        System.out.println(kusHayvani.omur); // H yasar ve olur
        System.out.println(kusHayvani.solunum); //  H nefes alirlar
        System.out.println(kusHayvani.cogalma); // H cogalirlar
        //System.out.println(kusHayvani.kanat); // H class'inda yok CTE
        System.out.println(kusHayvani.hareket); // H hareket ederler
        System.out.println(kusHayvani.beslenme); // H beslenirler
        //System.out.println(kusHayvani.gaga); // H class'inda yok CTE
        //System.out.println(kusHayvani.pence); // H class'inda yok CTE


        //Hayvanlar class'indaki kartal demek icin
        C02_Hayvanlar kartalHayvani = new C04_AvciKuslar();
        System.out.println(kartalHayvani.omur); // H yasar ve olur
        System.out.println(kartalHayvani.solunum); //  H nefes alirlar
        System.out.println(kartalHayvani.cogalma); // H cogalirlar
        // System.out.println(kartalHayvani.kanat); // H class'inda yok CTE
        System.out.println(kartalHayvani.hareket); // H hareket ederler
        System.out.println(kartalHayvani.beslenme); // H beslenirler
        //System.out.println(kartalHayvani.gaga); // H class'inda yok CTE
        //System.out.println(kartalHayvani.pence); // H class'inda yok CTE



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
