package ThreadTest03;

public class Mythread {
    public static void main(String[] args) {

        Runnable3 r1 = new Runnable3();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        Thread t4 = new Thread(r1);
        Thread t5 = new Thread(r1);

        t1.start();
        t2.start();

        t3.start();
        t4.start();

        t5.start();
    }
}
