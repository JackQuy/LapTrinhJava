package baitapcoban3;

import java.util.Scanner;

import static java.lang.Math.*;

public class Bai23 {
//    23.Nhập một số nguyên dương n (n > 0).  Hãy cho biết:
//    a. Có phải là số đối xứng? Ví dụ: 121, 12021, …
//    b. Có phải là số chính phương? Ví dụ: 0, 1, 4, 9, 16, 25 …
//    c. Có phải là số nguyên tố? Ví dụ: 2, 3, 5, 7, 11, 13…
//    d. Các chữ số có tăng dần hay giảm dần không? Lưuý ở chỗ này cần phải phân biệt rõ ràng giữa tăng dần“nghiêm ngặt” và “không nghiêm ngặt”
//    Tăng dần nghiêm ngặt: Chữ số đằng sau bắt buộc phải lớn hơn đằng trước. Vd: 123456 Tăng dần không nghiêm ngặt: Chữ số đằng sau có thể >= chữ số đằng trước. Vd: 1122334566



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, result = 0;
        System.out.println("Nhap vao n:");
        n = sc.nextInt();
/*       Cau a:
        int kq = n;
        while(n!=0){
            result = result*10 + n%10;
            n = n/10;
        }
        if(result==kq)
            System.out.println("So doi xung");
        else System.out.println("So khong doi xung");
*/

/*
        Cau b
        for(int i=0; i<=n/2; i++ ){
            if ((int)Math.pow(i,2) == n)
                result = 1;
        }
        if (result == 1 || n==1){
            System.out.println("So "+n+" la so chinh phuong");

        }
        else System.out.println("So "+n+" khong la so chinh phuong");
*/

/*
        Cau c
        for (int i=2; i<=n/2; i++){
            if(n%i == 0)
                result = 1;
        }
        if (result == 0 && n>1){
            System.out.println("So "+n+" la so nguyen to");

        }
        else
            System.out.println("So "+n+" khong la so nguyen to");
*/


    }
}
