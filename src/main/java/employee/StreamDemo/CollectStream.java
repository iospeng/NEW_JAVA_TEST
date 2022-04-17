package main.java.employee.StreamDemo;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStream {
    /*
        收集Stream流
     */
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        Collections.addAll(al,"张三丰","张无忌","李小龙","成龙","李连杰","杰森史坦森");
        Stream<String> liStream = al.stream().filter(s -> s.startsWith("李"));
        //收集Stream流到List集合中，且收集出来的集合是可变集合
        List<String> listStream = liStream.collect(Collectors.toList());
        System.out.println("收集后的List集合：" + listStream);

        //收集Stream流到Set集合中
        Stream<String> liStream1 = al.stream().filter(s -> s.startsWith("张"));
        Set<String> setStream = liStream1.collect(Collectors.toSet());
        System.out.println("收集后的Set集合：" + setStream);
        
        //收集Stream流到数组中
        Stream<String> arrStream = al.stream().filter(s -> s.startsWith("张"));
        //收集到的集合默认需要用Object类型的集合接受，因为Stream流中的数据可能通过某些手段修改成不一样的类型
        Object[] arrs = arrStream.toArray();

        //传入IntFunction对象指定收集数组的数据类型
//        String[] arrs = arrStream.toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
        //简化
//        String[] arrs = arrStream.toArray(String[]::new);

        System.out.println(Arrays.toString(arrs));
    }
}
