package day28_immutableClasses_dateTime;

import java.time.LocalTime;

public class C03_LocalTime {

    public static void main(String[] args) {
        /*
            LocalTime objesi olusturuldugu satir calistigi anda
            o anki zamani alip kaydeden bir variable'dir
            sayac veya kronometre gibi degisen bir deger degildir

            EGER farkli 2 satirin calisma zamanlarini alip kaydetmek istersek
            bu satirlarda farkli 2 obje olusturabiliriz
         */

        LocalTime localTimeBaslangic = LocalTime.now();


        System.out.println(localTimeBaslangic); // 21:26:12.368989

        for (int i = 0; i <500000000 ; i++) {

            int sayi = i;
            String str = i + "a" ;
        }

        LocalTime localTimeBitis = LocalTime.now();
        System.out.println(localTimeBitis); // 21:26:12.368989

        LocalTime anlikZaman = LocalTime.now();

        // zamani 21:26 formatinda yazdirin
        // get() 'lari zamanin istedigimiz bolumunu bize getirir
        System.out.println(
               anlikZaman.getHour() +
               ":" +
               anlikZaman.getMinute()
        ); // 21:37

        // anlik zamandaki bazi bilesenleri kendiniz atamak isterseniz with()

        System.out.println(anlikZaman.withMinute(0)); // 21:00:12.821552

        System.out.println(anlikZaman.withSecond(0).withNano(0)); // 21:40

        // anlik zamanin belirli bir sure ilerisine veya geriye gitmek isterseniz
        // plus() veya minus()

        System.out.println(anlikZaman.plusHours(89).plusMinutes(24)); // 15:06:01.344008

        System.out.println(anlikZaman.minusMinutes(1000).minusSeconds(1000));
        // 04:46:02.122978


        // gunun baslangicindan bu ana kadar gecen nanosaniye veya saniye degerini bulmak icin
        System.out.println(anlikZaman.toNanoOfDay()); // 78256422664000
        System.out.println(anlikZaman.toSecondOfDay()); // 78256

        // bu iki method bir islemin suresini bulmak icin kullanilabilir
        // yukardaki loop'un kac saniye surdugunu bulmak istersek
        System.out.println(localTimeBitis.toSecondOfDay() - localTimeBaslangic.toSecondOfDay()); // 6
        // yukardaki loop'un kac nanosaniye surdugunu bulmak istersek
        System.out.println(localTimeBitis.toNanoOfDay() - localTimeBaslangic.toNanoOfDay());
        // 5634529000

        // iki zamanin birbirinden once veya sonra oldugunu sorgulamak icin
        System.out.println(anlikZaman.isAfter(localTimeBaslangic)); // true
        System.out.println(anlikZaman.isBefore(localTimeBaslangic)); // false




    }
}
