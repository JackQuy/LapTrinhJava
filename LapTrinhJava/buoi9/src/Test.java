import java.util.Scanner;

public class Test {
    public static int n, m = 100;
    public static String hoTen[] = new String[m];
    public static int tuoi[] = new int[m];
    public static boolean gioiTinh[] = new boolean[m];
    public static int mucLuong[] = new int[m];
    public static float diemTB[] = new float[m];
    public static void nhapTT(int k){
        Scanner sc = new Scanner(System.in);
//        System.out.println();
        System.out.println("Nhap hoten nhan vien thu "+k);
        hoTen[k] = sc.nextLine();

        System.out.println("Nhap tuoi nhan vien thu "+k);
        tuoi[k] = sc.nextInt();

        System.out.println("Nhap gioi tinh : nam(true) hoac nu(false) cua nhan vien thu "+k);
        gioiTinh[k] = sc.nextBoolean();

        System.out.println("Nhap vao muc luong nhan vien thu "+k);
        mucLuong[k] = sc.nextInt();

        System.out.println("Nhap vao diemTB cua nhan vien thu "+k);
        diemTB[k] = sc.nextFloat();

    }

    public static int findTBMax(float a[]){
        float lonNhat = a[0];
        int viTri = 0;
        for(int i=1; i<a.length; i++){
            if(lonNhat < a[i]){
                lonNhat = a[i];
                viTri = i;
            }

        }
        return viTri;
    }

    public static int findTBMax2(float a[]){
        float lonNhi = -1;
        int viTri= -1;
        int lonNhat = findTBMax(a);
        for (int i = 0; i<a.length; i++){
            if(lonNhi<a[lonNhat] && lonNhi<a[i]){
                lonNhi = a[i];
                viTri = i;
            }

        }
        return viTri;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao so luong nhan vien");
        n = sc.nextInt();

        for(int i=0; i<n; i++)
            nhapTT(i);
        System.out.println();

        System.out.println("Nhan vien co diemTB cao nhat:");
        System.out.println(hoTen[findTBMax(diemTB)]);

        System.out.println("Nhan vien co diemTB cao nhi");
        System.out.println(hoTen[findTBMax2(diemTB)]);

//        String a = "Pham Quy";
//        System.out.println(a.contains("uy"));



    }
}
