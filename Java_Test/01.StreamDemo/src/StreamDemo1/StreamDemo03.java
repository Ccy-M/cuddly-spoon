package StreamDemo1;

import java.util.HashMap;

public class StreamDemo03 {
    public static void main(String[] args) {
        //双列集合

        //1.创建双列集合
        HashMap<String,Integer> map = new HashMap<>();
        //2.添加数据
        map.put("张三",100);
        map.put("李四",90);
        map.put("王五",80);
        map.put("赵六",70);

        //3.第一种获取stream流
//        map.keySet().stream().forEach(s-> System.out.println(s));

        //4.第二种获取Stream流
        map.entrySet().stream().forEach(s-> System.out.println(s));




    }
}
