package baitapcoban9;

import java.util.Scanner;

public class Bai4e {
    /*
    Tìm giá trị lớn nhất và nhỏ nhất của mảng a. (Theo 2 cách: cách 1 dùng 2 vòng for.
    Cách 2 dùng 1 vòng for).
     */
    public static void findOneFor(int a[]){
        int max = a[0], min = a[0];
        for(int i=1; i<a.length; i++){
            if (a[i]>max)
                max = a[i];
            if(a[i]<min)
                min = a[i];
        }
        System.out.println("Gia tri lon nhat "+max);
        System.out.println("Gia tri nho nhat "+min);
    }

    public static void findTwoFor(int a[]){
        int max = a[0], min = a[0], n = a.length;
        for(int i=1; i<n-1; i++){

        }
    }



    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<a.length; i++){
            System.out.println("Nhap vao phan tu thu "+i);
            a[i] = sc.nextInt();
        }
        findOneFor(a);
    }
}
