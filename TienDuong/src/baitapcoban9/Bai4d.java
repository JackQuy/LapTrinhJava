package baitapcoban9;

import java.util.Scanner;

public class Bai4d {
    /*
        Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí
        của k trong mảng. (*)
         */
    public static void find(int a[], int k){
        int i= 0;
        while(i<a.length){
            if (k == a[i]){
                System.out.println("Tim thay phan tu "+k+" trong mang");
                break;
            }
        }
        for(int j = 0; j<a.length; j++){
            if(k==a[j]){
                System.out.println("Phan tu "+a[j]+" xuat hien tai vi tri so:"+j);
            }
        }
    }
    public static void main(String[] args) {
        int k, a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<a.length; i++){
            System.out.println("Nhap vao phan tu thu "+i);
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao phan tu can tim");
        k =  sc.nextInt();

        find(a,k);

    }
}
