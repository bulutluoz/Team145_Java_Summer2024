package day02_variable_scanner;

public class C06_NonPrimitiveDataTurleri {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str); // Java Candir

        System.out.println(  str.toUpperCase()   ); // JAVA CANDIR
        System.out.println(  str.toLowerCase()   ); // java candir


        System.out.println(str); // Java Candir

        // String'de atama olmadigi surece, method'larla yapilan degisiklikler KALICI OLMAZ


        str = str.toUpperCase();

        System.out.println("str'in son hali : " + str );
        // str'in son hali : JAVA CANDIR





    }
}
