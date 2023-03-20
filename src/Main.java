import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate day = LocalDate.of(2024, Month.JANUARY,2);
        LocalTime h = LocalTime.of(13,30);
        LocalDateTime dayH = LocalDateTime.of(2024,Month.JANUARY,2,13,20);

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(day,h,zone);
        {
            System.out.println(zonedDateTime1);}


    }
}