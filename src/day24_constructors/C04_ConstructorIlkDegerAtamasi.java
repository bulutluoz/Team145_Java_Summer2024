package day24_constructors;

public class C04_ConstructorIlkDegerAtamasi {

    public static void main(String[] args) {
        /*
            Bir obje olusturmak icin constructor calistiginda
            objeyi olusturur,
            objenin olusturuldugu class'a gider
            INSTANCE variable'larin ve degerlerinin
            birer kopyasini alip objeye yapistirir
         */

        C02 obj1 = new C02();
        System.out.println(obj1.adres); // Ankara
        obj1.adres = "Istanbul";


        C02 obj2 = new C02();
        System.out.println(obj2.adres); // Ankara
        obj2.adres = "Izmir";


        C02 obj3 = new C02();
        System.out.println(obj3.adres); // Ankara
        System.out.println(obj2.adres); // Izmir
        System.out.println(obj1.adres); // Istanbul

    }
}
