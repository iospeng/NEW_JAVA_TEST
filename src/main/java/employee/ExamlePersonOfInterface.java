package main.java.employee;

import main.java.employee.Interface.PersonOfInterface;

public class ExamlePersonOfInterface implements PersonOfInterface {
    @Override
    public void personName(String name) {
        System.out.println(name + "Person实现类，实现Person接口");
    }

    @Override
    public void eat() {
        System.out.println("person实现类，实现父类NmaeOfInterface接口 eat方法");
    }

    @Override
    public void work() {
        System.out.println("person实现类，实现父类NmaeOfInterface接口 work方法");
    }
}
