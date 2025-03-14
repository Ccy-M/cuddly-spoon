package StreamDemo1;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张无极");
        list.add("张无忌");
        list.add("张三丰");
        list.add("张无j");
        list.add("张三q");
        //fiter 过滤
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
    }
    //stream的使用方法
    //1. Stream流是Java8的新特性，是集合的升级版，是集合的优化版本。
    //2. Stream流是对集合（Collection）或数组（Array）操作的流式处理，可以理解为流式数据处理。
    //3. Stream流可以解决集合操作难于理解、效率低等问题。
    //4. Stream流可以进行并行操作，提高效率。
    //5. Stream流可以进行数据映射、过滤、聚合等操作。
    //6. Stream流可以进行数据排序、分组、分区等操作。
    //7. Stream流可以进行数据转换等操作。
    //8. Stream流可以进行数据统计等操作。
}
