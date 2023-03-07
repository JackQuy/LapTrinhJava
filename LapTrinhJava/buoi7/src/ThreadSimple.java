public class ThreadSimple extends Thread{
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(this.getName() + " is running");
//        }
//    }
//    public static void main(String args[]) {
//        System.out.println("Start the program");
//
//        ThreadSimple t1 = new ThreadSimple();
//        t1.start();
//
//        ThreadSimple t2 = new ThreadSimple();
//        t2.start();
//
//        System.out.println("End the program");
//
//
//        StringBuilder strBuilder1 = new StringBuilder("Hello");
//        StringBuilder strBuilder2 = strBuilder1;
//        strBuilder2.append(" World");
////        strBuilder2.
//    }

    static StringBuilder str = new StringBuilder();
//    static StringBuffer str = new StringBuffer();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            append(this.getName() + " is running");
        }
        System.out.println(this.getName() + " is print: " + str);
    }

    static synchronized void append(String target) {
        str.append(target);
    }

    public static void main(String args[]) {
        System.out.println("Start the program");

        ThreadSimple t1 = new ThreadSimple();
        t1.start();

        ThreadSimple t2 = new ThreadSimple();
        t2.start();

        System.out.println("End the program");
    }

}
