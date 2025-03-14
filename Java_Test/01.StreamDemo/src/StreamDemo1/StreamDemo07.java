package StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo07 {
    public static void main(String[] args) {
        //distinct 去重 元素去重 依赖（hashcode()）和equals()
        //concat  合并流 合并A B 两个流为一个流


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","a","v","bb");

        ArrayList<String>list2 = new ArrayList<>();
        Collections.addAll(list2,"王维","李萌","张久","周芷若");

        list.stream().distinct().forEach(s-> System.out.println(s));

        Stream.concat(list.stream(),list2.stream()).forEach(s-> System.out.print(s));
    }
}
