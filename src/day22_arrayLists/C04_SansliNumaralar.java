package day22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C04_SansliNumaralar {

    public static void main(String[] args) {

        // calistirdigimizda 1milyondan kucuk sayilardan sansli 5 sayi secip
        // bir liste olarak bize donduren bir method olusturun

        System.out.println(getSansliSayilar()); // [736996, 75931, 92890, 724199, 370469]
        System.out.println(getSansliSayilar()); // [327189, 110707, 112078, 578976, 346462]
        System.out.println(getSansliSayilar()); // [58861, 56416, 397135, 367822, 515233]


        // verilen baslangic ve bitis derleri arasinda
        // 5 tane sansli sayi secip
        // bir liste olarak donduren bir method olusturun
        // sayilar birbirinden farkli olmalidir

        System.out.println(istenenAraliktanSanslisayiUret(200, 300));
        // [270, 288, 279, 277, 250]

        System.out.println(istenenAraliktanSanslisayiUret(3400, 4300));
        // [3579, 3782, 3488, 3808, 3669]

        System.out.println(istenenAraliktanSanslisayiUret(10, 16)); // [12, 14, 10, 13, 11]

    }


    public static List<Integer> istenenAraliktanSanslisayiUret(int baslangic, int bitis){

        // ornek olarak 2200 ile 3000 arasinda 5 sayi uretsin
        List<Integer> sansliSayilarList = new ArrayList<>();

        Random random = new Random();

        while (sansliSayilarList.size() < 5) {

            int sayi = random.nextInt(bitis-baslangic);

            if ( !sansliSayilarList.contains(sayi+baslangic)){
                sansliSayilarList.add( sayi+baslangic );
            }

        }

        return sansliSayilarList;
    }

    public static List<Integer> getSansliSayilar( ){

        List<Integer> sansliSayilarList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <5 ; i++) {

            int sayi = random.nextInt(1000000);
            sansliSayilarList.add(sayi);
        }

        return sansliSayilarList;
    }
}
