package day23_arrayLists_forEachLoop;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        // Verilen int array’deki
        // her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] arr1 = {1,0,0,0,5,2};
        elemanlarinKareleriniTopla(arr1); // 30


        int[] arr2 = {2,3,4,1,5,2};
        elemanlarinKareleriniTopla(arr2); // 59

        int[] arr3 = {2};
        elemanlarinKareleriniTopla(arr3); // 4

    }

    public static void elemanlarinKareleriniTopla( int[] arr ){

        int toplam = 0;

        for (int each : arr){

            toplam += each * each ;
        }

        System.out.println("Verilen array'deki elementleri kareleri toplami : " + toplam);
    }
}
