package baitapcoban9;

import java.util.Scanner;

public class Bai2 {
    public static int soNguyenTo(int a[]){
        int result = 1;
        for (int i =0 ; i<a.length; i++){
            int j = 2;
             if (a[i]<2)
                 return 0;
             while(j<a[i]){
                 if(a[i]%j==0)
                     return 0;
                 else j++;
             }
        }
        return result;
    }

    public static int mangTangDan(int a[]){
        int n = a.length;
        for (int i = 0; i<n-1; i++){
            if(a[i]>a[i+1]){
                return 0;
            }

        }
        return 1;
    }


    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            System.out.println("Nhap phan tu thu "+i);
            a[i] = sc.nextInt();
        }


    //Mảng có phải là mảng toàn chẵn?
/*
        int result =1;
        for (int i=0; i<a.length; i++){
            if(a[i] % 2!=0){
                System.out.println("No");
                result = 0;
                break;
            }

        }
        if(result == 1)
            System.out.println("yes");
 */

    //  Mảng có phải là mảng toàn số nguyên tố
    /*
            if(soNguyenTo(a)==1)
            System.out.println("yes");
        else System.out.println("no");
     */

    // Mảng có phải là mảng tăng dần?
    if (mangTangDan(a)==1)
        System.out.println("yes");
    else System.out.println("no");

    }
}
