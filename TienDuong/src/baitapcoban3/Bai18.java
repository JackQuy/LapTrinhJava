package baitapcoban3;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao n");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n)
                    System.out.println("* ");
                else{
                    if(i%2==0 && j%2==0)
                        System.out.println("* ");
                    else if(i%2!=0 && j%2!=0)
                        System.out.println("* ");
                }
            }
            System.out.println("\n");
        }

    }
}
