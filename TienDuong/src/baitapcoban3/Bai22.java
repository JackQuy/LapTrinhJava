package baitapcoban3;

import java.util.Scanner;

public class Bai22 {

    public static int giaiThua(int n){
        if(n==0)
            return 1;
        else
            return n*giaiThua(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap vao a, b, c:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.printf("%d! + %d! +%d! = %d",a ,b, c, giaiThua(a)+giaiThua(b)+giaiThua(c));
    }
}
