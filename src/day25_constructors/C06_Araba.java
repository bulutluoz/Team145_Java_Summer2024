package day25_constructors;

public class C06_Araba {

    /*
        Bir class'da this.variableIsmi dendiginde
        Java bu variable'i direk class level'da aramaya baslar

        marka yazildiginda
        once icinde oldugu scope'a , bulamazsa class level'a bakarken

        this.marka yazildiginda
        icinde oldugu scope'a bakmadan
        direk class level'a bakar
     */

    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    String renk = "Renk atanmadi";
    int yil = 1900;
    int fiyat ;

    C06_Araba(){

    }

    C06_Araba(String marka, String renk, int fiyat){

        this.marka = marka;
        this.renk = renk;
        this.fiyat = fiyat;
    }

    public C06_Araba(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "C06_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                '}';
    }


}
