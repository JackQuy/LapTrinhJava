package baitapcoban3;

import java.util.Scanner;

public class Bai3 {
//    3.In dãy số 2, -4, 6, -8, 10 … n (n là số nhập vào từ bàn phím) (*)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao n");
        n = sc.nextInt();

        int i, result;
        for (i = 1; i <= n; i ++){
            result = i*2;
            if(i%2==0)
                result*=(-1);
            System.out.printf("%d ",result);
        }

    }
}
