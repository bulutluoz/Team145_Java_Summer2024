package day10_stringManipulations;

import java.util.Locale;

public class C01_toLowercase_toUpperCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        // str'i buyuk harf olarak yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR


        System.out.println(str.toLowerCase()); // java candir

        // method'lari kullanmak str'i kalici olarak degistirmez
        // SADECE kullanildigi satir icin degistirir

        System.out.println(str); // Java Candir


        str.toUpperCase();
        // 22.satirdaki kod calisir
        // AMMA yazdirma veya atama olmadigindan
        // yaptigi islem 22.satirda kalir
        // ne konsolda gorunur, ne de kalici bir degisiklik yapar

        // Kalici degisiklik yapmak istedigimizde ATAMA yapmaliyiz

        str = str.toUpperCase();

        System.out.println(str); //  JAVA CANDIR


        // str'i kucuk harfe cevirirsek, ingilizce alfabe kullandigi icin CANDIR ==> candir olur
        // Eger I'yi toLopwercase yaptigimizda turkce kucuk ı olmasini istersek

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

    }
}
