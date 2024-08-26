package day40_exceptions;

import java.util.Scanner;

public class C04_CatchBlogundakiEninGorevi {

    public static void main(String[] args) {
        // Kullanicidan bir tam sayi isteyin
        // verilen tamsayiyi index olarak kabul edip
        // Asagida verilen String ve array'de o index'de olan elementleri yazdirin

        String str = "Java candir";
        int[] arr = {1,2,4,5,6,3,4,5,7,8,9,2,3,4,0};

        /*
            Bu soruda 3 adet exception olusma riski var

            InputMissmatchException
            StringIndexOutOfBoundsException
            ArrayIndexOutOfBoundsException

            Bu soruda InputMissmatchException'i dikkate almayip
            kalan 2 exception'i nasil kontrol altina alabilecegimizi inceleyelim
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen index olarak kullanmak icin bir tamsayi giriniz...");
        int girilenIndex = scanner.nextInt();

        // Bir kodda birden fazla exception riski varsa
        // oncelikle olusma riski bulunan exception'lari inceleyip
        // aralarinda parent-child iliskisi var mi bakilir
        // parent child iliskisi yoksa 3 farkli sekilde kontrol altina alabiliriz


        // 3.yontem : Her iki exception'i KAPSAYAN 1 try - catch yapabiliriz

        try {

            System.out.println(str.charAt(girilenIndex));
            System.out.println(arr[girilenIndex]);

        } catch (Exception e) {
            /*
                catch blogunun amaci olusan exception'i yakalayip
                kontrol altina almaktir

                catch blogu yakaladiktan sonra NE YAPILACAGI
                kod yazan kisiye kalir

                Ornegin ; index olarak sinirlar icerisinde bir deger atayabilirsiniz
                          istenen hata mesajini yazdirip yolunuza hic hata olmamis gibi devam edebilirsiniz
                          hatanin daha iyi anlasilmasi icin hatayi aciklar ve sonra kodun durmasini saglayabilirsiniz

             */
            // System.out.println("Verilen index String'in veya Array'in sinirlari disinda");
            // System.out.println(e.getMessage()); // String index out of range: 20
            // System.out.println(e.getCause()); // null
            e.printStackTrace();
            /*
                exception'daki bilgilerin tamamini yazdirip normal yoluna devam eder
                java.lang.StringIndexOutOfBoundsException: String index out of range: 20
                at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
                at java.base/java.lang.String.charAt(String.java:693)
                at day40_exceptions.C04_CatchBlogundakiEninGorevi.main(C04_CatchBlogundakiEninGorevi.java:40)
             */
        }
    }
}
