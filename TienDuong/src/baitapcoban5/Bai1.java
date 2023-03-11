package baitapcoban5;

public class Bai1 {
    public static void main(String[] args) {
        String index = "Hello world";
        //1. Cho chuỗi “Hello World”   Lấy ra chữ World
        String index1 = index.substring(6);
        System.out.println(index1);

        //2.Cho chuỗi “Hello World”  Thay o thành f
        String index2 = index.replace('o', 'f');
        System.out.println(index2);

        //3.Cho chuỗi “Hello World”  Đếm xem có bao nhiêu chữ l
        int result3=0;
        for(int i=0; i<index.length();i++){
            if(index.charAt(i) == 'l')
                result3++;
        }
        System.out.println("So chu l:"+result3);


        // 4.Cho chuỗi “Hello World”  Cho biết vị trí xuất hiện đầu tiên và cuối cùng của chữ l
        for (int i=0; i<index.length(); i++){
            if(index.charAt(i) == 'l'){
                System.out.println("Vi tri xuat hien dau tien:"+i);
                break;
            }

        }
        System.out.println(index.indexOf('l'));//Vi tri xuat hien dau tien cua kitu hoac chuoi
        int n = index.length();
        for(int i=n-1; i>=0; i--){
            if(index.charAt(i) == 'l') {
                System.out.println("Vi tri xuat hien cuoi cung:" + i);
                break;
            }
        }
        System.out.println(index.lastIndexOf('l'));

        //7.Cho chuỗi “Hello World”  Đảo chuỗi thành dlroW olleH
        String index7="";
        for(int i = n-1; i>=0; i-- ){
            index7+=index.charAt(i);
        }
        System.out.println(index7);
    }
}
