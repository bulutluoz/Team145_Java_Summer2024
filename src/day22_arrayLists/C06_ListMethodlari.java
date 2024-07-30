package day22_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ListMethodlari {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma"));

        System.out.println(isimler); // [Ali, Veli, Ayse, Fatma]

        isimler.add(0,"Mehmet");

        System.out.println(isimler); // [Mehmet, Ali, Veli, Ayse, Fatma]

        isimler.add(2,"Gul");

        System.out.println(isimler); // [Mehmet, Ali, Gul, Veli, Ayse, Fatma]


        isimler.set(2,"Ahmet");

        System.out.println(isimler); // [Mehmet, Ali, Ahmet, Veli, Ayse, Fatma]

        isimler.set( isimler.size()-1, "Kemal");

        System.out.println(isimler); // [Mehmet, Ali, Ahmet, Veli, Ayse, Kemal]
    }
}
