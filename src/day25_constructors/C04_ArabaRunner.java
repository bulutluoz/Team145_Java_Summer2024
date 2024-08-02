package day25_constructors;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C02_Araba araba1 = new C02_Araba();
        System.out.println(araba1);
        // Ozellikler : Marka='Marka atanmadi', Model='Model atanmadi', Renk='Renk atanmadi', Yil=1900, Fiyat=0


        C02_Araba araba2 = new C02_Araba("Mercedes","E200","Siyah");
        System.out.println(araba2);
        //Ozellikler : Marka='Mercedes', Model='E200', Renk='Siyah', Yil=1900, Fiyat=0

        C02_Araba araba3 = new C02_Araba("Opel","Corsa",3000);

        System.out.println(araba3);
        // Ozellikler : Marka='Opel', Model='Corsa', Renk='Renk atanmadi', Yil=1900, Fiyat=3000

    }
}
