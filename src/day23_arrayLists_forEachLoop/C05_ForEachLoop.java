package day23_arrayLists_forEachLoop;

import java.util.Arrays;

public class C05_ForEachLoop {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Biz de voltrani olusturalim";
        String arananHarf = "u";

        String[] karakterler = cumle.split("");
        // [B, i, z,  , d, e,  , v, o, l, t, r, a, n, i,  , o, l, u, s, t, u, r, a, l, i, m]

        int sayac = 0;

        for ( String each : karakterler ){

            if (each .equals(arananHarf)){
                sayac++;
            }

        }


        if (sayac == 0 ) System.out.println("harf cumlede kullanilmamis");
        else System.out.println("Verilen " + arananHarf + " harfi cumlede "+ sayac + " adet kullanilmis");

    }
}
