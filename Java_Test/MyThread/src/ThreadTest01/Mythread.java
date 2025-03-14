package ThreadTest01;

public class Mythread implements Runnable{

    int ticket = 0;
    //做一个锁
     Object obj = new Object();
    @Override
    public void run() {


        while(true){
            synchronized (Mythread.class){
                if(ticket<1000){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println(Thread.currentThread().getName()+ "正在卖第"+(++ticket)+"张票");
                    System.out.println("剩余"+(1000-ticket)+"张票");
                }
                else{
                    System.out.println("票卖完了");

                    break;
                }
            }
        }

    }
}
