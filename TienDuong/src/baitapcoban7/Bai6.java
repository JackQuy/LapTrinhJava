package baitapcoban7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Bai6 {
    /*
    6.Hãy nhập vào 2 String có định dạng là DD/MM/YYYY. Hãy chuyển thành 2 biến kiểu Date. Sau đó hãy tính số
    ngày chênh lệch giữa 2 ngày đã nhập vào.
     */
    public static void main(String[] args) {
        String ngay = "12/12/2022";
        String ngay1 = "15/12/2022";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(ngay,dateTimeFormatter);
        LocalDate date1 = LocalDate.parse(ngay1,dateTimeFormatter);

        long diff = ChronoUnit.DAYS.between(date,date1);

        System.out.println(diff);
    }
}
