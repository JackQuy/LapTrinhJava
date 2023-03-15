package baitapcoban4;

import java.util.Scanner;

public class Bai2 {
    public static int tinhSoNghichDao(int n){
        int result=0;
        while(n!=0){
            result = result*10 + n%10;
            n = n / 10;
        }
        return result;
    }

    public static boolean kiemTraDoiXung(int n){
        int result=0, kq =n;
        while(n!=0){
            result = result*10 + n%10;
            n = n / 10;
        }
        if (result == kq)
            return true;
        else return false;
    }

    public static boolean kiemTraChinhPhuong(int n){
        if((int)Math.sqrt(n) == Math.sqrt(n))
            return true;
        return false;
    }

    public static boolean kiemTraNguyenTo(int n){
        int result = 0;
        for (int i =2; i<=n/2; i++){
            if(n%i == 0)
                result = 1;
        }
        if (result == 1 || n ==1)
            return false;
        else return true;
    }

    public static int tinhTongSoLe(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0)
                result+=i;
        }
        return result;
    }

    public static int tinhTongSoNguyenTo(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            if(kiemTraNguyenTo(i))
                result+=i;
        }
        return result;
    }

    public static int tinhTongChinhPhuong(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            if(kiemTraChinhPhuong(i))
                result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Nhap vao n");
        n = sc.nextInt();
        System.out.println("So dao nguoc cua n la:"+tinhSoNghichDao(n));
        System.out.println("So vua nhap vao la doi xung: "+ kiemTraDoiXung(n));
        System.out.println("So vua nhap vao la so chinh phuong:"+kiemTraChinhPhuong(n));
        System.out.println("So vua nhap vao la so nguyen to:"+kiemTraNguyenTo(n));
        System.out.println("Tong cac chu so le:"+tinhTongSoLe(n));
        System.out.println("Tong cac chu so nguyen to:"+tinhTongSoNguyenTo(n));
        System.out.println("Tong cac chu so chinh phuong:"+tinhTongChinhPhuong(n));

    }
}
