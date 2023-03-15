package baitapcoban5;

public class Bai2 {
    public static void main(String[] args) {
        String index = "Hello world";

        int n=0,m = index.length();
        for(int i=0; i<=m-1; i++){
            char kiTu;
            int result =0, ok=1 ;
            kiTu = index.charAt(i);

            for(int j = i; j<=m-1; j++){
                if( kiTu == index.charAt(j))

                    result++;
            }

            for (int k = 0; k<i; k++){
                if(kiTu == index.charAt(k))
                    ok = 0;
            }
            // su dung ham substring
            if(ok == 1)
                System.out.println("Ki tu "+kiTu+" xuat hien: "+result+" lan.");
        }
    }
}
