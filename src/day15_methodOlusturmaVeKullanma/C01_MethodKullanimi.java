package day15_methodOlusturmaVeKullanma;

public class C01_MethodKullanimi {

    public static void main(String[] args) {

        String str = "Java Candir";

        str.toUpperCase(); // kapici ekmegi aldi geldi, ama biz ondan almadik


        System.out.println(str.toLowerCase()); // java candir
        // kapici ekmegi getirdi ben de hemen yedim


        String yeniStr = str.toUpperCase();
        // kapici ekmegi getirdi, ben de daha sonra yemek uzere ekmek kutusuna koydum
        // bundan sonra istersem ekmegi yer karnimi doyururum
        // istersem ekmegi baskasina veririm



    }
}
