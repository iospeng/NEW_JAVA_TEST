package main.java.employee.MapTest;

import java.util.*;

public class MapDemo2 {
    /*
        集合嵌套
     */
    public static void main(String[] args) {
        Collection<String> selects = new ArrayList<>();
        Collections.addAll(selects,"A","B","C");

        Collection<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1,"B","C");

        Collection<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2,"B","C","D");

        Map<String, Collection<String>> maps = new HashMap<>();
        maps.put("张三",selects);
        maps.put("李四",selects1);
        maps.put("王五",selects2);

        System.out.println(maps);

        Collection<Collection<String>> values = maps.values();
        System.out.println(values);

        //定义Map集合统计出现次数
        Map<String,Integer> num = new HashMap<>();
        for (Collection<String> value : values) {
            for (String s : value) {
                if (num.containsKey(s)){
                    num.put(s,num.get(s)+1);
                }else {
                    num.put(s,1);
                }
            }
        }
        System.out.println(num);
    }
}
