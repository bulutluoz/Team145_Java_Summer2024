package day15_methodOlusturmaVeKullanma;

public class C05_IsimDuzenle {

    public static void main(String[] args) {

        //   Verilen isim ve soyismi alip
        //   Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //   isim bosluk soyisim seklinde bize donduren bir method olusturun
        //   input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz

        ismiDuzenle("furkan","bahar");
        // method calisir ama getirdigi duzenliIsmi method'dan almadik
        // kapici ekmegi getirdi ama ondan almadik

        System.out.println(ismiDuzenle("MURAT", "DONMEZER"));
        // method ismi duzenler, hemen kullandigimiz icin sonraya bir sey kalmaz
        // kapici ekmegi getirdi, biz de ekmegi yiyip bitirdik

        String isminYeniHali =  ismiDuzenle("YUSUF","ucar");
        // method ismin duzenlenmis halini getirdi
        // biz de daha sonra kullanmak uzere bunu kaydettik
        // kapici ekmegi getirdi, biz de ondan alip saklama kutusuna koyduk

        // kaydetmenin avantaji su
        // 20.satirdan sonra istedigim zaman bu ismin yeni halini yazdirabilir
        System.out.println(isminYeniHali); // Yusuf Ucar
        // istedigim zaman da baska bir variable'a atayabilirim
        String yeniOgrenciIsmi = isminYeniHali;

    }


    public static String ismiDuzenle( String isim , String soyisim ){

        String duzenlenmisIsim =
                isim.substring(0,1).toUpperCase() // ismin ilk harfini buyuk harf
                + isim.substring(1).toLowerCase() // ismin kalanini kucuk harf
                + " " // isim ile soyisim arasindaki bosluk
                + soyisim.substring(0,1).toUpperCase() // soyismin ilk harfini buyuk harf
                + soyisim.substring(1).toLowerCase(); // soyismin kalanini kucuk harf

        return duzenlenmisIsim;
    }
}
