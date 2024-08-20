package day36_AbstractClasses;

public class C02_KralChildClass extends C01_KuralciOlmayanParent{

    /*
        Eger normal class yapisi ve inheritance kullanirsak
        Child class KRAL olur
        - parent class'daki tum variable ve method'lari kullanabilir
        - isterse parent class'daki method'lari override edebilir
        - isterse parent class'da olmayan yeni variable veya
          method'lar ekleyebilir

          Java PARENT class'lara
          kendilerini parent edinecek child class'larin
          MUTLAKA OVERRIDE ETMESI GEREKEN METHOD'lari belirleme imkani tanimistir

     */

    public static void main(String[] args) {

        C02_KralChildClass child = new C02_KralChildClass();
        child.method();
    }

    public void method(){

        System.out.println(isim); // Ali
        method1(); // Method1 calisti
        method2(); // Child class method2

    }

    public void method2(){
        System.out.println("Child class method2");
    }

    public void method4(){
        System.out.println("Child class method4");
    }
}
