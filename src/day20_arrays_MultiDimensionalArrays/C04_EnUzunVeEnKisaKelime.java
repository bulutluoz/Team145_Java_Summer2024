package day20_arrays_MultiDimensionalArrays;

public class C04_EnUzunVeEnKisaKelime {
    // Verilen String bir array’deki en uzun
    // ve en kisa kelimeleri yazdiran bir method olusturun.

    public static void main(String[] args) {


        String[] isimler = {"Cem Bakir", "Pinar Cay", "Yusuf Ucar", "Ahmet Emin Genc", "Furkan Bahar","Ali Can"};

        enKisaVeEnUzunIsmiYazdir(isimler);

    }

    public static void enKisaVeEnUzunIsmiYazdir( String[] isimler){
        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].length() > enUzunKelime.length()){

                enUzunKelime = isimler[i];
            }

            if (isimler[i].length() < enKisaKelime.length()){

                enKisaKelime = isimler[i];
            }

        }


        System.out.println("En uzun isim : " + enUzunKelime);
        System.out.println("En kisa isim : " + enKisaKelime);
    }
}
