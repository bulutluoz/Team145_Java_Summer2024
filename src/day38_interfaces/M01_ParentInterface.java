package day38_interfaces;

public interface M01_ParentInterface {

    void method1();
    void method2();
    int method3();
    String method4();

    int method5();

    /*
        interface'e sonradan bir abstract method eklenirse
        daha onceden bu interface'i implement etmis olan TUM CLASS'larin
        eklenen yeni method'u implement etmesi gerekir

        ANCAKKK bu yillardir calisilan projelerde sorun olabilir
        cunku bir interface'i yuzlerce class implement etmis olabilir
        hepsini dsegistirmek mumkun olmayabilir
        veya yan etkileri olabilir

        Java bu konuda developer'larin talepleri sonucunda
        Java8 ile bir ISTISNA getirmistir

        EGER bir interface'e sonradan eklenen bir method'un
        child class'lar tarafindan implement edilmesini
        ZORUNLU OLMAKTAN cikarmak isterseniz
        olusturulan yeni method'u DEFAULT veya STATIC olarak isaretleyebilirsiniz
     */

    public default void method6(){
        System.out.println("default method calisti");
    }

    public static void method7(){
        System.out.println("static method calisti");
    }

}
