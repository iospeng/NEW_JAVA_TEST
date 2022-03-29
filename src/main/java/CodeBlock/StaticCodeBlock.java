package main.java.CodeBlock;

import java.util.ArrayList;

/*
    类的五大元老（成员变量、成员方法、构造方法、代码块、内部类）
    代码块
    静态代码块：属于类，与类同时加载
        优点：执行速度快（与非静态代码块相比）因为他是在加载类的同时加载完成的，并且只加载一次
        缺点：浪费空间，因为他是创建好了放在内存中的，并不像非静态代码，用的时候才创建
    非静态代码块：属于对象，类实例化时同时加载(使用的非常少)
        优点：节省空间（因为是在创建类的时候才加载它）
        缺点：执行速度较慢（与静态代码块相比）
 */
public class StaticCodeBlock {
    private static int age = 123;
    private  String  name = "张三";
    private static ArrayList<String> brand = new ArrayList<String>();
    //静态代码块
    static {
        String [] num = {"3","4","5","6","7","8","9","10","J","Q","K","1","2",};
        String [] colors = {"♠","♥","♣","♦"};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String str = colors[j] + num[i];
                brand.add(str);
            }
        }

        brand.add("大王");
        brand.add("小王");
        System.out.println(brand);
    }
    //非静态代码块
    {
        System.out.println("非静态代码块");
    }
}
