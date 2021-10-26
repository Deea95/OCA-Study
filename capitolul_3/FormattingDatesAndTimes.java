package capitolul_3;

import java.time.LocalDate;
import java.time.Month;

public class FormattingDatesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.AUGUST,25);
        System.out.println(date.getDayOfWeek()); // WEDNESDAY
        System.out.println(date.getMonth());// AUGUST
        System.out.println(date.getYear()); // 2021
        System.out.println(date.getDayOfYear()); // 237
    }
}
