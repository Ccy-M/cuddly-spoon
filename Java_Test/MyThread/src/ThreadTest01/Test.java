package ThreadTest01;

public class Test {
    public static void main(String[] args) {

        Mythread t1 = new Mythread();
        Thread t = new Thread(t1);
        Thread tt = new Thread(t1);
        t.setName("张三");
        tt.setName("李四");
        t.start();
        tt.start();


    }
}
