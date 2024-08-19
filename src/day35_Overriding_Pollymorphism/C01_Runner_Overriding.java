package day35_Overriding_Pollymorphism;

import day34_InheritanceDataTypeKullanimi.C05_Hayvanlar;
import day34_InheritanceDataTypeKullanimi.C06_Kuslar;
import day34_InheritanceDataTypeKullanimi.C07_AvciKuslar;

public class C01_Runner_Overriding {

    public static void main(String[] args) {


        C05_Hayvanlar kartal3   = new C07_AvciKuslar();

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

    }
}








