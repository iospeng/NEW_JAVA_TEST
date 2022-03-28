package main.java.employee.Generics;

public class GenericsTest<T> {
    /**
     * 泛型方法
     * 不确定参数是什么类型
     * E - Element (在集合中使用，因为集合中存放的是元素)
     * T - Type（Java 类）
     * K - Key（键）
     * V - Value（值）
     * N - Number（数值类型）
     * ？ - 表示不确定的 java 类型
     * */
    public void prin(T t){
        System.out.println("泛型方法参数传入一个类，使用这个类变量调用类的方法");
    }
}
