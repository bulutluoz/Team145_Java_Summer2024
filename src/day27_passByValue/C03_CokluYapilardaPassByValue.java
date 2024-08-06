package day27_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_CokluYapilardaPassByValue {
    /*
        java Pass By Value kullanir
        bu kural java'daki her data turu icin gecerlidir

        ANCAKKKK coklu eleman barindiran yapilarda bir detaya DIKKAT etmemiz gerekir

        method'da coklu yapinin kendisine yeni bir deger atanirsa
        yapilan bu degisiklik main method'da kalici olmaz

        yapinin kendisine atama yapilmayip
        SADECE elemanlar degisiyorsa bu degisiklik kalici olur
     */

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Mehmet","Cem","Bahadir","Murat"));

        System.out.println(isimler); // [Mehmet, Cem, Bahadir, Murat]

        ilkElementiSil(isimler); // Method'da isim silinmis hali : [Cem, Bahadir, Murat]

        System.out.println("Main method'da method call'dan sonra isimler : " + isimler);
        // Main method'da method call'dan sonra isimler : [Cem, Bahadir, Murat]

        listeyiYenile(isimler); // listeyi yenile method'unda isimler listesinin son hali : [Ali]

        System.out.println("Main method'da listeyiYenile method call'dan sonra isimler : " + isimler);

        // Main method'da listeyiYenile method call'dan sonra isimler : [Cem, Bahadir, Murat]

    }

    // parametre olarak String liste kabul edip
    // listeye icinde "Ali" isminin oldugu yeni bir liste degeri atayan
    // ve bu halini yazdiran bir method olusturun

    public static void listeyiYenile(List<String> isimler){

        isimler = new ArrayList<>(Arrays.asList("Ali"));

        System.out.println("listeyi yenile method'unda isimler listesinin son hali : " + isimler);

    }


    // parametre olarak String liste kabul edip
    // listedeki ilk elementi silen bir method olusturun
    // method'da listenin eleman silinmis halini yazdirin

    public static void ilkElementiSil( List<String> isimler ){

        isimler.remove(0);

        System.out.println("Method'da isim silinmis hali : " + isimler);
    }



















}
