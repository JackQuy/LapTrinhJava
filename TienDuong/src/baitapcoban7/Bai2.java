package baitapcoban7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai2 {
/*Chuyển ngày hiện tại (của hệ thống) đang ở kiểu java.util.Date sang kiểu String theo đinh dạng YYYY/MM/DD
và hiển thị ra màn hình.*/
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String newDate = simpleDateFormat.format(date);
        System.out.println(newDate);
    }
}
