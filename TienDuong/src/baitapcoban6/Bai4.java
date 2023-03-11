package baitapcoban6;

public class Bai4 {
    public static void main(String[] args) {
        String a = "A"; // A
        String b = new String("A"); //A
        String c = "A"; // A
        b.concat("B"); //AB
        String d = c.concat("C"); //AC
        StringBuffer e = new StringBuffer("E"); //E
        e.append("F");//EF
        StringBuilder g = new StringBuilder("G");//G
        g.append("H");//GH
        System.out.println(a + b + c + d + e + g);
        //                 A   A   A   AC  EF  GH
    }
}
