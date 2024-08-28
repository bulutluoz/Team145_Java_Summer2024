package day42_collections;

import java.util.HashSet;
import java.util.Set;

public class C06_Set {

    public static void main(String[] args) {

        Set<String> harfler = new HashSet<>();
        harfler.add("a");
        harfler.add("p");
        harfler.add("l");
        harfler.add("a");
        harfler.add("f");
        harfler.add("a");

        System.out.println(harfler); // [p, a, f, l]


    }
}
