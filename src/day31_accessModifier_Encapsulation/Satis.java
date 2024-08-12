package day31_accessModifier_Encapsulation;

public class Satis {

    public static void main(String[] args) {

        // Pazarlama.satisTutari = 50; // deger atamamiz goreve uygun

        // System.out.println(Pazarlama.satisTutari); // goreve uygun degil

        Pazarlama pazarlama = new Pazarlama();

        pazarlama.setSatisTutari(80);

        pazarlama.setSatisTutari(100);

        pazarlama.setSatisTutari(200);

        pazarlama.setSatisTutari(300);

        System.out.println(pazarlama.getToplamSatisTutari()); // 680


    }
}
