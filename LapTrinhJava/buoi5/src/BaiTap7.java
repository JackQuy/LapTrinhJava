import java.util.Scanner;

public class BaiTap7 {
    static String name1, name2, name3, name4, name5;
    static int age1, age2, age3, age4, age5;
    static String gender1, gender2, gender3, gender4, gender5;
    static int salary1, salary2, salary3, salary4, salary5;
    static float mediumScore1, mediumScore2, mediumScore3, mediumScore4, mediumScore5;
    public static void main(String[] args) {
        int n = 1;
        String yesNo = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập thông tin nhân viên thứ " + n + ":");
            switch (n) {
                case 1:
                    inputInformationEmployee1();
                    break;
                case 2:
                    inputInformationEmployee2();
                    break;
                case 3:
                    inputInformationEmployee3();
                    break;
                case 4:
                    inputInformationEmployee4();
                    break;
                case 5:
                    inputInformationEmployee5();
                    break;
                default:
                    System.out.println("Xin cảm ơn!");
            }
            if (n <= 5) {
                System.out.println("Bạn có muốn nhập tiếp không?");
                System.out.println("Bấm y nhập tiếp, n để kết thúc: ");
                yesNo = scanner.nextLine();
            }
            n++;
        } while (n <= 5 && yesNo.equals("y"));

        for (int i = 1; i <= n; i++) {
            System.out.println("Thông tin nhân viên thứ " + i + ":");
            switch (i) {
                case 1:
                    outputInformationEmployee1();
                    break;
                case 2:
                    outputInformationEmployee2();
                    break;
                case 3:
                    outputInformationEmployee3();
                    break;
                case 4:
                    outputInformationEmployee4();
                    break;
                case 5:
                    outputInformationEmployee5();
                    break;
                default:
                    System.out.println("Xin cảm ơn!");
            }
        }
    }

    public static void inputInformationEmployee1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tên nhân viên: ");
        name1 = scanner.nextLine();
        System.out.print("Nhap vào năm sinh: ");
        age1 = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nhap vào giới tính: ");
        gender1 = scanner.nextLine();
        System.out.print("Nhập lương: ");
        salary1 = scanner.nextInt();
        System.out.print("Nhập điểm trung bình đại học: ");
        mediumScore1 = scanner.nextFloat();

    }

    public static void inputInformationEmployee2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tên nhân viên: ");
        name2 = scanner.nextLine();
        System.out.print("Nhap vào năm sinh: ");
        age2 = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nhap vào giới tính: ");
        gender2 = scanner.nextLine();
        System.out.print("Nhập lương: ");
        salary2 = scanner.nextInt();
        System.out.print("Nhập điểm trung bình đại học: ");
        mediumScore2 = scanner.nextFloat();

    }

    public static void inputInformationEmployee3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tên nhân viên: ");
        name3 = scanner.nextLine();
        System.out.print("Nhap vào năm sinh: ");
        age3 = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nhap vào giới tính: ");
        gender3 = scanner.nextLine();
        System.out.print("Nhập lương: ");
        salary3 = scanner.nextInt();
        System.out.print("Nhập điểm trung bình đại học: ");
        mediumScore3 = scanner.nextFloat();

    }

    public static void inputInformationEmployee4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tên nhân viên: ");
        name4 = scanner.nextLine();
        System.out.print("Nhap vào năm sinh: ");
        age4 = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nhap vào giới tính: ");
        gender4 = scanner.nextLine();
        System.out.print("Nhập lương: ");
        salary4 = scanner.nextInt();
        System.out.print("Nhập điểm trung bình đại học: ");
        mediumScore4 = scanner.nextFloat();

    }

    public static void inputInformationEmployee5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao tên nhân viên: ");
        name5 = scanner.nextLine();
        System.out.print("Nhap vào năm sinh: ");
        age5 = scanner.nextInt(); scanner.nextLine();
        System.out.print("Nhap vào giới tính: ");
        gender5 = scanner.nextLine();
        System.out.print("Nhập lương: ");
        salary5 = scanner.nextInt();
        System.out.print("Nhập điểm trung bình đại học: ");
        mediumScore5 = scanner.nextFloat();

    }

    public static void outputInformationEmployee1() {
        System.out.println("Tên nhân viên: " + name1);
        System.out.println("Năm sinh: " + age1);
        System.out.println("Giới tính: " + gender1);
        System.out.println("Lương nhân viên: " + salary1);
        System.out.println("Điểm tb đại học: " + mediumScore1);
    }

    public static void outputInformationEmployee2() {
        System.out.println("Tên nhân viên: " + name2);
        System.out.println("Năm sinh: " + age2);
        System.out.println("Giới tính: " + gender2);
        System.out.println("Lương nhân viên: " + salary2);
        System.out.println("Điểm tb đại học: " + mediumScore2);
    }

    public static void outputInformationEmployee3() {
        System.out.println("Tên nhân viên: " + name3);
        System.out.println("Năm sinh: " + age3);
        System.out.println("Giới tính: " + gender3);
        System.out.println("Lương nhân viên: " + salary3);
        System.out.println("Điểm tb đại học: " + mediumScore3);
    }

    public static void outputInformationEmployee4() {
        System.out.println("Tên nhân viên: " + name4);
        System.out.println("Năm sinh: " + age4);
        System.out.println("Giới tính: " + gender4);
        System.out.println("Lương nhân viên: " + salary4);
        System.out.println("Điểm tb đại học: " + mediumScore4);
    }

    public static void outputInformationEmployee5() {
        System.out.println("Tên nhân viên: " + name5);
        System.out.println("Năm sinh: " + age5);
        System.out.println("Giới tính: " + gender5);
        System.out.println("Lương nhân viên: " + salary5);
        System.out.println("Điểm tb đại học: " + mediumScore5);
    }
}
