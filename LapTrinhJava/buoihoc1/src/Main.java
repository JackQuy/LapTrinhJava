import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char kyTu = 56;

        System.out.println((int)kyTu);

        float so = 56;
        System.out.println(so);
        /*
        gsadjhasdjk
        ághdjk
        jhagsjk
        jsd
         */

        String str = "string";
        System.out.println(str.charAt(0));
        System.out.println(Math.sqrt(25));

        float fl = 65;

        final int MAX_NUMBER_STUDENT = 100;
        int i = 1, j = 1;
//        int a = i++ + ++i - i-- - --i;
        //      1  + 3   -   3   -  1  = 0
//        System.out.println(a);


        boolean boo = (++i < 1) && (i++ == 1);
        System.out.println(i);

        // c =  a + b;
        int a = 3, b = 6;
        int c = a + b;
        System.out.printf("%d + %d = %d", a, b, c);
        System.out.println();
        System.out.println(a + " + " + b + " = " + c);

        Scanner scan = new Scanner(System.in);

        System.out.print("Nhập vào tuổi: ");
        int age = scan.nextInt();
        System.out.print("Nhập vào năm sinh: ");
        int namSinh = scan.nextInt();
        scan.nextLine();
        System.out.print("Nhập vào tên: ");
        String name = scan.nextLine();

        System.out.println("Tuổi: " + age);
        System.out.println("Tên: " + name);
    }
}