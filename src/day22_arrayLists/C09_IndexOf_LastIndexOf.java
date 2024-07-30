package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_IndexOf_LastIndexOf {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,3,5,3,5,7,9,5,3,5,2));

        System.out.println(sayilar.indexOf(5)); // 2

        System.out.println(sayilar.lastIndexOf(5)); // 9

        System.out.println(sayilar.indexOf(11)); // -1

        System.out.println(sayilar.lastIndexOf(15)); // -1
    }
}
