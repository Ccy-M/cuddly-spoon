package Mysocketnet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        /*
        * static InetAddress getByName(String host)   确定主机名称的IP地址 主机名称可以是机器名称 页可是IP地址
        * static InetAddress getLocalHost()            确定本地主机的IP地址
        * String getHostName()                        获取此IP地址的主机名
        *
        * String getHostAddress()                    获取此IP地址的文本格式的字符串表示形式
        *
        * */


        //1.获取InetAddres的对象
        //IP的对象  一台电脑的对象
        InetAddress address = InetAddress.getByName("cy");
        System.out.println(address);

        String name = address.getHostName();//断网时 获取不到 传IP
        //String IP = address.getHostAddress();
        System.out.println(name);

        String IP = address.getHostAddress();
        System.out.println(IP);
        //2.获取主机名





    }
}
