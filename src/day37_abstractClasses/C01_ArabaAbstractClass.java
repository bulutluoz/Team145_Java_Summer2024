package day37_abstractClasses;

public abstract class C01_ArabaAbstractClass {

    // bir class olusturalim
    // bu class arabalarin barindirmasi gereken zorunlu parcalari
    // ve istege bagli olarak bulundurmasini istedigimiz ozellikleri belirlesin

    // klima ==> zorunlu olmamali, concrete method
    public void klima(){
        System.out.println("Arabalar isterlerse klimali olabilirler");
    }

    // motor
    public abstract void motor(); // zorunlu OLMALI, abstract method olusturmali
    // her arabanin motoru farkli olabilir
    // AMMA mutlaka motoru olmalidir

    // sase ==> zorunlu
    public abstract void sase();

    // sunroof ==> zorunlu degil, cocrete method

    public void sunroof(){
        System.out.println("Arabalar isterlerse sunroof barindirabilir");
    }


    // child class'lar olusturulduktan sonra
    // araba class'ina 2 method daha eklemek gerekti

    // gosterge ==> zorunlu abstract method
    public abstract void gosterge();

    // deri kaplama koltuk ==> zorunlu degil, concrete method

    public void deriKoltuk(){
        System.out.println("Arabalar isterlerse deri koltuk kullanabilir");
    }


}
