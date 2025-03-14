package StreamDemo1;

import java.util.stream.Stream;

public class StreamDemo05 {

    public static void main(String[] args) {
        //一堆零散的数据用stream流进行操作 前提 数据是同种数据类型的

        Stream.of(1,2,3,4,5,6,7,8,9).forEach(s-> System.out.println(s));

        Stream.of("张三","李四","王五","赵六").forEach(s-> System.out.println(s));
    }
}
