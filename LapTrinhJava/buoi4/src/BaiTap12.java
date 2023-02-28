import java.util.Scanner;

public class BaiTap12 {
    public static void main(String[] args) {
        /*
        12.Tính tổng và tích các chữ số của một số m, m được nhập từ bàn phím
            (Ví dụ : m = 234 => S = 2 + 3 + 4 = 9, P = 2 * 3 * 4 = 24)
            234 % 10 = 4

             temp = 234 / 10;
             23
         */

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("ban da nhap sai, vui long nhap lai!");
            }
        } while (n < 1);

        int temp = n;
        int S = 0, P = 1;
        while (temp > 0) {
            S += (temp % 10);
            P *= (temp % 10);
            temp /= 10;
        }
        System.out.println("S = " + S);
        System.out.println("P = " + P);
        int a  = n % 4;
        switch (a) {
            case 0:
                System.out.println(n * (-1));
                break;
            default:
                System.out.println(n);
        }
    }
}
