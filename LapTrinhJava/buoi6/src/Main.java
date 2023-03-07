public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        String str1 = "Pham Quy fdgfdgdgg";
        System.out.println(str1.replace("n", "x"));
        System.out.println(str1);

        String str2 = "pham quy";
//        int check = str1.compareTo(str2);
        int check = str1.compareToIgnoreCase(str2);

        System.out.println(check);

    }

}