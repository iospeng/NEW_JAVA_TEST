package main.java.employee.Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Integer[] is = {3,4,2,53,43,555};
        //自定义排序规则
//        Arrays.sort(is, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        //使用Lamdba表达式简化自定义排序规则接口（内部类）
//        方法一
//        Arrays.sort(is,(Integer o1, Integer o2)->{return o2-o1;});
//        方法二，极限省略
        Arrays.sort(is,(o1, o2)-> o2-o1);
        System.out.println(Arrays.toString(is));
    }
}

