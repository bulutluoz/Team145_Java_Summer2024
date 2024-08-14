package day33_ConstructorCall;

public class C02_Toyota extends C01_Araba{

    // Toyota Araba class'ina extends oldugu icin
    // Baslangic itibariyle Araba class'indaki TUM VARIABLE'lara sahiptir

    // Toyota class'i istedigi variable'lari guncelleyebilir
    String marka = "Toyota";
    String motor = "Toyata araclar cevre duyarli kullanir";

    // Toyota class'i Araba class'inda olmayan
    // Ancak tum Toyota araclarin sahip oldugu
    // yeni variable'lar ekleyebilir

    String lastik = "Toyota pirelli lastik kullanir";
    String guvenlik = "Toyota guvenlik standardi uygulanir";
    String cekis = "Toyota araclar onden cekislidir";

}
