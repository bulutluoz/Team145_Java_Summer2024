package day28_immutableClasses_dateTime;

public class C02_StringPool {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");
        String str4 = "A" + "li";
        String s = "A";
        String t = "li";
        String str5 = s + t ;
        String r = "ali";
        String str6 = r.substring(0,1).toUpperCase()+ r.substring(1);



        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true

        System.out.println("===================");
        /*
            String'leri karsilastirmak icin == yerine equals() kullaniriz

            equals() sadece degerlere bakar
            == ise hem degerlere hem de referansa bakar

            Java'da String olusturmak icin ya direkt " " icinde deger atamasi yapariz
            veya baska bir variable ve method kullanarak olusturabiliriz

            EGER bir String " " deger atanarak olusturuluyorsa
            Java o String'i String Pool'a koyar
            VE EGER String Pool'da zaten ayni degere sahip bir baska String varsa
            yeni obje olusturmaz, var olan objeye ortak eder

            Ozetle soyle diyebiliriz

            == ile karsilastirilan String'lerin ikisi de havuzda ise ve metinleri ayni ise sonuc true
                                                havuzda olmayan varsa sonuc false

         */

        System.out.println(str1 == str2); // Ali <==> Ali  ==> true
        System.out.println(str1 == str3); // Ali <==> Ali  ==> false
        System.out.println(str1 == str4); // Ali <==> Ali  ==> true
        System.out.println(str1 == str5); // Ali <==> Ali  ==> false
        System.out.println(str1 == str6); // Ali <==> Ali  ==> false
        System.out.println(str1 == "Ali"); // Ali <==> Ali  ==> true
        System.out.println(str3 == str5); // Ali <==> Ali  ==> false

    }
}
