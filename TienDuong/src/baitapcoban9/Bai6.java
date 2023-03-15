package baitapcoban9;

import java.util.Scanner;

public class Bai6 {
    public static int find(int a[], int k){
        int i= 0, result = 0;
        while(i<a.length){
            if (k == a[i]){
                result++;
            }
            i++;
        }
        return result;
    }
    public static void delete(int a[], int k){
        int n = a.length;
        for (int i=0; i<n; i++){
            if (k == a[i]){
                for(int j = i; j<n-1; j++)
                    a[j] = a[j+1];
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, a[]= new int[5];

        for (int i= 0; i<a.length; i++){
            System.out.println("Nhap vao phan tu thu "+i);
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao phan tu can xoa:");
        k = sc.nextInt();

        int f = find(a, k);
        delete(a, k);


        int m = a.length - f;
        int b[] = new int[m];

        for(int i=0; i<b.length; i++){
            b[i] = a[i];
        }
        System.out.println("Mang sau khi xoa");
        for (int i=0; i<m; i++)
            System.out.println(b[i]);



    }
}
