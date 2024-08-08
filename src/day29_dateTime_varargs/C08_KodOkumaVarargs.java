package day29_dateTime_varargs;

public class C08_KodOkumaVarargs {

    public static void main(String[] args) {

        int a = islemYap(2,"Ali","Veli","Suleyman") ;
        int b = islemYap(1,"Murat","Furkan");

        System.out.println(a*b); //
    }


    public static  int islemYap(int x , String... y){

        return y[x].length();

    }
}
