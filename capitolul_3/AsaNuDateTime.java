package capitolul_3;

import java.time.LocalDate;
import java.time.Month;

public class AsaNuDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY,20);
        date.plusDays(10);
        System.out.println(date); // 2020-01-20

    }
}
