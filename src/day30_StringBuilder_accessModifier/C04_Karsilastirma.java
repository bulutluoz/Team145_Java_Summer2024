package day30_StringBuilder_accessModifier;

public class C04_Karsilastirma {
    public int x;
    protected boolean bl;
    String a;
    private char chr;

    public static void main(String[] args) {

        String str = "Ali";
        StringBuilder sb1 = new StringBuilder("Ali");
        StringBuilder sb2 = new StringBuilder("Ali");

        // ayni metne sahip olan str, sb1 ve sb2'yi karsilastiralim


        //   ==

        // System.out.println(str == sb1); // Operator '==' cannot be applied to 'String', 'StringBuilder'

        System.out.println( sb1 == sb2); // false
        // Java bu karsilastirmaya itiraz etmez AMMA sonuc her zaman false'dur


       //  equals()

        System.out.println(str.equals(sb1));
        System.out.println(sb2.equals(str));
        // Java bu karsilastirmaya itiraz etmez AMMA sonuc her zaman false'dur

        System.out.println(sb1.equals(sb2));  // false
        // ikiside StringBuilde ve ikisinin de metni Ali

        // equals() SADECE bir durumda true verir
        System.out.println(sb1.equals(sb1)); // true


        // StringBuilder'larin metinsel esitligi compare() kontrol edilir
        // compareTo() ile 2 StringBuilder karsilastirildiginda sonuc 0 ise
        // bu iki StringBuilder metinsel olarak AYNI demektir
        // sonuc 0 degilse metinler ayni degil

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("Tava");
        StringBuilder sb5 = new StringBuilder("java");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("Tema");

        System.out.println(sb4.compareTo(sb3)); // 10  Tava <==> Java
        // farkli olan ilk karakter T == J ve T bir karakter 10 karakter ilerde

        System.out.println( sb3.compareTo(sb5)); // -32 Java <==> java
        // farkli olan ilk karakter J == j ve J bir karakter geride -32

        System.out.println(sb4.compareTo(sb6)); // -4 Tava <==> Tele
        // farkli olan ilk karakter a == e ve a bir karakter geride -4

        System.out.println(sb6.compareTo(sb7)); // -1 Tele <==> Tema
        // farkli olan ilk karakter l == m ve l bir karakter geride -1

        System.out.println(sb1.compareTo(sb2)); // 0  Ali <==> Ali




    }
}
