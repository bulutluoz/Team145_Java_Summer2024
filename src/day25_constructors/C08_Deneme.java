package day25_constructors;

public class C08_Deneme {
    /*
        Syntax acisindan constructor ve method'lar birbirine benzer
        isim(); Java method call olarak kabul eder

        EGER bir class'da constructor Call yapmak istersek
        this(ilgili parametreler) kullaniriz

        this. class level'daki variable'lari kullanabilmek icin

     */
    int sayi = 20;
    int yas = 40;

    C08_Deneme(){ // parametresiz constructor

        this("a");   // constructor call
                        // Call to 'this()' must be first statement in constructor body
                        // constructor call ilk satirda yazilmak zorundadir
                        // bu sebeple de ard arda 2 constructor call yapilamaz


    }

    C08_Deneme(String str){ // parametreli constructor

        C08_Deneme(); // method Call

    }

    void C08_Deneme(){ // parametresiz method cunku return type var

        C08_Deneme(5); // Method call

    }

    int C08_Deneme(int number){ // parametreli method return type var

        return number*number;
    }


}
