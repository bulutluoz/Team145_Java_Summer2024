package day19_arrays;

public class C02_ArrayOlusturma {

    public static void main(String[] args) {

        int sayi = 4;
        String str = "Java gun gectikce guzellesir";

        // bir array olusturulurken 2 sey mutlaka belirtilmelidir
        // 1- array'in icine konulacak degerlerin data turu
        //    arr1'in data turu array, int array icine konulacak degerlerin data turudur
        // 2- bu array'in icine kac eleman(element) konulacagi

        int[] arr1 = {1,2,3,5,7};
        String[] arr2 = {"Tugba","Sabri","Suleyman"};


        // Bir array iki sekilde olusturulabilir
        // 1- 15. ve 16.satirda oldugu gibi elemanlari direk atayabilirsiniz
        //    bu yontemle array olusturuldugunda array'in eleman sayisi atadigimiz eleman sayisi kadardir
        // 2- array'in icine konulacak elementlerin data turunu
        //    ve eleman sayisini soylerek default degerlere sahip bir array olusturabiliriz

        int[] arr3 = new int[4]; // [0, 0, 0, 0]
        String[] arr4 = new String[3]; // [null, null, null]
        boolean[] arr5 = new boolean[3]; // [false, false, false]






    }
}
