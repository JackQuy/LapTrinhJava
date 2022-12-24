import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        int a =5, b =3;
        System.out.printf("c = %d + %d = %d", a, b,  a + b);
        System.out.println();
        System.out.println("c = " + a + " + " + b + " = " + (a + b));
//        System.out.println(a-b);
//        System.out.println(a+b);
//        System.out.println(a%b);
//        System.out.println(a*b);

//        int c;
//
//        a += b;  // 5 + 3 = 8 = a
//        System.out.println(a);

        int i = 1, j = 1;
//        int a =  i++ + ++i - i-- - --i; //
        //        1  +  3   - 3   - 1
//        System.out.println(a);
//        System.out.println(i);
//        System.out.println(j);

        boolean check = (i > j) & (++i <= j);

        System.out.print("\n" + i + "\n");


        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập vào tuổi: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.print("Nhập vào tên: ");
        String name = scan.nextLine();

        System.out.println("Tuổi: " + age);
        System.out.println("Tên: " + name);

    }
}
