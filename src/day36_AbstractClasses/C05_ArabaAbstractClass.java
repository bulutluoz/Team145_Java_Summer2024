package day36_AbstractClasses;

public abstract class C05_ArabaAbstractClass {

    // bir class olusturalim
    // bu class arabalarin barindirmasi gereken zorunlu parcalari
    // ve istege bagli olarak bulundurmasini istedigi ozellikleri belirlesin

    // klima
    public void klima(){
        System.out.println("Arabalar isterlerse klimali olabilirler");
    }

    // motor

    public abstract void motor();
    // her arabanin motoru farkli olabilir
    // AMMA mutlaka motoru olmalidir
}
