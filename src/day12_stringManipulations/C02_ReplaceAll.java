package day12_stringManipulations;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        // verilen bir metindeki coklu space'leri tek space haline getirip,
        // sayilari silip, space disindaki ozel karakterleri yok edin

        // J12$%av)(a    C?and&^ir ==> Java Candir

        String str = "Ja*(vada,   hat565a     ol_ma#@$z";

        // verilen bir metindeki coklu space'leri tek space haline getirip,
        str = str.replaceAll("\\s+"," ");

        // sayilari silip,
        str = str.replaceAll("\\d","");

        // space disindaki ozel karakterleri yok edin

        // str = str.replaceAll("\\W","");
        // 21.satirdaki kod calisinda ozel karakterler ile birlikte space de gidiyor
        // once space'i korumaya almaliyiz
        // sayilari temizledigimiz icin space yerine herhangi bir sayiyi koyarsak
        // sonrasinda space'in yerini bulmamiz kolay olur
        str = str.replaceAll("\\s","5");

        // space koruma altina alindigi icin geriye kalan ozel karakterleri yok edebiliriz
        str = str.replaceAll("\\W","");

        // artik korumaya alip yerine 5 yazdigimiz space'i yerine dondurelim
        str = str.replaceAll("5"," ");

        // W ozel karakterleri yok eder ama _ kalir, bunun icin ekstra bir satir yazalim
        str= str.replace("_","");

        System.out.println(str);

    }
}
