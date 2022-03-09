package main.java.employee;

import main.java.Interface.ManOfInterface;

public class ExamleManOfInterface implements ManOfInterface {
    @Override
    public void manName(String name) {
        System.out.println(name + "Man接口实现类，实现Man接口方法 manName");
    }

    @Override
    public void personName(String name) {
        System.out.println(name + "Man接口实现类，实现父类Person接口方法 manName");
    }

    @Override
    public void eat() {
        System.out.println("Man接口实现类，实现父类接口Person的父类接口nameOfInterface方法 eat");
    }

    @Override
    public void work() {
        System.out.println("Man接口实现类，实现父类接口Person的父类接口nameOfInterface方法 work");
    }
}
