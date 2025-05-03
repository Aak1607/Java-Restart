package DateAndTime;

import java.time.Clock;
import java.time.Instant;

public class Clocks {
    public static void main(String[] args) {
       Clock clock =  Clock.systemDefaultZone();
         System.out.println("\n Clock: " + clock);

         Instant instant = clock.instant();
         System.out.println("\n Instant: " + instant);

         Clock clock1= Clock.systemUTC();
         System.out.println("\n Clock: " + clock1.instant());
    }
    
}
