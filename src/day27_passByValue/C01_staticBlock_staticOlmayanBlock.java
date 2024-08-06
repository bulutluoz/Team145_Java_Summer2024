package day27_passByValue;

public class C01_staticBlock_staticOlmayanBlock {
    /*
        static bloklar ve static olmayan bloklarin calismasi icin cagirmaya gerek yoktur
        class calismaya baslar baslamaz once STATIC BLOCK calisir
        ve eger varsa class'in calismasi icin gerekli olan ON AYARLARI yapar

        constructor calismadan hemen once
        class'da varsa static olmayan block calisir
        ve eger varsa OBJE olusturulmadan once yapilmasi gereken ON AYARLARI yapar
     */

    C01_staticBlock_staticOlmayanBlock(){

        System.out.println("Constructor calisti");
    }

    static {
        System.out.println("class on ayarlari yapildi");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        C01_staticBlock_staticOlmayanBlock obj1 = new C01_staticBlock_staticOlmayanBlock();
        C01_staticBlock_staticOlmayanBlock obj2 = new C01_staticBlock_staticOlmayanBlock();
    }

     {
        System.out.println("obje icin gerekli ayarlar yapildi");
    }

    public static void method1(){
        System.out.println("method1 calisti");
    }
}
