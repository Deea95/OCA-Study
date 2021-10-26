package capitolul_3;

import java.time.LocalDate;
import java.time.Month;

public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.AUGUST,25);
        System.out.println(date); // 2021-08-25
        date = date.plusDays(2);
        System.out.println(date); // 2021-08-27
        date = date.plusWeeks(2);
        System.out.println(date); // 2021-09-10
        date = date.plusMonths(2);
        System.out.println(date); // 2021-11-10
        date = date.plusYears(2);
        System.out.println(date); // 2023-11-10

    }
}
