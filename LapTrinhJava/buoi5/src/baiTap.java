import java.util.Scanner;

public class baiTap {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        a = nhap();
        b = nhap();
        c = nhap();

        long s1, s2, s3;
        s1 = tinhGiaiThua(a);
        s2 = tinhGiaiThua(b);
        s3 = tinhGiaiThua(c);


        long s = s1 + s2 + s3;

        System.out.println(a + "!  + " + b + "!  + " + c + "!  = " + s);
    }

    public static int nhap() {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("ban da nhap sai, vui long nhap lai!");
            }
        } while (n < 1);

        return n;
    }

    public static long tinhGiaiThua(int n) {
        long s = 1;
        for (int i = 2; i <= n ; i++)
            s *= i;
        return s;
    }
}
