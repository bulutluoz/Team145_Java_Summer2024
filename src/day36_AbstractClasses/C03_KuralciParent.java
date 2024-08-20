package day36_AbstractClasses;







public abstract class C03_KuralciParent {

    /*
        Java'da parent class olmasi planlanan bir class olusturuldugunda
        Parent class kendisini parent edinecek child class'larin
        mutlaka override etmesini istedigi method'lari BELIRLEYEBILIR

        1- Oncelikle kural koyabilmek icin
           Kural koyan bir class oldugunuzu DEKLARE etmelisiniz
           Bu deklarasyonu yapmak icin
           class'i ABSTRACT olarak tanimlariz

         2- Child class'larin MUTLAKA override etmesini istediginiz method'lari
            abstract method olarak olustururuz

         3- Child class'larin istedigi gibi kullanmasina izin verdiginiz method'lari
            concrete method olarak olustururuz

            Concrete method'lar icin deklarasyona concrete yazilmaz
            abstract yazmiyorsa method concrete'dir
            bugune kadar olusturdugumuz tum method'lar concrete method'lardi.

     */

    public void method1(){
        // bu method concrete oldugu icin
        // child class'lar isterlerse bu method'u override eder
        // isterlerse override etmeden direk parent class'dan kullanirlar
    }

    public abstract void method2();

    // Abstract methods cannot have a body
    // abstract method'lar normal kullandigimiz method'lar gibi degildir
    // bu method'u soyle tercume edebiliriz :
    // C03 class'ini parent edinen her class MUTLAKA method2(){} bulundurmalidir

    public abstract int method3();
    // C03 class'ini parent edinen her class MUTLAKA
    // int bir deger donduren method3(){} bulundurmalidir
    public abstract String method4();

}
