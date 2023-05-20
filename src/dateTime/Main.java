package dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Instant-ul lucreaza cu timezone-urile, celelalte nu
        //LocalTime, LocalDate, LocalDateTime, Instant

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalTime ll = LocalTime.of(13, 13, 14);
        System.out.println(ll);
        LocalTime nn = LocalTime.now().withHour(17).withSecond(51);
        System.out.println(nn);
    }
}
