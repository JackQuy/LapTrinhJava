public class Main {
    public static void main(String[] args) {
//        int i = 0;
//        for (int i = 0, sum = 0; i < 5; sum+=i, i++) {
//            System.out.println(i);
//        }

//        int j = 0;
//        for (; j < 0; ) {
//            System.out.println(j);
//            j++;
//        }
//
//        int i = 0;
//        while(i < 0) {
//            System.out.println(i);
//            i++;
//        }
        System.out.println("Debug trong intellij");

        int n = 10;

        for (int i = 0; i < n; i++) {
            int x = i + 2;
            method1(x);
//            breakpoint;
        }

        System.out.println("Kết thúc chương trình!!!");



    }
    static void method1(int n) {
        int temp = n + 2;
        temp++;
        method2(temp);
//        breakpoint;
    }

    static int method2(int n) {
        System.out.print(n + "  ");
        return 1;
    }

}