package day18_scope;

public class C01_LocalVariables {
    /*
        1- Local variable bir method veya kod blogunun icinde olusturulan variable'dir
           ve scope'u (erisilebildigi yer) olusturuldugu kod blogudur

        2- Local variable'lar deger atamadan olusturulabilir
           ANCAKKK deger atamasi yapilmadan kullanilamaz

        3- bir method'da parametre olarak yazilan variable'lar da local variable'dir
           parametre olan local variable'lara deger atamasi method call ile yapilmis olur

        4- Her ne kadar bir method'un icinde olusturulsa da
           loop'lar da basli basina kod blogudur
           ve loop icinde olusturulan bir variable, loop disinda kullanilamaz
     */

    public static void main(String[] args) {

        int sayi = 10;
        // System.out.println(str);

        String s1;
        int a;

        // System.out.println(s1);
        // a++;

        a= 20;
        System.out.println(a);

        method1(6);

        for (int i = 0; i <=10 ; i++) {

            int b = 3;
            System.out.println(i);
            System.out.println(b);
            System.out.println(a);
        }

        //System.out.println(i);
        //System.out.println(b);

    }

    public static void method1( int number  ){
        // System.out.println(sayi);
        String str = "java candir";
    }
}
