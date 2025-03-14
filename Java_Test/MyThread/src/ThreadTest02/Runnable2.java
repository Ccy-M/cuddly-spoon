package ThreadTest02;

public class Runnable2 implements Runnable {
 public static int num =1;

 public static Object lock = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (lock){

                if(num<=100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if(num%2!=0){
                        System.out.println(Thread.currentThread().getName()+"拿到了奇数："+num);

                    }
                    num++;

                }else{

                    break;
                }
            }
        }

    }
}
