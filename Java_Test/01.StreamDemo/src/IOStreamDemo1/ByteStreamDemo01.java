package IOStreamDemo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo01 {
    public static void main(String[] args) throws  IOException {
        /*
        * void write(int b)   一次写一个字节数组
        * void write(byte[] b) 一次写一个字节数组
        * void write(byte[] b,int off,int len) 一次写一个字节数组
        *  off  开始位置  len  长度
        *
        * */

//创建输出字符流对象
        FileOutputStream fos = new FileOutputStream("D:\\daily\\Idea_Test\\Java_Test\\a.txt");

//        //2. 写出数据
//        fos.write(97);
//        fos.write(98);
//

//        //void write(byte[] b)
//        byte[] bytes = {97,98,99,100};
//        fos.write(bytes);


        //void write(byte[] b,int off,int len)
        byte[] bytes1 = {97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112};
        fos.write(bytes1,4,8);
//
//        //释放资源
        fos.close();






    }







}
