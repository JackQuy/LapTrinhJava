package baitapcoban1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap vao 2 so a va b");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.printf("%d + %d = %d\n",a,b,a+b);
        System.out.printf("%d - %d = %d\n",a,b,a-b);
        System.out.printf("%d * %d = %d\n",a,b,a*b);
        System.out.printf("%d / %d = %d",a,b,a/b);

    }
}
