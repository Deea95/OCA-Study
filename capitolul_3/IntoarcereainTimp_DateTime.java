package capitolul_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class IntoarcereainTimp_DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.AUGUST,25);
        LocalTime time = LocalTime.of(21,50);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        System.out.println(dateTime); // 2021-08-25T21:50
        dateTime = dateTime.minusDays(7);
        System.out.println(dateTime); // 2021-08-18T21:50
        dateTime = dateTime.minusHours(7);
        System.out.println(dateTime); // 2021-08-18T14:50
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2021-08-18T14:49:30
    }
}
