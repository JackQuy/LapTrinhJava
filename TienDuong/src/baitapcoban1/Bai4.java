package baitapcoban1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float Toan, Ly, Hoa;
        System.out.println("Nhap vao diem toan, ly, hoa:");
        Toan = sc.nextFloat();
        Ly = sc.nextFloat();
        Hoa = sc.nextFloat();

        float TB = Toan + Ly + Hoa;

        System.out.printf("Trung binh cong 3 mon la: %.2f",TB/3);

    }
}
