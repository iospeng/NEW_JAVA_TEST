package main.java.employee.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    /*
    collections集合工具类
        是集合的工具类：java.utils.Collections
    作用：
        Collections并不属于集合，是用来操作集合的工具类
    常用api
        addAll(): 给集合对象批量加元素
        shuffle(): 打乱List集合元素的顺序，只能打乱List集合的顺序
        sort(): 将List集合中的元素按照默认规则排序，只能排序List集合
                也可以使用Comparator自定义排序规则
     */
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Collections.addAll(lists,3,2,1,6,7,4,5); // 给集合批量添加元素
        System.out.println(lists);
        Collections.shuffle(lists); //打乱集合顺序
        System.out.println(lists);
        Collections.sort(lists); // 方式一：按照默认排序规则排序
        System.out.println(lists);


        List<CarDemo> ls = new ArrayList<>();
        ls.add(new CarDemo("奔驰",50.5,5));
        ls.add(new CarDemo("宝马",30.1,7));
        ls.add(new CarDemo("奥迪",51.5,6));
        //方式一: 对象实体类中实现Comparable接口，重写其comperTo方法来自定义比较规则
        Collections.sort(ls);
        System.out.println(ls);
        //方式二: 使用Comparator规则比较器，给类对象排序
        // Double 类型数据不能直接相减在比较，数据会变成int报错
//        Collections.sort(ls, (o1,  o2) -> Double.compare(o1.getMoney() ,o2.getMoney())); //按照money升序排序
        Collections.sort(ls, (o1,  o2) -> Double.compare(o2.getMoney() ,o1.getMoney())); //按照money降序排序
        System.out.println(ls);


    }
}
