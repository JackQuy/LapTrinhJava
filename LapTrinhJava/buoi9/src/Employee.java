import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = nhapSoNguyen(scanner);

        String listName[] = new String[n];
        int listAge[] = new int[n];
        String listGender[] = new String[n];
        int listSalary[] = new int[n];
        float listMediumScore[] = new float[n];

        inputInformationListEmployee(scanner, listName, listAge, listGender, listSalary, listMediumScore, n);
        outputInformationListEmployee(listName, listAge, listGender, listSalary, listMediumScore, n);
    }

    static int nhapSoNguyen(Scanner scanner) {
        int n;
        do {
            System.out.print("Nhập vào n: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("ban da nhap sai, vui long nhap lai!");
            }
        } while (n < 0);

        return n;
    }
//    static void inputInformationEmployee(Scanner scanner, String name, int age, String gender, int salary, float mediumScore) {
////        Scanner scanner = new Scanner(System.in);
//        System.out.print("Nhap vao tên nhân viên: ");
//        name = scanner.nextLine();
//        System.out.print("Nhap vào năm sinh: ");
//        age = scanner.nextInt(); scanner.nextLine();
//        System.out.print("Nhap vào giới tính: ");
//        gender = scanner.nextLine();
//        System.out.print("Nhập lương: ");
//        salary = scanner.nextInt();
//        System.out.print("Nhập điểm trung bình đại học: ");
//        mediumScore = scanner.nextFloat(); scanner.nextLine();
//    }

    static String inputName(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        System.out.print("Nhap vao tên nhân viên: ");
        return scanner.nextLine();
    }

    static String inputGender(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        System.out.print("Nhap vào giới tính: ");
        return scanner.nextLine();
    }

    static int inputAge(Scanner scanner) {
        System.out.print("Nhap vào năm sinh: ");
        return scanner.nextInt();
    }

    static int inputSalary(Scanner scanner) {
        System.out.print("Nhập lương: ");
        return scanner.nextInt();
    }

    static float inputMediumScore(Scanner scanner) {
        System.out.print("Nhập điểm trung bình đại học: ");
        return scanner.nextFloat();
    }

    static void inputInformationListEmployee(Scanner scanner, String listName[], int listAge[], String listGender[], int listSalary[], float listMediumScore[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào nhân viên thứ " + (i + 1) + " :");
//            inputInformationEmployee(scanner, listName[i], listAge[i], listGender[i], listSalary[i], listMediumScore[i]);
            listName[i] = inputName(scanner);
            listAge[i] = inputAge(scanner);
            listGender[i] = inputGender(scanner);
            listSalary[i] = inputSalary(scanner);
            listMediumScore[i] = inputMediumScore(scanner);
        }
    }

    static void outputInformationEmployee(String name, int age, String gender, int salary, float mediumScore) {
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Năm sinh: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Lương nhân viên: " + salary);
        System.out.println("Điểm tb đại học: " + mediumScore);
    }

    static void outputInformationListEmployee(String listName[], int listAge[], String listGender[], int listSalary[], float listMediumScore[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("Xuat nhân viên thứ " + (i + 1) + ": ");
            outputInformationEmployee(listName[i], listAge[i], listGender[i], listSalary[i], listMediumScore[i]);
        }
    }

    static void sortEmployee() {

    }
}
