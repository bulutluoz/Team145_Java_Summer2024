package day29_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        // 12 mart 2005'de dogan birisi bugun kac yasindadir

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(2005,3,12);

        Period yas = Period.between(dogumGunu,bugun);

        System.out.println(yas); // P19Y4M27D
        System.out.println(yas.getYears()); // 19
    }
}
