package day24_constructors;

public class C07_Runner {

    public static void main(String[] args) {

        /*
            Eger default constructor kullanilarak
            bir obje olusturulursa
            default constructor'in
            parametresi ve body'sinde kod olmadigindan
            instance variable'lara atanan degerler
            objelerin ILK DEGERLERI olur

            AMMA gorunur bir constructor varsa
            constructor body'sinde kod olabilecegi icin
            ILK DEGERLER instance variable'larin degerlerinden
            farkli OLABILIR

         */


        C06 obj1 = new C06();

        System.out.println(obj1.sayi);
        System.out.println(obj1.adres);








        C06 obj2 = new C06();
        System.out.println(obj2.sayi);
        System.out.println(obj2.adres);

    }
}
