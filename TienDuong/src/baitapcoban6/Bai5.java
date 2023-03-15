package baitapcoban6;

public class Bai5 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2));


        StringBuilder s3 = new StringBuilder("Hello");
        StringBuilder s4 = new StringBuilder("Hello");

        System.out.println(s3.equals(s4));
    }
}
