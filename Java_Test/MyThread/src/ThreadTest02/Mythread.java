package ThreadTest02;

public class Mythread {
    public static void main(String[] args) {

        Runnable2 r1 = new Runnable2();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
