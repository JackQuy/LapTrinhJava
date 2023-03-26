import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void nhapTT(int k, ArrayList<String> hoTen, ArrayList tuoi, ArrayList<Boolean> gioiTinh, ArrayList mucLuong, ArrayList diemTB, Scanner sc) {
        System.out.println();

        System.out.println("Nhap hoten nhan vien thu " + k);
        hoTen.add(sc.nextLine());

        System.out.println("Nhap tuoi nhan vien thu " + k);
        tuoi.add(sc.nextLine());
//
//        System.out.println("Nhap gioi tinh : nam(true) hoac nu(false) cua nhan vien thu " + k);
//        gioiTinh.add(sc.nextBoolean());
//
//        System.out.println("Nhap vao muc luong nhan vien thu " + k);
//        mucLuong.add(sc.nextInt());
//        sc.nextLine();
//
//        System.out.println("Nhap vao diemTB cua nhan vien thu " + k);
//        diemTB.add(sc.nextLine());

    }

    public static void hienThiTT(int k, ArrayList<String> hoTen, ArrayList<Integer> tuoi, ArrayList<Boolean> gioiTinh, ArrayList<Integer> mucLuong, ArrayList<Float> diemTB) {

        System.out.println("hoten nhan vien thu " + k);
        System.out.println(hoTen.get(k));

        System.out.println("tuoi nhan vien thu " + k);
        System.out.println(tuoi.get(k));
//
//        System.out.println("gioi tinh cua nhan vien thu " + k);
//        System.out.println(gioiTinh.get(k));
//
//        System.out.println("muc luong nhan vien thu " + k);
//        System.out.println(mucLuong.get(k));
//
//        System.out.println("diemTB cua nhan vien thu " + k);
//        System.out.println(diemTB.get(k));

    }

    public static int findTBMax(float a[]) {
        float lonNhat = a[0];
        int viTri = 0;
        for (int i = 1; i < a.length; i++) {
            if (lonNhat < a[i]) {
                lonNhat = a[i];
                viTri = i;
            }

        }
        return viTri;
    }

    public static int findTBMax2(float a[]) {
        float lonNhi = -1;
        int viTri = -1;
        int lonNhat = findTBMax(a);
        for (int i = 0; i < a.length; i++) {
            if (lonNhi < a[i] && a[i] != a[lonNhat]) {
                lonNhi = a[i];
                viTri = i;
            }

        }
        return viTri;
    }

    public static int timTT(int n, String ten, ArrayList<String> hoTen){
        int result=0;
        for (int i=0; i<n; i++){
            if(hoTen.get(i).contains("ten"))
                result=1;
        }
        return result;
    }

    public static void sapXep(int n, ArrayList<String> hoTen, ArrayList<Integer> tuoi, ArrayList<Boolean> gioiTinh, ArrayList<Integer> mucLuong, ArrayList<Float> diemTB){
        for (int i=0; i<n-1; i++)
            for (int j=n-1; j>i; j--){
                if(tuoi.get(j)<tuoi.get(j-1)){
                    String ht;
                    int t, ml;
                    Boolean gt;
                    Float dtb;

                    ht = hoTen.get(j);
                    hoTen.set(j,hoTen.get(j-1));
                    hoTen.set(j-1,ht);


                }
            }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luon nhan vien");
        int n;

        n = sc.nextInt();
        sc.nextLine();

        ArrayList hoten = new ArrayList<>(n);
        ArrayList tuoi = new ArrayList<>(n);
        ArrayList gioiTinh = new ArrayList<>(n);
        ArrayList mucLuong = new ArrayList<>(n);
        ArrayList diemTB = new ArrayList<>(n);

        for (int i=0; i<n; i++){
            nhapTT(i,hoten,tuoi,gioiTinh,mucLuong,diemTB,sc);
        }

        for (int i=0; i<n; i++){
            hienThiTT(i,hoten,tuoi,gioiTinh,mucLuong,diemTB);
        }

        String ten;
        System.out.println("Nhap ten nhan vien can tim:");
        ten = sc.nextLine();

//        System.out.println(timTT(n,ten,hoten));

        System.out.println(hoten.contains("duong"));

        sapXep(n, hoten, tuoi,gioiTinh,mucLuong,diemTB);

        for (int i=0; i<n; i++){
            hienThiTT(i,hoten,tuoi,gioiTinh,mucLuong,diemTB);
        }




    }
}