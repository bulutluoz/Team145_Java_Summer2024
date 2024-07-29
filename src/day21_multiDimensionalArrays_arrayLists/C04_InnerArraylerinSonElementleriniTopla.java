package day21_multiDimensionalArrays_arrayLists;

public class C04_InnerArraylerinSonElementleriniTopla {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin toplaminini yazdiran
        // bir method olusturun.

        int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        sonElementleriTopla(arr); // 28

        int[][] arr2 =  {{3,1,2},{1},{3,4,5,7},{10,3},{2,7,1}};

        sonElementleriTopla(arr2); // 14

    }

    public static void sonElementleriTopla(int[][] arr){

        int toplam = 0 ;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i][ arr[i].length-1 ];

        }

        System.out.println(toplam);

    }
}
