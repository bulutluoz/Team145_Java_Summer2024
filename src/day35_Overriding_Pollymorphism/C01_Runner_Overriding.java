package day35_Overriding_Pollymorphism;

import day34_InheritanceDataTypeKullanimi.C05_Hayvanlar;
import day34_InheritanceDataTypeKullanimi.C06_Kuslar;
import day34_InheritanceDataTypeKullanimi.C07_AvciKuslar;

public class C01_Runner_Overriding {

    public static void main(String[] args) {



        // AvciKuslar class'indan bir obje olusturun

        C07_AvciKuslar kartal1  = new C07_AvciKuslar();
        /*
            Yukardaki 3 obje de AvciKuslar class'inin objeleridir
            AMMA farkli ozeelliklere sahip olurlar
            kartal1 ==> tum avci kuslar ile ayni ozelliklere sahip olur
            kartal2 ==> tum kuslar ile ayni ozelliklere sahip olur
                        ve ozellikler method olarak olusturuldugu icin
                        ozelliklerin daha gunceli varsa o bilgiye sahip olur
            kartal3 ==> tum hayvanlar ile ayni ozelliklere sahip olur
                        ve ozellikler method olarak olusturuldugu icin
                        ozelliklerin daha gunceli varsa o bilgiye sahip olur

            EGER ozellikler method olarak belirlenmisse
            En guncel bilgiye ulasmaya calisir

            Bu ozelliginden dolayi
            constructor'i ayni olan objelerin
            ozellikleri de ya ayni olur veya CTE verir

            ozellikler variable olarak olusturulmus ise
            o zaman data turu ayni olan objeler
            ayni ozelliklere sahip olurlar

         */
        kartal1.omur(); // H yasar ve olurler
        kartal1.solunum(); // K akcigerle nefes alirlar
        kartal1.cogalma(); // K yumurtayla cogalirlar
        kartal1.kanat(); // K Kanatlidirlar
        kartal1.hareket(); // A ucarlar
        kartal1.beslenme(); // A Etle yerler
        kartal1.gaga(); // A Sivri gagali
        kartal1.pence();  // A Pencelidir

        C06_Kuslar kartal2      = new C07_AvciKuslar();
        kartal2.omur(); // H yasar ve olurler
        kartal2.solunum(); // K akcigerle nefes alirlar
        kartal2.cogalma(); // K yumurtayla cogalirlar
        kartal2.kanat(); // K Kanatlidirlar
        kartal2.hareket(); // A ucarlar
        kartal2.beslenme(); // A Etle yerler
        kartal2.gaga(); // A Sivri gagali
        //kartal2.pence();  // Kuslar ve Hayvanlar class'inda yok CTE

        C05_Hayvanlar kartal3   = new C07_AvciKuslar();
        kartal3.omur(); // H yasar ve olurler
        kartal3.solunum(); // K akcigerle nefes alirlar
        kartal3.cogalma(); // K yumurtayla cogalirlar
        // kartal3.kanat(); // Hayvanlar class'inda yok CTE
        kartal3.hareket(); // A ucarlar
        kartal3.beslenme(); // A Etle yerler
        // kartal3.gaga(); // Hayvanlar class'inda yok CTE
        // kartal3.pence();  // Hayvanlar class'inda yok CTE

        // Kuslar class'indan bir obje olusturun

        C06_Kuslar kus1 = new C06_Kuslar();

        kus1.omur(); // H yasar ve olurler
        kus1.solunum(); // K akcigerle nefes alirlar
        kus1.cogalma(); // K yumurtayla cogalirlar
        kus1.kanat(); // K Kanatlidirlar
        kus1.hareket(); // H hareket ederler
        kus1.beslenme(); // H beslenirler
        kus1.gaga(); // K Gagalidir
        // kus1.pence();  // Kuslar ve Hayvanlar class'inda yok CTE


        C05_Hayvanlar kus2 = new C06_Kuslar();
        kus2.omur(); // H yasar ve olurler
        kus2.solunum(); // K akcigerle nefes alirlar
        kus2.cogalma(); // K yumurtayla cogalirlar
        // kus2.kanat(); // Hayvanlar class'inda yok CTE
        kus2.hareket(); // H hareket ederler
        kus2.beslenme(); // H beslenirler
        // kus2.gaga(); // Hayvanlar class'inda yok CTE
        // kus2.pence();  // Hayvanlar class'inda yok CTE

        // Hayvanlar class'indan bir obje olusturun

        C05_Hayvanlar hayvan1 = new C05_Hayvanlar();
        hayvan1.omur(); // H yasar ve olurler
        hayvan1.solunum(); // H nefes alirlar
        hayvan1.cogalma(); // H cogalirlar
        // hayvan1.kanat(); // Hayvanlar class'inda yok CTE
        hayvan1.hareket(); // H hareket ederler
        hayvan1.beslenme(); // H beslenirler
        // hayvan1.gaga(); // Hayvanlar class'inda yok CTE
        // hayvan1.pence();  // Hayvanlar class'inda yok CTE



    }
}








