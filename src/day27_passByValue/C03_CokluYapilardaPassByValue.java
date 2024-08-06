package day27_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_CokluYapilardaPassByValue {
    /*
        java Pass By Value kullanir
        bu kural java'daki her data turu icin gecerlidir

        ANCAKKKK coklu eleman barindiran yapilarda bir detaya DIKKAT etmemiz gerekir
     */

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Mehmet","Cem","Bahadir","Murat"));

        System.out.println(isimler); // [Mehmet, Cem, Bahadir, Murat]



    }


    // parametre olarak String liste kabul edip
    // listedeki ilk elementi silen bir method olusturun
    // method'da listenin eleman silinmis halini yazdirin





















}
