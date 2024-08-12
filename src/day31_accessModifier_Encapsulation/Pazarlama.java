package day31_accessModifier_Encapsulation;

public class Pazarlama {
    /*
        Bir variable icin
        variable degerini goruntuleme (read) ve
        variable'a deger atama (write) yetkilerini ayirt edebilmek icin

        1- Oncelikle KIMSENIN access modifier'i kullanarak
           bu variable'lara ULASAMAMASI icin
           bu variable'lari PRIVATE yapiyoruz

        2- Her variable icin istenen islemi yapabilecek
           PUBLIC method'lar olusturun
     */

    private int satisTutari;
    // baska class'dakilar satis yaptiklarinda
    // satisTutarina atama yapabilecek
    // ama satisTutarini kendi class'indan yazdiramayacak (goruntuleyemeyecek)


    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari ;
    }

    private int toplamSatisTutari;

    // baska class'lar toplam satis tutarini gorebilecekler ( yazdirabilecekler)
    // ama toplamSatisTutarina deger atayamayacaklar


    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
}
