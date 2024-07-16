package day12_stringManipulations;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //		   input1 : “15.30 €” , input2 : “11.45 €”
        //		   output : 26.75 €

        String fiyatStr1 = "15.30 €";
        String fiyatStr2 = "11.45 €";

        System.out.println(  fiyatStr1 + fiyatStr2  ); //  15.30 €11.45 €

        fiyatStr1 = fiyatStr1.replaceAll("\\D",""); // "1530"
        fiyatStr2 = fiyatStr2.replaceAll("\\D",""); // "1145"

        double fiyat1 = Double.parseDouble(fiyatStr1); // 1530.0
        double fiyat2 = Double.parseDouble(fiyatStr2); // 1145.0

        fiyat1 /= 100; // 15.30
        fiyat2 /= 100; // 11.45

        System.out.println(fiyat1 + fiyat2 +" €"); // "26.75 €"




    }
}
