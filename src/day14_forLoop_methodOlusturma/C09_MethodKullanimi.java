package day14_forLoop_methodOlusturma;

public class C09_MethodKullanimi {

    public static void main(String[] args) {

        // kullanicidan bir sayi isteyin

        // sayinin asal olup olmadigini yazdirin

        // sayiyi tam bolen sayilarin listesini yazdirin

        // sayinin faktoryel degerini hesaplayin


        String str = "java candir";

        // contains method'u kullanmadan str'da a harfi varsa true, yoksa false yazdirin

        boolean aVarMi = false;

        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i) == 'a'){
                aVarMi = true;
            }
        }

        System.out.println(aVarMi);


        // yukardaki kodu anlamak mi daha kolay yoksa asagidaki satiri mi

        System.out.println(str.contains("a"));

        str = str.toUpperCase();


        str.charAt(5);

    }
}
