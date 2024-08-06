package day27_passByValue;

public class C02_PassByValue {

    /*
        Java method'lar arasi astral seyahatte
        variable'larin kendilerini degil
        degerlerini(value) gonderir

        Boylece method'da yapilan degisikler
        (method'da atama yapilsa bile) method'da kalir
     */

    public static void main(String[] args) {
        int a = 20;
        int fiyat = 200;

        System.out.println(getIndirimliFiyat(fiyat)); // 180

        System.out.println("method call'dan sonra fiyat : " + fiyat ); // 200

        fiyat = getIndirimliFiyat(fiyat);

        System.out.println("main method'da deger atadiktan sonra fiyat : " + fiyat ); // 180
    }


    public static int getIndirimliFiyat(int fiyat){
        // %10 indirim yapip, yeni fiyati dondursun
        // System.out.println(a);
        fiyat *= 0.9;

        return fiyat;

    }
}
