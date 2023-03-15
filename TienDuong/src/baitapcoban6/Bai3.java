package baitapcoban6;

import java.awt.datatransfer.DataFlavor;

public class Bai3 {


    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer("world");

        s1.append(" "+s2);
        System.out.println(s1);

    }
}
