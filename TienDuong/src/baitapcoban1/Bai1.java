package baitapcoban1;

import java.util.Calendar;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar rightNow = Calendar.getInstance();
        int age, year=rightNow.get(Calendar.YEAR);

        do{
            System.out.println("Nhap vao nam sinh cua ban");
            age = sc.nextInt();
            if(age<0)
                System.out.println("Nam sinh nhap vao chua dung dinh dang");
        }while(age<0);

        System.out.println("So tuoi cua ban la:"+(year-age));

    }
}
