package day11_stringManipulations;

public class C12_replace {

    public static void main(String[] args) {

        String str = "Bugun hava ne kadar guzel";

        // str'daki tum a'lari A yapin

        System.out.println(str.replace('a','A')); // Bugun hAvA ne kAdAr guzel

        // Bugun'u Dun yapalim

        System.out.println(str.replace("Bugun","Dun")); // Dun hava ne kadar guzel

        //  cumledeki tum e'leri yok edin
        System.out.println(str.replace("e", "")); // Bugun hava n kadar guzl


    }
}
