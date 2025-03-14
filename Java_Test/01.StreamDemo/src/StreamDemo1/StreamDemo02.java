package StreamDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo02 {

    //单列集合   default Stream<E> stream();
    public static void main(String[] args) {
        //单列集合获取Stream流
        //集合可以是ArrayList<E> 也可以是 LinkedList<E> HashSet<E>  TreeSet<E>
        // 集合可以是String[] 也可以是 int[]
        ArrayList <String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","v","bb");
        //获取到一条Stream流 并把集合中的数据依次传入到Stream流中
//        Stream<String> s1 = list.stream();
//        s1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                //s:依次从集合中取出的数据
//                System.out.println(s);
//            }
//        });
        list.stream().forEach(s-> System.out.println(s));
    }
}
