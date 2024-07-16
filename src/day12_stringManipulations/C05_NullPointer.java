package day12_stringManipulations;

public class C05_NullPointer {

    public static void main(String[] args) {

        // Java'da method icerisinde deger atamadan variable deklare edebilirsiniz
        // ANCAKKK deger atamasi yapmadan variable'i kullanamazsiniz

        String ogrenci1;
        String ogrenci2;
        String ogrenci3;

        ogrenci1 = "Cem Bakir";
        // tum ogrenci isimlerini yazdirin
        // System.out.println(ogrenci1 + ", " + ogrenci2 + ", " + ogrenci3);


        // Javada bir deger atadigimizda Java o degerin anlamli olup olmamasina bakmaz
        // variable'lari deger atanmis veya atanmamis olarak ayirir

        ogrenci2 = "";
        ogrenci3 = "";
        System.out.println(ogrenci1 + ", " + ogrenci2 + ", " + ogrenci3); // Cem Bakir, ,
        // bu atamalari yaparsak, Java'ya deger atanmamis kac variable var? diye sordugumuzda


        // Bize oyle bir cozum gerekiyor ki
        // Hem deger atamayalim,
        // hem de yazdirabilelim ve yazdirdigimizda deger atanmamis oldugunu gorelim

        String ogrenci4 = null ;
        // null Java'nin ozel bir cozumudur
        // null bir deger degil ISARETCIDIR
        // gorevi sadece "ogrenci4'e deger atanmadi" demektir

        System.out.println(ogrenci4); // null

        // System.out.println(ogrenci4.toUpperCase()); // NullPointerException
        // System.out.println(ogrenci4.charAt(0)); // NullPointerException

        System.out.println(ogrenci4 + " naber?"); // null naber?
    }
}
