package day35_Overriding_Pollymorphism;

public class C03_Child extends C02_Parent{

   public void method1(){
      //  Overriding olmasi icin signature ayni olmalidir
      //  signature farkli ise o method'lar farkli method'lar olacaktir
   }

    @Override
    public void method2() {
       // Java'daki notasyonlar
       // kendine ozgu bilgiler tasiyan ozel yapilardir
       // @Override notasyonu parent class'daki overriden method'u surekli kontrol eder
       // ve override etmeye engel olacak bir degisiklik yapilirsa
       // CTE verir

    }

    public void method3(){
        // @Override notasyonu kullanilmazsa
        // overridden method degistirilse de
        // method3 yoluna bagimsiz bir method olarak devam eder

    }

    public int method46(){
       // 'method4()' cannot override 'method4()' in 'C02_Parent';
       // overridden method is final

       return 5;
    }

    public static void method5(){
       // static method'lar override edilemez
       // Java CTE vermedi ama Override isareti de cikmadi
       // Java bu method'lari override method'lar olarak degil
       // birbirinden farkli method'lar olarak gorur
    }


    public void method6(){
       // parent class'daki method6 private oldugundan
       // child class onu goremez
       // dolayisiyla child class'daki method6 override edemez
    }

    protected void method7(){
       // parent class'daki overridden method'un  acc.mod.'i protected
       // child class'daki overriding method'un access modifier'i
       // parent class'daki ile ayni veya daha genis olabilir
       // daha dar bir access modifier olmaz
       //  protected, public ==> olabilir
       //  private, default access mod. ==> OLAMAZ
    }

    void method8(){
       // overridden method'un access mod. ==> default acces mod.
       // overriding method'un access modifier'i
       // default acc.mod, protected veya public ==> olabilir
       // private ==> olamaz
    }

    public short method9(){
       // overridden method'un return type'i
       // void veya primitive ise
       // overriding method'un return type'i AYNI olmaliddir
        return 9;
    }


    public Integer method10(){
       // Eger overridden method'un return type'i non-primitive ise
       // overriding method'un return type'i
       // YA ayni olmalidir
       // ya da overridden method'un return type'inin child class'i olmalidir
       // buna Covariant denir

       return null;
    }

    public void method11(){
       super.method11();
        // overridden ve overriding method'larin ikisi birden calismaz
        // ikisini de calistirmak isterseniz
        // child class'da super. kullanabilirsiniz
    }











}
