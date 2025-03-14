package StreamDemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo09 {
    public static void main(String[] args) {
        //Stream流终结方法
        // forEach  遍历  long count()  统计流中元素的个数
        // toArray  将流转换为数组

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","赵六");
//IntFunction的泛型：具体类型的数组
        //apply的形参 流中数据的个数 要跟数组的长度保持一致 并把数据放到数组中
        //返回值：返回一个具体类型的数组
        //方法体：就是创建数组


        //toArray 的参数作用 负责创建一个指定类型的数组
        //toArray方法的底层 会依次得到流里面的每一个数据 并把数据依次放到数组中
//        //返回值 是一个装有流里面所有数据的数组
//       String[] arr= list.stream().toArray(new IntFunction< String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
//        System.out.println(Arrays.toString(arr));


        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));
    }
}
