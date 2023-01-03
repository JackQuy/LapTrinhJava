public class SoXe {
    public static void main(String[] args) {
        int soXe = 347;
        //-----------
        int temp = soXe;
        int soDu = soXe / 10000;
        int total = soDu;
//        System.out.println(soDu);
        //----------
        temp = temp % 10000;
        soDu = temp / 1000;
        total += soDu;
//        System.out.println(soDu);
        //----------
        temp = temp % 1000;
        soDu = temp / 100;
        total += soDu;
//        System.out.println(soDu);
        //----------
        temp = temp % 100;
        soDu = temp / 10;
        total += soDu;
        //        System.out.println(soDu);
        //----------
        temp = temp % 10;
        soDu = temp / 1;
        total += soDu;
        System.out.println(total);
    }
}
