package day24_constructors;

public class C02 {

    // default constructor'in gorevlerini yapan
    // gorunur bir constructor olusturmak istersek

    C02(){

    }

    String isim = "Ali";
    String adres = "Ankara";

    public void telefonYazdir(){
        System.out.println("Telefon numaramiz 0312 2343434");
    }

    public int kareAl(int sayi){

        return sayi*sayi;
    }
}
