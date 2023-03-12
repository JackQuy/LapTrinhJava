public class Main {
    public static void main(String[] args) {
        int a[] = new int[10];
//        int a[] = new int[]{1, 2, 3};
//        for (int i = 0; i < 3; i++) {
//            System.out.println("a[" + i + "]= " + a[i]);
//        }
//        System.out.println(a[3]);

        for (int i = 0; i < 10; i++)
            a[i] = i * i;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]= " + a[i]);
        }
    }
}