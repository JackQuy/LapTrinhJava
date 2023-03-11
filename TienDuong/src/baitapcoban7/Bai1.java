package baitapcoban7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Bai1 {
    // 1.Chuyển chuỗi “02/28/2019” sang kiểu java.util.Date
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = simpleDateFormat.parse("02/28/2019");
        System.out.println(date);


    }
}
