package main.java.employee.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arraysdame {
    public static void main(String[] args) {
        Integer[] is = {3,4,2,53,43,555};
        //自定义排序规则
        Arrays.sort(is, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(Arrays.toString(is));
    }
}
