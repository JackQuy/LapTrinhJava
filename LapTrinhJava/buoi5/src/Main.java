import java.util.Scanner;

public class Main {

    int a;
    static int b;

    void method1() {}

    static void method2(int b) {
//        int b = 3;
        System.out.println(b);
    }
    public static void main(String[] args) {
//            int b;
//        int S = tinhTong(2,3);
//        System.out.println(S);
//        int s  = nhapXuatTong();
//
//        int a = s + 7;
//        System.out.println(a); // Lỗi
//        System.out.println(b);
//        method1();  // Lỗi
        method2(b);

    }

    public static int nhapXuatTong() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên x: ");
        int x = scanner.nextInt();

        System.out.print("Nhập vào số nguyên y: ");
        int y = scanner.nextInt();
//        int s = x + y;
        System.out.printf("%d cộng %d = %d", x, y, x + y);
        return x + y;
    }

    public static int tinhTong(int x, int y) {
        int s = x + y;
//        System.out.printf("%d cong %d bang %d\n", x, y, s);
        return s;
    }
}