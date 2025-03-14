package StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class StreamDemo08 {
    public static void main(String[] args) {

        //map  转换流中的数据类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-11","张强-77","张三丰-77","张无忌-7","张无忌-55");

        //只获取里面的年龄并进行打印

//        list.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] split = s.split("-");
//                return Integer.parseInt(split[1]);
//            }
//        }).forEach(s-> System.out.println(s));
        list.stream()
                .map(s->Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.println(s));
    }
}
