package day31_accessModifier_Encapsulation;

public class GenelMudur {

    public static void main(String[] args) {

        // Pazarlama.toplamSatisTutari;
        // 'toplamSatisTutari' has private access in 'day31_accessModifier_Encapsulation.Pazarlama'

        Pazarlama pazarlama = new Pazarlama();

        pazarlama.setSatisTutari(60);
        pazarlama.setSatisTutari(100);


        System.out.println(pazarlama.getToplamSatisTutari()); // 160
    }
}
