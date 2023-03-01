package baitapcoban1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String product;
        int count, price;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten SP");
        product = sc.nextLine();
        System.out.println("Nhap soluong SP");
        count = sc.nextInt();
        System.out.println("Nhap don gia SP");
        price = sc.nextInt();

        int money = count*price;
        System.out.printf("Tien phai tra: %d\n", money);
        System.out.printf("Thue phai tra: %.2f", money*0.1);
    }
}
