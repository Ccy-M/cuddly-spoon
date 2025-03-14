package demo3Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        //目标：掌握Stream流基本使用 体会它的优势和特点
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("田七");
        list.add("田七");

        //先用传统方案 找出姓张的人 名字为三个字的 存入一个新集合中
        List<String> newlist = new ArrayList<>();
        for(String s :list){
            if(s.startsWith("张")&& s.length()==2){
                newlist.add(s);
            }
        }
        for(String s :newlist){
            System.out.println(s);
        }

        // 用Stream流
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==2);
    }
}
