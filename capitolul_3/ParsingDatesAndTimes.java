package capitolul_3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDatesAndTimes {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("08 25 2021", f);
        LocalTime time = LocalTime.parse("23:02");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22
    }
}
