package day33_ConstructorCall;

public class C10_Child extends C09_Parent{

    /*
        1- Java'da bir variable kullanildiginda
           Java variable'in degerini bulmak icin
           sirasiyla
           - icinde oldugu scope
           - icinde oldugu class
           - parent class(lar)' lara bakar
           ve ILK BULDUGUNU kullanir

          2- eger variable veya method kullanilirken
             basina this. konursa
             icinde bulundugu scope'u atlayip
             ILK OLARAK class level'a bakar

          3- eger variable veya method kullanilirken
             basina super. konursa
             icinde bulundugu scope'u ve icinde bulundugu class'i atlayip
             ILK OLARAK parent class'a bakar

           ONEMLI NOT :
           Java variable'in degerini aramak icin
           basladigi yerden extends kullanmayan parent class'a kadar gider
           EGER aramaya basladigi yerden, gittgi son parent'a kadar
           aradigini bulamazsa CTE verir
           AMMA asla basladigi yerden geriye dogru aramaz
     */

    String str = "Child class";
    String t = "Total";
    String k = "Kalem";

    public static void main(String[] args) {

        C10_Child child = new C10_Child();
        child.method1();
        // variablelari takip ederken static engelini asmak icin
        // obje olusturup, obje ile static olmayan method'u cagirdik
    }

    public void method1(){

        String str = "Method";
        String  t = "Foto";
        String z = "Zil";

        System.out.println("s : " + s); // Hava
        System.out.println("s this: " + this.s); // Hava
        System.out.println("s super: " + super.s); // Hava


        System.out.println("k : " + k); // Kalem
        System.out.println("k this: " + this.k); // Kalem
        // System.out.println("k super: " + super.k); // CTE super (parent) class'da k yok

        System.out.println("z : " + z); // Zil
        // System.out.println("z this: " + this.z); // CTE class level'da z yok
        // System.out.println("z super: " + super.z); // CTE super (parent) class'da z yok

        System.out.println("str : " + str); // Method
        System.out.println("str this: " + this.str); // Child class
        System.out.println("str super: " + super.str); // Java

        System.out.println("t : " + t); // Foto
        System.out.println("t this: " + this.t); // Total
        // System.out.println("t super: " + super.t); // CTE



    }
}
