import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class BaiTap {
    public static void main(String[] args) throws ParseException {
        // 1.Chuyển chuỗi “02/28/2019” sang kiểu java.util.Date
        String str = "02/28/2019";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = simpleDateFormat.parse(str);
        System.out.println(date);
        //C2
        String str1 = "1992-09-10T12:00:00"; // phải dùng ngày tháng năm giờ phút giây
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        LocalDate localDate = LocalDate.parse(str, dateTimeFormatter);
        LocalDateTime localDate = LocalDateTime.parse(str1, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(localDate);

        //2.Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date sang kiểu String theo đinh dạng YYYY/MM/DD và hiển thị ra màn hình.
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY/MM/dd");
        String str2 = simpleDateFormat1.format(date);
        System.out.println(str2);

        System.out.println("======================================");

        LocalDate localDate1 = LocalDate.parse("2020-05-15"); // 2020-May-15
        System.out.println("localDate1: " + localDate1); // 2020-05-15
        System.out.println();

        System.out.println("localDate1.lengthOfMonth(): " + localDate1.lengthOfMonth());  // 31 days

        LocalDate localDate2 = LocalDate.parse("2020-06-15"); // 2020-May-15
        System.out.println("localDate1: " + localDate2); // 2020-05-15
        System.out.println();

        System.out.println("localDate1.lengthOfMonth(): " + localDate2.lengthOfMonth());  // 31 days



        LocalDate now = LocalDate.now();
        LocalDate tenSecondsLater = now.plusDays(10);

        long diff = ChronoUnit.DAYS.between(now, tenSecondsLater);

        System.out.println(diff);

    }
}
