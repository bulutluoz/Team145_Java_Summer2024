package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayinTumElementleriniGozdenGecirme {

    public static void main(String[] args) {

        int[] arr = {3,7,9,1,3,0,5};

        // array'i yazdirin
        System.out.println(Arrays.toString(arr)); // [3, 7, 9, 1, 3, 0, 5]

        // array'in tum elemanlarinin toplamini yazdirin

        System.out.println( arr[0] + arr[1] + arr[2] +  arr[3] + arr[4] + arr[5] + arr[6]); // 28

        // Bir array'in tum elementlerini gozden gecirmeniz veya kullanmaniz gerekirse
        // for loop kullaniriz

        int elemanlarinToplami = 0 ;

        for (int i = 0; i < arr.length ; i++) {

            elemanlarinToplami += arr[i];
        }

        System.out.println("elemanlarin toplami : " + elemanlarinToplami); // 28


        // array'deki cift sayi adedini ve tek sayi adedini yazdirin
        // [3, 7, 9, 1, 3, 0, 5]
        int ciftSayiAdedi = 0;
        int tekSayiAdedi = 0;

        for (int i = 0; i < arr.length ; i++) {

           if ( arr[i] % 2 == 0 ){
               ciftSayiAdedi++;
           } else { // cift degilse
               tekSayiAdedi++;
           }

        }

        System.out.println("Cift sayi adedi : "+ ciftSayiAdedi + ", tek sayi adedi : " + tekSayiAdedi);


        // arrayin tum elementlerini aralarinda bir bosluk birakarak yazdirin
        // 3 7 9 1 3 0 5

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");

        } // 3 7 9 1 3 0 5
        System.out.println("");

        // kullanicidan bir sayi alin
        // array'de kullanicinin girdigi sayi varsa, kac adet oldugunu,
        // verilen sayi array'de yoksa "girilen sayi arrayde yok" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();
        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] == girilenSayi ) sayac++ ;

        }

        if (sayac == 0 ){
            System.out.println("girilen sayi arrayde yok");
        }else {
            System.out.println("Girilen " + girilenSayi + " sayisi, arrayde " + sayac + " adet bulunmaktadir");
        }





    }
}
