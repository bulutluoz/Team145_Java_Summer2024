package day10_stringManipulations;

public class C02_charAt {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.charAt(0)); // J

        System.out.println(str.charAt(6)); // u

        // str'daki bastan 9.harfi yazdirin

        System.out.println(str.charAt(8)); // e

        // sondan 3.harfi yazdirin

        System.out.println(str.charAt(10)); // d

        // System.out.println(str.charAt(-3));
        // The call to 'charAt' always fails as an argument is out of bounds


        System.out.println(str.charAt(12)); // r

        // System.out.println(str.charAt(13)); // StringIndexOutOfBoundsException
        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException
    }
}
