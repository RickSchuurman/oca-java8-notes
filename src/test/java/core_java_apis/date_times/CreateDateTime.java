package core_java_apis.date_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreateDateTime {

    public static void main(String[] args) {


        // Date and Time classes are immutable !

        System.out.println(LocalDate.now()); // 2019-11-01
        System.out.println(LocalTime.now()); // 13:46:41.887
        System.out.println(LocalDateTime.now()); // 2019-11-01T13:46:41.888


        LocalDate date1 = LocalDate.of(2019, 11, 1);
        LocalDate date2 = LocalDate.of(2019, Month.NOVEMBER, 1);


        LocalTime time1 = LocalTime.of(13, 46);
        LocalTime time2 = LocalTime.of(13, 46, 41);
        LocalTime time3 = LocalTime.of(13, 46, 41, 200);


        // Combine date and times

        LocalDateTime dateTime = LocalDateTime.of(2019, 11, 1, 13, 46, 41, 888);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);


//        LocalDate d = new LocalDate(); DOES NOT COMPILE // it is a static class


//        LocalDate.of(2019,1,32); DOES NOT COMPILE, invalid value for DayOfMonth
    }
}
