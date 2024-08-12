package day31_accessModifier_Encapsulation;

public class PazarlamaMuduru {

    public static void main(String[] args) {

        Pazarlama pazarlama = new Pazarlama();
        pazarlama.setSatisTutari(40);
        pazarlama.setSatisTutari(30);

        System.out.println(pazarlama.getToplamSatisTutari()); // 70
    }
}
