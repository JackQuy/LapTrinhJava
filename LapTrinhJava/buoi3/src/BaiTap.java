import java.util.Scanner;

public class BaiTap {


    public static void main(String[] args) {
        //1. In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("ban da nhap sai, vui long nhap lai!");
            }
        } while (n < 1);

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == 1 || i == 5 || j ==1 || j == 5) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }

        for (int i = 1; i < n; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }


    }
}
