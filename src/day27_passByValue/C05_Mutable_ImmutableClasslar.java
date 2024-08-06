package day27_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Mutable_ImmutableClasslar {

    public static void main(String[] args) {

        /*
            java bazi data turlerini mutable (degistirilebilir) sekilde olusturmusken,
            (List, Array)
            bazi data turlerini immutable (degistirilemez) olarak olusturmustur
            (String, WrapperClass'lar)
         */

        String str = "java candir";

        str.toUpperCase();

        System.out.println(str); // java candir

        System.out.println(str.substring(0, 4)); // java

        System.out.println(str); // java candir


        List<String> isimler = new ArrayList<>(Arrays.asList("Ahmet","Cem","Suleyman"));

        System.out.println(isimler); // [Ahmet, Cem, Suleyman]

        isimler.add(0, "Bahadir");

        System.out.println(isimler); // [Bahadir, Ahmet, Cem, Suleyman]

        System.out.println(isimler.remove("Cem")); // true

        System.out.println(isimler); // [Bahadir, Ahmet, Suleyman]

        isimler.clear();

        System.out.println(isimler); // [ ]

    }
}
