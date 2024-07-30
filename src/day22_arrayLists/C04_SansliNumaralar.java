package day22_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C04_SansliNumaralar {

    public static void main(String[] args) {

        // calistirdigimizda 1milyondan kucuk sayilardan sansli 5 sayi secip
        // bir liste olarak bize donduren bir method olusturun


    }

    public static List<Integer> getSansliSayilar( ){

        List<Integer> sansliSayilarList = new ArrayList<>();

        Random random = new Random();
        int sayi = random.nextInt(1000000);

        return sansliSayilarList;
    }
}
