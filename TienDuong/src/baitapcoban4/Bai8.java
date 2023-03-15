package baitapcoban4;

import java.util.Scanner;

public class Bai8 {

    public static void nhapThongTin(String hoTen, int tuoi, int mucLuong, int diemDaiHoc, boolean gioiTinh){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten");
        hoTen = sc.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = sc.nextInt();
        System.out.println("Nhap gioi tinh true(nam) or false(nu)");
        gioiTinh = sc.nextBoolean();
        System.out.println("Nhap mucluong");
        mucLuong = sc.nextInt();
        System.out.println("Nhap diem dai hoc");
        diemDaiHoc = sc.nextInt();
        do {
            System.out.println("Diem chua hop le!! Nhap lai!!");
            diemDaiHoc = sc.nextInt();
        }while( diemDaiHoc>10 || diemDaiHoc<0);
        System.out.println("Ho ten: "+hoTen+" | Gioi tinh: "+gioiTinh+" | Tuoi: "+tuoi+" | Diem dai hoc: "+diemDaiHoc+" | Muc Luong: "+mucLuong);
    }



    public static void main(String[] args) {

    }
}
