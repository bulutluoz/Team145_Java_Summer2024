package day19_arrays;

import day18_scope.C03_Static_Instance_Variables;

public class C01_ScopeTekrar {

    public static void main(String[] args) {









        /*
            Class level variable'lara baska class'lardan da ulasilabilir

            instance variable'lara ulasmak icin
            instance variable'larin oldugu class'dan bir obje olusturmaliyiz

            baska class'daki static variable'lara ulasmak icin ise
            once static variable'in oldugu class adini yazip sonra variable adini yazmaliyiz


            Eger bir variable
            - butun objeler icin ortak bir deger tasiyorsa
              static olarak olustururuz
              hastaneIsmi , bashekimIsmi gibi

            - eger her bir obje icin ayri bir deger tasimasi gerekiyorsa
              instance olarak olustururuz
              personeIsmi, personelTelefonu....
         */

        C03_Static_Instance_Variables obj1 = new C03_Static_Instance_Variables();

        System.out.println(obj1.pAdresi); // adres atanmadi
        System.out.println(obj1.pIsmi);// isim atanmadi



        System.out.println(obj1.hIsmi);// Yildiz hastanesi
        // Static member 'hIsmi' accessed via instance reference

        System.out.println(C03_Static_Instance_Variables.hIsmi); // Yildiz hastanesi

    }


}
