package baitapcoban3;

import java.util.Scanner;

public class Bai4 {
//  4.In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
    public static void main(String[] args) {
        int n, result;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//      Cach 1:
//        for(int i=1; i<=n; i++){
//            result = i*2;
//            if(i%3==0)
//                result*=(-1);
//            System.out.printf("%d ",result);
//        }
//        Cach 2:
        int i, j;
        for(i=1, j=1; i<=n; i++, j++){
            if(j%3==0)
                System.out.printf("%d ",i*2*(-1));
            else System.out.printf("%d ",i*2);
        }

    }
}
