package baitapcoban6;

public class Bai1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello world");
        s1.delete(0,5);
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("Hello world");
        s2.delete(0,5);
        System.out.println(s2);

    }
}
