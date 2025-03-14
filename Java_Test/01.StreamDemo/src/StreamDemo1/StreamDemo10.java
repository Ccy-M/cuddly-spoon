package StreamDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        //collect 方法 收集流中的数据 放到集合中（list set map）

            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
//
//            list.stream().filter(new Predicate<Integer>() {
//                @Override
//                public boolean test(Integer s) {
//                    if(s%2==0){
//                        return true;
//                    }else {
//                    return false;}
//                }
//            }).forEach(s-> System.out.println(s));
////        new ArrayList<Integer>().stream().filter(s->s%2==0).collect(collectors)
//        ArrayList<String> list1 = new ArrayList<>();
//        Collections.addAll(list1,"张三，23","李四，33","wangwu,88");
//
//            list1.stream()
//                    .filter(s->Integer.parseInt(s.split(",")[1])>=24)
//                    .collect(Collectors.toMap())








    }
}
