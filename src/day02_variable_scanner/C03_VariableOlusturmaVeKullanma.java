package day02_variable_scanner;

public class C03_VariableOlusturmaVeKullanma {

    public static void main(String[] args) {

        int a = 10;

        a = 3 * a + 4 ;

        System.out.println(a); // 34

        // 2 * a = a + 5 ; // Variable expected
        // Java'da atama isleminde ( = ) sol tarafta SADECE variable olur
        // sol tarafta matematiksel islem veya variable disinda herhangi bir sey bulunamaz


        // a'nin degerini yazarken yaninda bir aciklama da olmasini istiyorsak
        // aciklamayi  "" icinde yazip + a  seklinde yazdirabiliriz

        System.out.println( "a'nin yeni degeri : " + a ); // a'nin yeni degeri : 34

        a = a + 8 ;

        System.out.println("a'nin en son degeri : + a "); // a'nin en son degeri : + a

        System.out.println("a'nin en son degeri : " + a ); // a'nin en son degeri : 42
    }
}
