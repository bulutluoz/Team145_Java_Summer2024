package day29_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_TarihVeZamaniIstenenFormataGetirme {

    public static void main(String[] args) {

        // Tarih ve zamani istediginiz formata getirebilmek icin
        // ONCELIKLE istenen formati Java'ya tanitmaliyiz
        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1); // 2024-08-08T20:03:44.139522

        LocalDateTime dateTime2 = LocalDateTime.of(2021,9,12,21,24,12);
        System.out.println(dateTime2); // 2021-09-12T21:24:12


        // 8 August 2024, 21:35
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d MMMM yyyy, HH:mm");

        System.out.println(dateTime1.format(format1)); // 8 August 2024, 20:06
        System.out.println(dateTime2.format(format1)); // 12 September 2021, 21:24


        // 08 / 08 / 24
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd / MM / yy");

        System.out.println(dateTime1.format(format2)); //   08 / 08 / 24
        System.out.println(dateTime1); // 2024-08-08T20:10:12.330161
        System.out.println(dateTime2.format(format2)); // 12 / 09 / 21

        // 8/8/2024 Thu
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("d/M/yyyy EEE");

        System.out.println(dateTime1.format(format3)); // 8/8/2024 Thu
        System.out.println(dateTime2.format(format3)); // 12/9/2021 Sun

        // 2024'un 221.gunu saat 9:35 pm
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("yyyy DDD h:mm a");

        System.out.println(dateTime1.format(format4)); // 2024 221 8:16 PM
        System.out.println(dateTime2.format(format4)); // 2021 255 9:24 PM

        // 09-35 pm
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("hh-mm a");

        System.out.println(dateTime1.format(format5)); // 08-19 PM
        System.out.println(dateTime2.format(format5)); // 09-24 PM


         /*
            Eger tarih ve saati istediginiz bir form'da yazdirmak isterseniz
            once o formati olusturmalisiniz
            format olusturduktan sonra ldt'yi istenen formatla yazdirabilirsiniz

            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */




    }
}
