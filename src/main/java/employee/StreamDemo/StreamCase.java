package main.java.employee.StreamDemo;

import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCase {
    /*
    Stream流的获取
        创建一条流水线，并把数据放在流水线上准备进行曹组
    集合获取Stream流的方法
        直接调用集合的Stream方法获取
    Map集合获取Stream流的方法
        先获取键集合，再获取键的Stream流
        先获取值集合，再获取值的Stream流
        先获取键值对集合，再获取键值对的Stream流（使用entrySet()方法获取键值对集合）
    数组获取Stream流的方法
        直接调用数组的Stream方法获取
        或使用Stream中的of方法创建Stream对象传入数组创建Stream流，
     */
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        Collections.addAll(li,"张三","李四","王五","王五");
        //获取list集合的流，直接遍历输出
        li.stream().forEach(s -> System.out.println(s));
        //li.stream().forEach(System.out::println);

        //获取Map集合的流，
        Map<String,Integer> mp = new HashMap<>();
        mp.put("张三",15);
        mp.put("李四",20);
        mp.put("王五",25);
        mp.put("赵六",10);
        //获取Map集合的Key的集合的流,并直接输出
        mp.keySet().stream().forEach(System.out::println);
        //获取Map集合的value的集合的流，并输出
        mp.values().stream().forEach(System.out::println);
        //获取Map集合的key、value的集合的流，并直接输出
        mp.entrySet().stream().forEach(System.out::println);

        //获取数组的流
        String [] strArr = {"张三封","李五","王五","王五"};
        Arrays.stream(strArr).forEach(System.out::println);
        //对流进行过滤,过滤出所有名字带五的，并直接输出
        Arrays.stream(strArr).filter(s->s.startsWith("五")).forEach(System.out::println);
        //对流进行过滤，过滤出三个字的名字，并输出
        Arrays.stream(strArr).filter(s -> s.length() == 3).forEach(System.out::println);
        //获取前几个元素
        Arrays.stream(strArr).limit(1).forEach(System.out::println);
        //跳过前几个元素
        Arrays.stream(strArr).skip(1).forEach(System.out::println);
        //去重复
        Arrays.stream(strArr).distinct().forEach(System.out::println);

        //合并流
        String [] intArr1 = {"java","java1"};
        Stream<String> stream1 = Arrays.stream(intArr1);
        Stream<String> stream2 = Arrays.stream(strArr);
        Stream<String> stream3 = Stream.concat(stream2,stream1);
        stream3.forEach(System.out::println);
        //count统计流中有多少元素,该方法必须在获取流之后使用链式编程立马调用，不能用流变量再次调用，
        long size = Arrays.stream(intArr1).count();
        System.out.println(size);
        //流加工方法map
        //在数组每个元素前加上 str
        Arrays.stream(intArr1).map(s1 -> "str" + s1).forEach(System.out::println);

        //将流的每个数据放到对象中
        Arrays.stream(intArr1).map(s1 -> new person(s1)).forEach(System.out::println);

    }

}
