package Moth;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6","7","8","9","10");

        //2.常规方式
        ArrayList<Integer> list1 =new ArrayList<>();
        list.forEach(s->list1.add(Integer.parseInt(s)));

        
    }
}
