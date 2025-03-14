public class MyThread01 extends Thread implements Runnable {
    public static void main(String[] args) {

//
//        Runnable01 r1 = new Runnable01();
//
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r1);
//        t2.start();
//        t1.start();

        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
        


    }




}
