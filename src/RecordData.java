import java.time.*;
import java.util.jar.JarEntry;

public class RecordData {

    LocalDate day = LocalDate.of(2024, Month.JANUARY,2);
    LocalTime h = LocalTime.of(13,30);
    LocalDateTime dayH = LocalDateTime.of(2,Month.JANUARY,2024,13,20);

    ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(day,h,zone);
        {
        System.out.println(zonedDateTime1);}
}

