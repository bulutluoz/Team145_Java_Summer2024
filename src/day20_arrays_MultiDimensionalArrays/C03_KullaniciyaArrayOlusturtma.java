package day20_arrays_MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturan ve bize donduren bir method olusturun.

        String[] isimler = kullaniciyaStringArrayOlusturt();

        System.out.println(Arrays.toString(isimler));
    }


    public static String[] kullaniciyaStringArrayOlusturt(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("kac isimlik bir array olusturmak istersiniz");
        int length = scanner.nextInt();
        scanner.nextLine();

        String[] isimler = new String[length]; // kullanici 3 girdiyse
                                               // [null, null, null]

        for (int i = 0; i < isimler.length; i++) {

            System.out.println("Array'e eklenmek uzere bir isim giriniz...");

            isimler[i] = scanner.nextLine();
        }


        return isimler;
    }
}
