package day20_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_ArraydekiElemanlariArtirma {

    public static void main(String[] args) {

        // Verilen bir int array’in
        // tum elemanlarini istenen bir deger kadar artirip
        // array'in yeni halini bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {3,7,1,8};
        int artirmaSayisi = 4;


         arr = arrayinElemanlariniArtir(arr,artirmaSayisi);

        // System.out.println(Arrays.toString(arr));
        // gorevde yazdirma olmadigi icin
        // kendimiz calistigini gorelim diye bir kere yazdik, sonra sileriz

    }

    public static int[] arrayinElemanlariniArtir(int[] arr , int artirmaMiktari ){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += artirmaMiktari;

        }

        return arr;
    }
}
