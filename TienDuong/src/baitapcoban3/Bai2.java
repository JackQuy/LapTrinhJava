package baitapcoban3;

import java.util.Scanner;

public class Bai2 {
//  In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao n");
        n = sc.nextInt();

        int i, j;
        for (i = 1, j=1; i <= n; i ++, j+=2)
            System.out.printf("%d ", j);
    }
}
