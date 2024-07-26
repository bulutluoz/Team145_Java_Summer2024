package day20_arrays_MultiDimensionalArrays;

public class C02_PozitifElemanlarinToplami {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr = {4,-8,-9,0,1,3};

        System.out.println(pozitifElemenlariTopla(arr)); // 8


        int[] arr2 = {4,2,-5,0,-1,3};

        System.out.println(pozitifElemenlariTopla(arr2)); // 9

    }

    public static int pozitifElemenlariTopla( int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0 ){
                toplam += arr[i];
            }

        }

        return toplam;

    }
}
