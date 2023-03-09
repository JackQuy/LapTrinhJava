import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date day = new Date();

//        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMM/yyyy");
        Date date = simpleDateFormat.parse("12/May/1995");
        System.out.println(date);

        String str = simpleDateFormat.format(day);
        System.out.println(str);

        System.out.println(day.getDate());

        String string = "12/03/1995";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateate = LocalDate.parse(string, formatter);

        System.out.println(localDateate);
        String str2 = "1992-09-10T12:00:00";
        LocalDateTime localDateTime = LocalDateTime.parse(str2, DateTimeFormatter.ISO_LOCAL_DATE_TIME);

//        LocalDateTime localDateTime = LocalDateTime.parse(string, formatter);
        System.out.println(localDateTime);

        String str3 = DateTimeFormatter.ISO_DATE_TIME.format(localDateTime);
        System.out.println(str3);

        Date today = new Date();
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(today.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime1);

        boolean checkDate = localDateTime1.isAfter(localDateTime);
        System.out.println(checkDate);
    }
}