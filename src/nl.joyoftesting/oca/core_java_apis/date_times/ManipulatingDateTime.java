package core_java_apis.date_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDateTime {

    public static void main(String[] args) {

        {
            // LocalDate

            LocalDate date = LocalDate.of(2019, 1, 30);
            System.out.println(date); // 2019-01-30
            date = date.plusDays(2);
            System.out.println(date); // 2019-02-01
            date = date.plusWeeks(1);
            System.out.println(date); // 2019-02-08
            date = date.plusMonths(1);
            System.out.println(date); // 2019-03-08
            date = date.plusYears(1);
            System.out.println(date); // 2020-03-08
        }

        {
            // LocalDateTime

            LocalDate date = LocalDate.of(2020, Month.NOVEMBER, 20);
            LocalTime time = LocalTime.of(5, 15);
            LocalDateTime localDateTime = LocalDateTime.of(date,time);

        }
    }
}