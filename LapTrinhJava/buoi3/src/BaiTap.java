import java.util.Scanner;

public class BaiTap {
    int bien = 10;


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

//        for (int i = 1; i < n; i++) {
//            if (i == 6) {
//                continue;
//            }
//            System.out.println(i);
//        }

        // 4.In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
//          dem = 2
//        for (int i = 2, j = 1; i <= n; i += 2, j++) {
//            if (j == dem) {
//                System.out.print((i * (-1)) + ", ");
//                j = 0;
//        dem++;
//            } else {
//                System.out.print(i + ", ");
//            }
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("* ");
                } else if (i % 2 == 0) {
                    if(j % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if(j % 2 == 0) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


//        System.out.println(i);
        }
}
