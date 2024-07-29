package day21_multiDimensionalArrays_arrayLists;

public class C02_CokKatliArrayler {

    public static void main(String[] args) {

        /*
            tek katli bir array'in tum elementlerini gozden gecirmek istersek
            bir for loop olustururuz ve arr[i] sirasiyla butun elemanlari bize getirir

            iki katli bir array oldugunda
            kat kadar ic ice loop olusturmaliyiz
            arr[i][j] bize tum elementleri sirasiyla getirir

            EGER butun elementleri degil belirli elementleri istiyorsa
            bu durumda once bulmacayi cozmemiz lazim
         */


        int[] arr = {3,6,7,8,9,1};

        // arr'nin tum elementlerinin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];

        }

        System.out.println(toplam); // 34



        int[][] ikiKatliArr = {{3,6,7},{2,8,1},{4,7},{1}};
        toplam = 0;

        for (int i = 0; i < ikiKatliArr.length ; i++) { // outer array

            for (int j = 0; j < ikiKatliArr[i].length  ; j++) { // inner array'ler

                toplam += ikiKatliArr[i][j];

            }

        }

        System.out.println(toplam); // 39
    }
}
