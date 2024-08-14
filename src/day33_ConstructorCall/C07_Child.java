package day33_ConstructorCall;

public class C07_Child extends C06_P {
    /*
        1- Extends keyword kullanan bir class'daki
           HER constructor'in ilk satirinda
           constructorCall olmak ZORUNDADIR

        2- Eger kodu yazanlar,
           constructor'in ilk satirina bir constructorCall yazmislarsa
           java yazilana uyar,
           Eger ilk satirda constructorCall yoksa
           Java default olarak super() koyar

        3- Constructor ister parametreli olsun
           isterse parametresiz olsun
           Java'nin default olarak koydugu
           constructor call PARAMETRESIZdir super();

        4- ilk satirda constructorCall olmak zorundadir
           ama bu call icinde oldugu class'dan ise this()
           parent class'dan ise super() kullanilir

        5- this() ve super() calisirken
           constructor call'da yazilan argument ile
           constructor'da kullanilan parametrenin
           uyumuna gore calisir

     */

    C07_Child(){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");
    }

    C07_Child(String s){
        super(5);
        System.out.println("C String parametreli constructor calisti");
    }

    C07_Child(int a){
        // gorunurde constructorCall yok
        // Java super() koyar
        System.out.println("C int parametreli constructor calisti");
    }

    public static void main(String[] args) {

        C07_Child child3 = new C07_Child("A");
        //GP int parametreli constructor calisti
        //GP String parametreli constructor calisti
        //P int parametreli constructor calisti
        //C String parametreli constructor calisti



        C07_Child child2 = new C07_Child();
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //P String parametreli constructor calisti
        //C parametresiz constructor calisti


        C07_Child child1  = new C07_Child(24);
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //C int parametreli constructor calisti
    }

}
