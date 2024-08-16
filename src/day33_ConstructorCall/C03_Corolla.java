package day33_ConstructorCall;

public class C03_Corolla  extends C02_Toyota{

    // Corolla class'i Toyota class'ina extend ettiginden
    // Corolla class'indaki ve onun parent'i olan Araba class'indaki
    // TUM OZELLIKLERI baslangic olarak sahiptir

    // parent class'lardaki bilgilerden guncellemek istediklerimiz

    public String model = "Corolla";
    public String sanzuman = "Multidrive";
    public String lastik = "Turkiyede uretilen pirelli lastik";


    // parent class'larda olmayan
    // Corolla class'ina ozel eklemek istedigimiz ozellikler

    public String uretimYeri = "Turkiye";
    public String fren = "Abs";
    public String aku = "Inci";

}
