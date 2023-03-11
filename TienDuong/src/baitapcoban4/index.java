package baitapcoban4;

import java.util.Scanner;

public class index {
    public static long tinhTongSoLe(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0)
                result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(tinhTongSoLe(n));
    }
}
