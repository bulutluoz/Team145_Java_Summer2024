package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_IfIleCozulemeyenDurumlar {

    public static void main(String[] args) {

        /*
            Java bir hata ile karsilastiginda
            o hatanin kod yazan kisi tarafindan ongorulup,
            kendisine yol gosterilmis olmasini bekler

            if-else ile riskli durumu kontrol altina alma (HANDLE) mumkunse
            if-else kullanilabilir.

            if-else kullaninca java tehlikeli islemi yapmadan kontrol edip
            tehlike soz konusu ise
            o islemi HIC YAPTIRMAYIZ

            Java'da tum riskleri if-else ile handle edemeyiz
            Java exception'lari kontrol altina alabilmemiz icin
            try-catch bloklari hazirlamistir.

            try-catch temel olarak 3 bolumden olusur
            1- try blogu : riskli kodlarin konuldugu bolum
                           (bu kodlari calistirmaya gayret et)

            2-  catch ( beklenenException e  ) : beklenen exception durumu ortaya cikarsa
                            hatanin yakalanip kaydedilecegi yer
                            (endise ettigimiz exception olusursa, panik yapma
                            asagida sana verdigim kodlari calistirip, yoluna devam et)

         */

        // kullanicidan 2 tamsayi alip
        // verilen iki tamsayiyi birbirine bolup
        // sonucun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);


        int sayi1 = 0;
        int sayi2 = 0;
        try {

            System.out.println("Lutfen bolunecek sayiyi giriniz...");
            sayi1 = scanner.nextInt();

            System.out.println("Lutfen bolecek sayiyi giriniz...");
            sayi2 = scanner.nextInt();


        } catch (InputMismatchException e) {

            System.out.println("Sadece tamsayi girisi yapilabilir");

        }


        if ( sayi2 == 0 ){
            System.out.println("Bolen sayi 0 OLAMAZ");
        }else{
            System.out.println( sayi1 / sayi2 );
        }

    }
}
