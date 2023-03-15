package baitapcoban4;

import java.util.Scanner;

public class Bai1 {
    public static String lowerCase(String a){
        return a.toLowerCase();
    }

    public static int giaiPhuongTrinhBac1(int a, int b){
        if (a == 0)
            return b;
        return -b/a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen;
        System.out.println("Nhap vao ho ten cua ban ( Viet hoa):");
        hoTen = sc.nextLine();
        System.out.println("Ho ten sau khi viet thuong: "+lowerCase(hoTen));
    }
}
