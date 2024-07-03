package day03_scanner_dataCasting;

public class C06_DataCasting {

    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";

        // bir variable'a baska data turundeki bir deger ATANABILIR MI?

        // bl = chr;
        // bl = byt;
        // bl = sayiInt;
        // bl = (boolean) sayiInt;
        // bl = str;

        // chr = bl;
        // chr = (char) bl;
        // chr = byt;
        // chr = dbl;
        // chr = str;

        // str = bl;
        // str = (String)bl;
        // str = chr;
        // str = shrt;
        // str = lng;

        // boolean, char veya String data turundeki bir variable'a
        // baska data turundeki degerleri direk ATAYAMAYIZ

        // Sayi degeri alan byte, short, int, long, float ve double variable'lar ise
        // variable'in data turunden daha dar kapsamli olan data turundeki degerleri
        // hic bir islem yapmamiza gerek kalmadan kabul ederler
        // buna

        byt = (byte) shrt;
        byt = (byte) sayiInt;
        byt = (byte) lng;
        byt = (byte) flt;
        byt = (byte) dbl;

        shrt = byt;
        shrt = (short) sayiInt;
        shrt = (short) lng;
        shrt = (short) flt;
        shrt = (short) dbl;

        sayiInt = byt;
        sayiInt = shrt;
        // sayiInt = lng;
        // sayiInt = flt;
        // sayiInt = dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
        // lng = flt;
        // lng = dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
        // flt = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;



    }
}
