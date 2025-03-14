package StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class StreamDemo06 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张强","张三丰","张无忌","张无忌","张无忌");

//        //filter 过滤 把集合中名字为张无忌的过滤掉
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//               //如果结果返回true则保留，false则过滤掉
//                s.startsWith("张无忌");
//                return false;
//            }
//        });
//        //filter 过滤 把集合中名字为张无忌的过滤掉
//        list.stream().filter(s->!s.startsWith("张无忌")).forEach(s-> System.out.println(s));

        //limit 截取前几个元素
        list.stream().limit(3)
                .forEach(s-> System.out.println(s));

        System.out.println("====================================");

        //skip 跳过前几个元素
                list.stream().skip(3)
                        .forEach(s -> System.out.println(s));

        System.out.println("====================================");

                list.stream().skip(3)
                        .limit(3)
                        .forEach(s-> System.out.println(s));




    }
}
