package day38_interfaces;

public interface I01_Interface {
    /*
        biz interface icinde abstract yazmadan bir method olustursak da
        Java body eklememize izin vermiyor ve
        Interface abstract methods cannot have body
     */

    // public void method1(){

    // }


        /*
        biz interface icinde bir method olusturdugumuzda
        public ve abstract keywor'lerini
        YAZSAK da , YAZMASAK da farketmez
        Java tum methodlari public ve abstract olarak kabul eder
        asagidaki method'larin hepsi public ve abstract'tir
     */

    public abstract void method2();
    abstract void method3();
    public void method4();
    void method5();

}
