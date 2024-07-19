package day15_methodOlusturmaVeKullanma;

public class C06_MetniTerseCevir {
    public static void main(String[] args) {

        // verilen metnin tersten yazilisini donduren bir method olusturun

        System.out.println(metniTersineCevir("Kaymak")); // kamyaK

        // "ey edip adanada pide ye" palindrome'mudur?


        String metin = "ey edip adanada pide ye";
        String tersMetin = metniTersineCevir(metin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Verilen metin palindrome");
        }else {
            System.out.println("Verilen metin palindrome degil");
        }




    }

    public static String metniTersineCevir( String metin){

        String tersMetin ="";


        for (int i = metin.length()-1; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);
        }


        return tersMetin;

    }
}
