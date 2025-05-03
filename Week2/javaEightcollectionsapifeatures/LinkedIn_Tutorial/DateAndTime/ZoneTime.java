package DateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTime {

    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/New_York");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,zoneId);
        System.out.println("\n Zoned DateTime: " + zonedDateTime);

        ZonedDateTime zonedDateTime2 = localDateTime.atZone(zoneId);
        ZonedDateTime zonedDateTime3 = ZonedDateTime.now();
        System.out.println("\n Zoned DateTime3: " + zonedDateTime3.getZone());

    }

    
}
