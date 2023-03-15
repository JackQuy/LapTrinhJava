package baitapcoban7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Bai4 {
    /*
    Hãy cho biết 1 tháng sau (tính từ ngày hiện tại) sẽ rơi vào thứ mấy trong tuần, và cách ngày hiện tại
    bao nhiêu ngày?
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate newdate = date.plusDays(10);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MM dd yyyy");
        System.out.println(date.format(dateTimeFormatter));

        Period different = Period.between(date,newdate);
        System.out.println(different.getDays());

        long diff = ChronoUnit.DAYS.between(date, newdate);
        System.out.println(diff);


    }
}
