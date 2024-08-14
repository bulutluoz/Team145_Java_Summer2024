package day33_ConstructorCall;

public class C08_OrnekClas extends C01_Araba{

    C08_OrnekClas(){
        // super();
    }

    C08_OrnekClas(int sayi){
        // super();
    }

    C08_OrnekClas(String s){
        this();
        // ilk satirda constructorCall oldugundan
        // java bu constructor'a super(); EKLEMEZ
    }

    C08_OrnekClas(boolean bl){
        // super("w"); extends ettigimiz Araba class'inda String parametresi olan cons. yok, CTE
        super();
        // ilk satirda constructorCall oldugundan
        // java bu constructor'a super(); EKLEMEZ
    }



}
