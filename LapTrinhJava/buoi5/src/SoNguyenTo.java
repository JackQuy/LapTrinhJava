import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("ban da nhap sai, vui long nhap lai!");
            }
        } while (n < 1);

        boolean soNguyenTo = checkSoNguyenTo(n);

        if (soNguyenTo) {
            System.out.println(n + " la so nguyen to");

        } else {
            System.out.println(n + " khong la so nguyen to");
        }

//        if (Math.sqrt(20) == (int)Math.sqrt(20)) {
//            System.out.println("so chinh phuong");
//        }

    }

    public static boolean checkSoNguyenTo(int n) {
        if ( n == 2 || n == 3 || n == 5 || n == 7) {
            return true;
        } else {
            int dem = n / 2;
            for ( int i = 2; i <= dem ; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }
}
