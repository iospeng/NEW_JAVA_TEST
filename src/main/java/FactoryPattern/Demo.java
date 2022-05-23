package main.java.FactoryPattern;

/**
 * 工厂模式
 * 概述：
 * 是java中最常用的设计模式之一，这种类型的设计模式属于创建型模式，它提供了一种获取对象的方式
 * 作用：
 * 可以封装对象创建的细节，比如：危改对象进行加工和数据注入
 * 可以实现类与类之间的解耦操作（核心思想）
 */

public class Demo {
    public static void main(String[] args) {
        Computer computer = FactoryDemo.create("Mac");
        computer.start();

        Computer computer1 = FactoryDemo.create("HUAWEI");
        computer1.start();
    }
}
