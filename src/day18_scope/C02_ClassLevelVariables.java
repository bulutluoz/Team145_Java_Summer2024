package day18_scope;

import java.util.Scanner;

public class C02_ClassLevelVariables {
    /*
        1- Class'in icinde ama method'larin disinda
           olusturulan variable'lara Class Level Variable denir
        2- Class variables class icerisnde herhangi bir yerde olabilir ancak
           kullanim kolayligi acisindan
           Class'in en ust tarafinda olusturulurlar
        3- Class level variable'lar,
           Local variable'lardan farkli olarak static olarak da isaretlenebilir
        4- Class level variable'lardan
           static olarak isaretlenenlere ==> static variables
           static olarak isaretlenmeyenlere ise ==> instance variables denir
        5- Class level variable'larin scope'u BUTUN CLASS'in
           yani class'in her yerinden kullanilabilirler
        6- ANCAKK instance ve static variable'lar
           her yerden DIREKT olarak KULLANILAMAZLAR
           direkt erisim icin anahtar kelime "static" dir
        7- static keyword'e sahip variable'lar heryerden kullanilabilir
           (method'un static olmasina veya olmamasina bakmayiz)

           intstance (static keyword'e sahip olmayan) variable'lar
           her yerden direkt kullanilamazlar
           static olmayan method'larda instance variable'lar direkt kullanilabilir
           ANCAK static method'larda DIREKT KULLANILAMAZ, obje olusturulmasi gerekir

        8- Hem static variable'lar hem de instance variable'lar
           deger atanmadan olusturulabilir
           ve deger atanmadan kullanilabilir
           Eger biz deger atamadiysak
           Java default olarak (varsayilan deger)
           char ==> hiclik
           boolean ==> false
           sayisal primitive'ler ==> 0
           non-primitive ==> null  degerlerini atar

     */

    int sayi1 = 10;
    String str1 = "Ali";
    boolean bl1;
    char chr1;
    String str2;
    double sayi2;

    static int sayi3= 20;
    static String str3 = "Veli";
    static boolean bl2;
    static char chr2;
    static String str4;
    static  double sayi4;

    public static void main(String[] args) {
        // static int sayi = 20; // Modifier 'static' not allowed here
        System.out.println("main method sayi3 : "+ sayi3); // 20
        //System.out.println(sayi1);
        System.out.println("main method str3 : "+ str3); // Veli
        System.out.println("main method bl2 : "+ bl2); // false
        System.out.println("main method chr2 : "+ chr2); // hiclik
        System.out.println("main method str4 : "+ str4); // null
        System.out.println("main method sayi4 : "+ sayi4); // 0.0

        // bir scanner objesi olusturun
        Scanner scanner = new Scanner(System.in);
        // Java'da genel obje olusturma syntax'i aynidir
        // Eger icinde bulundugumuz C02_ClassLevelVariables class'indan bir obje olusturmak istersek

        C02_ClassLevelVariables obj = new C02_ClassLevelVariables();
        obj.sOlmayanMethod();

        System.out.println(obj.bl1); // false

    }

    public static void sMethod(){
        System.out.println(sayi3);
        //System.out.println(sayi1);
    }


    public void sOlmayanMethod(){
        System.out.println("sOlmayanMethod sayi3 : "+ sayi3); // 20
        System.out.println("sOlmayanMethod sayi1 : " + sayi1); // 10
        System.out.println("sOlmayanMethod str1 : " + str1); // Ali
        System.out.println("sOlmayanMethod bl1 : " + bl1); // false
        System.out.println("sOlmayanMethod chr1 : " + chr1); // hiclik
        System.out.println("sOlmayanMethod str2 : " + str2); // null
        System.out.println("sOlmayanMethod sayi2 : " + sayi2); // 0.0

    }




}
