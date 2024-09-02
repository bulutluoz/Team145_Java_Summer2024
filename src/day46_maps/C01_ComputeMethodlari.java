package day46_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_ComputeMethodlari {

    public static void main(String[] args) {


        Map<String,Integer> harfler = new HashMap<>();

        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        System.out.println(harfler); // {A=20, B=40, R=30, T=25, Z=2}



       // map'deki B'nin degerini 5 artirin

        int yeniDeger = harfler.get("B") + 5 ;

        harfler.put("B",yeniDeger);

        System.out.println(harfler); // {A=20, B=45, R=30, T=25, Z=2}


       // Map'de key olarak S varsa
       // degerini 2 katina cikarin

       if (harfler.containsKey("S")){

           yeniDeger = harfler.get("S") *2 ;
           harfler.put("S",yeniDeger);
       }

        System.out.println(harfler); // {A=20, B=45, R=30, T=25, Z=2}



        // Map'de key olarak R varsa
        // degerini 2 katina cikarin

        if (harfler.containsKey("R")){

            yeniDeger = harfler.get("R") *2 ;
            harfler.put("R",yeniDeger);
        }

        System.out.println(harfler); // {A=20, B=45, R=60, T=25, Z=2}



        // Eger K harfi varsa,
        // degerini 5 azaltin

        harfler.computeIfPresent("K", (k,v)-> v-5 );
        System.out.println(harfler); // {A=20, B=45, R=60, T=25, Z=2}


        // Eger T harfi varsa,
        // degerini 5 azaltin

        harfler.computeIfPresent("T", (k,v)-> v-5 );
        System.out.println(harfler); // {A=20, B=45, R=60, T=20, Z=2}


        // A 'nin degerini, eski degerinin 2 katinin 3 fazlasi yapin

        harfler.compute( "A" , (a,b)-> b * 2 + 3 );
        System.out.println(harfler); // {A=43, B=45, R=60, T=20, Z=2}


        // Eger S harfi yoksa
        // degeri 25 olarak map'e ekleyin

        harfler.putIfAbsent("S",25);
        System.out.println(harfler); // {A=43, B=45, R=60, S=25, T=20, Z=2}

        // Eger T harfi yoksa
        // degeri 40 olarak map'e ekleyin

        harfler.putIfAbsent("T",40);
        System.out.println(harfler); // {A=43, B=45, R=60, S=25, T=20, Z=2}



        // Eger Y harfi yoksa
        // degeri 44 olarak map'e ekleyin

        harfler.computeIfAbsent( "Y" , v-> 44 );
        System.out.println(harfler); // {A=43, B=45, R=60, S=25, T=20, Y=44, Z=2}



        // Eger Z harfi yoksa
        // degeri 55 olarak map'e ekleyin

        harfler.computeIfAbsent( "Z" , v-> 55 );
        System.out.println(harfler); // {A=43, B=45, R=60, S=25, T=20, Y=44, Z=2}











        //
    }
}
