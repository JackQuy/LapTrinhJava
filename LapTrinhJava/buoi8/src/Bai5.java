import java.time.LocalDateTime;
import java.util.Date;

public class Bai5 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime = localDateTime.plusDays(-1000);
        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfWeek());
    }
}
