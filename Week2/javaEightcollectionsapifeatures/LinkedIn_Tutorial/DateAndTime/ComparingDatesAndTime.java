package DateAndTime;

import java.time.LocalDateTime;

public class ComparingDatesAndTime {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 10, 1, 10, 30);

        System.out.println(dateTime1.compareTo(dateTime2));
    }
}
