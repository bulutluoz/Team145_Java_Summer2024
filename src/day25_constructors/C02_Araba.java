package day25_constructors;

public class C02_Araba {

    String marka = "Marka atanmadi";
    String model = "Model atanmadi";
    String renk = "Renk atanmadi";
    int yil = 1900;
    int fiyat ;

    public C02_Araba(String mrk , String mdl, String rnk ){
        marka = mrk;
        model = mdl;
        renk = rnk;
    }

    // Biz gorunur bir constructor olusturdugumuzda
    // Java default constructor'i siler
    // Daha onceden default constructor'i kullanmis olan objeler sorun olur
    // bunu duzeltmek icin
    // default constructor yerine parametresiz bir constructor olustururuz
    C02_Araba(){

    }

    C02_Araba(String mr , String md , int fy){
        marka = mr;
        model = md;
        fiyat = fy;
    }

    public String toString() {
        return "Ozellikler : " +
                "Marka='" + marka + '\'' +
                ", Model='" + model + '\'' +
                ", Renk='" + renk + '\'' +
                ", Yil=" + yil +
                ", Fiyat=" + fiyat ;
    }


}
