package udpdemo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SendMessaeDemo {
    public static void main(String[] args) throws SocketException {
        //发送数据

        //1.创建DatagramSocket对象（端口）
        //细节
        //绑定端口 以后我们就是通过这个端口往外发送
        //空参 所有可用端口中随机一个进行使用
        //有参 指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();

        //打包数据
         String str = "你好";
         byte[] bytes = str.getBytes();

        DatagramPacket dp = new DatagramPacket( bytes,0,bytes.length);


    }



}

