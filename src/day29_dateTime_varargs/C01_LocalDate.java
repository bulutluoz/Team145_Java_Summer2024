package day29_dateTime_varargs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class C01_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2024-08-08

        System.out.println(tarih.getDayOfYear()); // 221 (yilin 221.gunundeyiz)
        System.out.println(tarih.getMonth()); // AUGUST
        System.out.println(tarih.getMonthValue()); // 8
        System.out.println(tarih.getDayOfWeek()); // THURSDAY
        System.out.println(tarih.getChronology()); // ISO
        System.out.println(tarih.getEra()); // CE

        System.out.println(tarih.lengthOfMonth()); // 31

        System.out.println(tarih.plusYears(10).plusMonths(3).plusDays(5));
        // 2034-11-13
        System.out.println(tarih.minusYears(17).minusMonths(5).minusDays(9));
        // 2007-02-27

        System.out.println(tarih.withMonth(10)); // 2024-10-08

        System.out.println(tarih.isLeapYear()); // true

        // 1892 artik yil mi ?
        LocalDate yil1892 = LocalDate.of(1892,2,6);
        System.out.println(yil1892.isLeapYear()); // true


        LocalDate yil1900 = LocalDate.of(1900,1,4);
        System.out.println(yil1900.isLeapYear()); // false


        // dogum tarihleri verilen iki cocuktan hangisinin daha once dogdugunu bulun
        // 14 nisan 1992    18 nisan 1992

        LocalDate cocuk1  = LocalDate.of(1992,4,14);
        LocalDate cocuk2  = LocalDate.of(1992,4,18);

        if (cocuk1.isBefore(cocuk2)) System.out.println("Birinci cocuk daha buyuk");
        else if(cocuk1.isAfter(cocuk2)) System.out.println("Ikinci cocuk daha buyuk");
        else System.out.println("Cocuklar ayni gun dogmuslar, buyuk olan yok");

        System.out.println(tarih.hashCode()); // 2024-08-08 ==> 4145672
        // hashCode universite numaramiz gibidir
        // 020600164  ==> o universitedeki herkes bu numaranin hangi anlama geldigini bilir
        //                o universitedekiler disindaki insanlar icin bir anlam ifade etmez

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler.hashCode()); // 1

        isimler.add("Ali");
        System.out.println(isimler.hashCode()); // 65949

        isimler.add("Ayse");
        System.out.println(isimler.hashCode()); // 4100781




    }
}
