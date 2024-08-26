package day40_exceptions;

public class C07_BaziExceptionTurleri {

    public static void main(String[] args) {

        // 1- NullPointerException

        String str = null ; // null bir deger degil, isaretcidir
                            // gorevi str'a deger atanmadigini gostermektir
                            // str'i yazdirirsaniz null yazdirir
                            // herhangi bir method'la kullanmak isterseniz
                            // NullPointerException verir

        System.out.println(str); // null
        System.out.println( str + "Java" ); // nullJava
        // System.out.println(str.length()); // NullPointerException

        // 2- StringIndexOutOfBoundsException
        // 3- ArrayIndexOutOfBoundsException

        // 4- ArithmeticException : Matematiksel hatalarda olusur
        //                           orn : 9 / 0

        // 5- RunTimeException : Kod calismaya basladiktan sonra ortaya cikan
        //                       tum exception'larin Parent class'idir

        // 6- Exception : Tum Exception'larin parent'idir.

        // 7- FileNotFoundException : IOException'in child'idir
        //                            Dosyaya ulasilmak istendiginde dosya bulunamazsa olusur

        // 8- IOException : Dosya okuma veya dosyaya bilgi yazdirma ile ilgili
        //                  tum exception'larin parent'idir

        // 9 - NumberFormatException : String olarak verilen bir sayiyi parse ederken
        //                             String digit olmayan bir karakter icerirse olusur
        String str1 = "23"; // "23a"
        String str2 = "34";

        // str1 ve str2'yi matematiksel olarak toplayin
        System.out.println(  Integer.parseInt(str1) + Integer.parseInt(str2)   ); // 57

        // 10 - ClassCastException : Class casting yaparken
        //                           yapilmayacak bir casting'i syntax'a uydurarak yapmaya calisirsak olusur

        // Non-primitive data turlerinde
        // bir data turundeki degeri, baska data turundeki variable'a ATAYAMAZSINIZ

        // Integer sayi = 10;
        // String str3 = sayi ;

        // BU KURALIN ISTISNASI parent - child class'lar arasinda atama YAPILABILIR

        Integer sayi = 10;

        Object obj = sayi;

        String str3 = (String) obj;

        // 11 - IllegalArgumentException


    }
}
