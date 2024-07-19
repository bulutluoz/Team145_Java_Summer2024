package day15_methodOlusturmaVeKullanma;

public class C03_MethodOlusturma_AsalMi {

    public static void main(String[] args) {

        // verilen bir sayi asal ise true, asal degilse false yazdiran bir method olusturun

        asalMi(82); // false
        asalMi(97); // true




    }

    public static void asalMi(int sayi){
        boolean asalMi = true;

        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                asalMi = false;
                break;
            }
        }
        System.out.println(asalMi);
    }
}
