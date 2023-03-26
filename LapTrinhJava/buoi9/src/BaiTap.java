import java.util.Arrays;
import java.util.Scanner;

public class BaiTap {

    public static void main(String[] args) {
        int n;
        n = nhapSoNguyen();

        int a[] = new int[n];

        nhapMang(a, n);
        xuatMang(a, n);

        if (checkMangToanChan(a, n)) {
            System.out.println("Mảng a toàn số chẵn");
        } else {
            System.out.println("Mảng a không phải toàn số chẵn");
        }

        System.out.println("Tổng số các nguyên tố của mảng: " + totalprimeNumber(a, n));

    }
    static int nhapSoNguyen() {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("ban da nhap sai, vui long nhap lai!");
            }
        } while (n < 0);

        return n;
    }

    static void nhapMang(int arr[], int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mang arr có do dai " + n + " :");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }

    static void xuatMang(int arr[], int n) {
        System.out.println("Xuat mang arr có do dai " + n + " :");
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }

    static boolean checkSoChan(int n) {
        return n % 2 == 0;
    }

    static boolean checkMangToanChan(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (!checkSoChan(arr[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int totalprimeNumber(int arr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(arr[i])) {
                total += arr[i];
            }
        }
        return total;
    }
}
