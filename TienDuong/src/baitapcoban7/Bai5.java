package baitapcoban7;

import java.time.LocalDate;
import java.util.Date;

public class Bai5 {
    /*
      Hãy cho biết cách đây 1000 ngày (tính từ ngày hiện tại) là ngày tháng năm nào?
    */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate oldDay = date.plusDays(-1000);

        System.out.println(oldDay);

        Date date1 = new Date();
        
    }
}
