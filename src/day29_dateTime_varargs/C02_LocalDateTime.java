package day29_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); // 2024-08-08T19:32:23.127351

        LocalDateTime dateTimeAnkara = LocalDateTime.now(ZoneId.of("Turkey"));
        System.out.println(dateTimeAnkara);

        LocalDateTime dateTimeUsaNewyork = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(dateTimeUsaNewyork); // 2024-08-08T13:36:56.706510






    }
}
