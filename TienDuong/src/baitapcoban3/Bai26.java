package baitapcoban3;

import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tienSanPham, tienKhachHang, tienThua;
        System.out.println("Nhap vao so tien cua san pham");
        tienSanPham = sc.nextInt();
        System.out.println("Nhap vao so tien cua Khach Hang");
        tienKhachHang = sc.nextInt();
        do {
            if(tienKhachHang<tienSanPham){
                System.out.println("So tien nhap vao chua dung!! Moi nhap lai");
                System.out.println("Nhap vao so tien cua san pham");
                tienSanPham = sc.nextInt();
                System.out.println("Nhap vao so tien cua Khach Hang");
                tienKhachHang = sc.nextInt();
            }

            tienThua = tienKhachHang - tienSanPham;
        }while(tienKhachHang<tienSanPham);

//        int namTram = 500, motNgan = 1000, haiNgan = 2000, namNgan = 5000, muoiNgan = 10000;
//        int haiMuoiNgan = 20000, namMuoiNgan = 50000, motTramNgan = 100000, haiTramNgan = 200000, namTramNgan = 500000;
        int i=5;
        while(tienThua>0){

            if(tienThua>=5*(int)Math.pow(10,i)){
                System.out.println("So to tien "+5*(int)Math.pow(10,i)+" : "+tienThua/(int)(5*Math.pow(10,i)) + " to ");
                tienThua%=(5*(int)Math.pow(10,i));
            }
            if(tienThua>=2*(int)Math.pow(10,i)){
                System.out.println("So to tien "+2*(int)Math.pow(10,i)+" : "+tienThua/(int)(2*Math.pow(10,i))+" to ");
                tienThua%=(2*(int)Math.pow(10,i));
            }
            if(tienThua>=(int)Math.pow(10,i)){
                System.out.println("So to tien "+(int)Math.pow(10,i)+" : "+tienThua/(int)(Math.pow(10,i)) + "to ");
                tienThua%=((int)Math.pow(10,i));
            }
            i--;
//            if(tienThua>=namMuoiNgan){
//                System.out.println("So to tien namMuoiNgan phai tra: "+tienThua/namMuoiNgan);
//                tienThua%=namMuoiNgan;
//            }
//            if(tienThua>=haiMuoiNgan){
//                System.out.println("So to tien haiMuoiNgan phai tra: "+tienThua/haiMuoiNgan);
//                tienThua%=haiMuoiNgan;
//            }
//            if(tienThua>=muoiNgan){
//                System.out.println("So to tien muoiNgan phai tra: "+tienThua/muoiNgan);
//                tienThua%=muoiNgan;
//            }
//            if(tienThua>=namNgan){
//                System.out.println("So to tien namNgan phai tra: "+tienThua/namNgan);
//                tienThua%=namNgan;
//            }
//            if(tienThua>=haiNgan){
//                System.out.println("So to tien haiNgan phai tra: "+tienThua/haiNgan);
//                tienThua%=haiNgan;
//            }
//            if(tienThua>=motNgan){
//                System.out.println("So to tien motNgan phai tra: "+tienThua/motNgan);
//                tienThua%=motNgan;
//            }
//            if(tienThua>=namTram){
//                System.out.println("So to tien namTram phai tra: "+tienThua/namTram);
//                tienThua%=namTram;
//            }

        }


    }
}
