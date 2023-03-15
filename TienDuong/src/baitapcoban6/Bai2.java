package baitapcoban6;

public class Bai2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello world");
        for (int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == 'o')
                s1.replace(i,i+1, "f");
        }
        System.out.println(s1);

        StringBuffer s2 = new StringBuffer("Hello world");
        for (int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == 'o')
                s1.replace(i,i+1, "f");
        }
        System.out.println(s1);
    }
}
