package baitapcoban7;

import java.time.LocalDateTime;

public class Bai3 {
/*
3.Lấy ngày, tháng, năm, giờ, phút, giây hiện tại của hệ thống.
 */
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
