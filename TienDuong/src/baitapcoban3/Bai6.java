package baitapcoban3;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count=2;
        n = sc.nextInt();
        for(int i=2,j=1 ;i<=n; i+=2,j++){
            if(j==count){
                System.out.printf("%d ",i*(-1));
                count++;
                j=0;
            }else{
                System.out.printf("%d ",i);
            }

        }
    }
}
