import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        int diem = 8;


//        if (false) {
//            System.out.println("hs Khá/g");
//
//        }

//        int diem = 4;
//        if (diem > 7);
//
//
//        {
//            System.out.println("hs Khá/g");
//        }
//        if (diem > 5) {
//            System.out.println("hs tb");
//
//        } else {
//            System.out.println("hs y");
//        }

//
//        if (diem == 2 | diem == 3) {
//            System.out.println("hs Khá/g");
//        }
//        if (true) {
//            System.out.println("hs Khá/g");
//            System.out.println("hs tb/y");
//        }

//        int a = 10, b = 7;

//        if (a > b) {
//            System.out.println("max = " + a);
//        } else {
//            System.out.println("max = " + b);
//        }

//        int max = a > b ? a : b;
//        System.out.println("max = " + max);

//        char type = 'A';
//
//        switch (type){
//            case 'A':
//                System.out.println("Xếp loại tốt");
////                break;
//            case 'B':
//                System.out.println("Xếp loại Khá");
//                break;
//            case 'C':
//                System.out.println("Xếp loại tb");
//                break;
//            case 'D':
//                System.out.println("Xếp loại y");
//                break;
//            default:
//                System.out.println("Bình thường");
//        }


//        String str;
//
//        str = diem > 7 ? "hs Khá/g" : "hs tb/y";
//
//        str = diem > 7 ? "hs Khá/g" : (diem > 5 ? "hs tb" : "hs y");
//
//        System.out.println(str);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhâp vao xếp loại: ");
//        String str = scanner.nextLine();
//
//        char type = str.charAt(0);
//
//        switch (type){
//            case 'A':
//                System.out.println("Xếp loại tốt");
////                break;
//            case 'B':
//                System.out.println("Xếp loại Khá");
////                break;
//            default:
//                System.out.println("Bình thường");
//        }

//        Scanner scan = new Scanner(System.in);
////        int a, b;
//        System.out.print("nhap vào a: ");
//        int a = scan.nextInt();
//
//        System.out.print("nhap vào b: ");
//        int b = scan.nextInt();
//
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("pt ax + b = 0 co vo so nghiem");
//            } else {
//                System.out.println("pt vo nghiem");
//            }
//        } else {
//            System.out.println("pt co nghiem x = " + (a/b));
//        }

        int i = 1, j = 1;
//        int a =   i++ + ++i - i-- - --i;
////                 1 +   3  - 3   - 1
//
//        System.out.println("a = " + a);
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);

        if (i == j || i == j++) {

        }

//        System.out.print(i);
//        System.out.print(j);
//        int a =3, b = 7;
//        int c = a + b;
//        System.out.printf("c = %d + %d = %d", a, b, c);
//        System.out.println("\nc = " + a + " + " + b + " = " + c);
        Scanner scan = new Scanner(System.in);
        int age;

        do {
            System.out.print("Nhập vào tuổi: ");
            age = scan.nextInt();
            if (age < 0) {
                System.out.println("ban da nhap sai, vui long nhap lai!");
            }
        } while (age < 0);

        scan.nextLine();

        System.out.print("Nhập vào tên: ");
        String name = scan.nextLine();

        System.out.println("Tuổi: " + age);
        System.out.println("Tên: " + name);




    }

}