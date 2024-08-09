package day30_StringBuilder_accessModifier;

public class C02_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java'da ne numaralar var");

        // sb'yi terse cevirin

        sb.reverse();

        System.out.println(sb); // rav ralaramun en ad'avaJ

        // sb'yi yeniden terse cevirip, duzgun haline dondurebiliriz
        sb.reverse();

        System.out.println(sb); // Java'da ne numaralar var

        // Ismi ayni olsa da method'larin farkli data turlerindeki
        // uygulama bicimleri farkli olabilir

        String str = "Ahmet Hoca";
        sb.replace(0,4,str);

        System.out.println(sb); // Ahmet Hoca'da ne numaralar var

        sb.delete(0,14);
        System.out.println(sb); // ne numaralar var

        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb); // ne numaralar va

        sb.insert(0,"Bizde ");
        System.out.println(sb); // Bizde ne numaralar va

        sb.insert(0,str,0,1);

        System.out.println(sb); // ABizde ne numaralar va





    }
}
