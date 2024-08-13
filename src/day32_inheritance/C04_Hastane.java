package day32_inheritance;

public class C04_Hastane {

    // Bir class olusturuldugunda parent class olarak tasarlanmasa bile
    // sonradan parent edinilme ihtimali dusunulerek class uyelerine erisim
    // access modifier ile duzenlenebilir.

    // EGER hic erisilemesin dedigimiz bir variable varsa private yapilabilir
    // hastane ismi gibi herkes gorebilsin ama deger atayamasin diyorsaniz
    // encapsule edip getter olusturabilirsiniz

    // Ikinci bir yontem olarak kullanilan diger bir method'da
    // erisimin kolay olmasi icin static yapip
    // degistirmenin mumkun olmamasi icin final olarak tanimlamaktir

    public String getHastaneIsmi() {
        return hastaneIsmi;
    }

    private String hastaneIsmi = "Yildiz Hastanesi";
    static final String hastaneAdresi = "Cankaya";
    static String bashekimIsmi = "Doktor Kemal";
}
