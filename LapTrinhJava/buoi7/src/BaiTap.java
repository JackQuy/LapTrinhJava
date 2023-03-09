public class BaiTap {


    public static void main(String[] args) {
        StringBuilder jkah = new StringBuilder("Hello World");
        System.out.println(jkah.substring(6));
        System.out.println(jkah.replace(0, 1, "ab"));
//
//        String str = "Hello World";
//        System.out.println(str.replace('o', 'a'));

        String str1 = new String("ab");
        String str2 = new String("ab");
        System.out.println(str1.equals(str2));



    }
}
