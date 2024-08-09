package day30_StringBuilder_accessModifier;

public class C03_StringBuilderda_StringMethodlariKullanma {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java candir");

        // sb "a" icerir mi ?
        // NOT 1 : stringBuilder'da olmayan ama String'de olan method'lari kullanmak isterseniz

        System.out.println(sb.toString().contains("a")); // true


        // NOT 2 : StringBuilder method'larindan return type'i StringBuilder olanlar
        //         kalici degisiklik yaparlar
        //         AMMA return type'i StringBuilder OLMAYANLAR
        //         kalici degisiklik YAPMAZ

        System.out.println(sb.substring(5)); // candir

        System.out.println(sb); // Java candir

        // sb = sb.substring(5); // returnt type String oldugundan StringBuilder'i DEGISTIREMEZ

        System.out.println(sb.indexOf("a")); // 1

        System.out.println(sb); // Java candir

    }
}
