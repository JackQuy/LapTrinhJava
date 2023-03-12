import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Bai6 {
    public static void main(String[] args) throws ParseException {
        String str1 = "23/07/2023";
        String str2 = "23/08/2023";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = simpleDateFormat.parse(str1);
        Date date2 = simpleDateFormat.parse(str2);
        // C1
//        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(date1.toInstant(), ZoneId.systemDefault());
//        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());

//        long diff = ChronoUnit.DAYS.between(localDateTime1, localDateTime2);

        // C2
        long diffInMillies = Math.abs(date1.getTime() - date2.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        System.out.println(diff);

        // C3
        LocalDate firstDate = LocalDate.of(2010, 5, 17); // 2010-05-17
        LocalDate secondDate = LocalDate.of(2015, 3, 7); // 2015-03-07

        Period period = Period.between(firstDate, secondDate);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());



    }
}
