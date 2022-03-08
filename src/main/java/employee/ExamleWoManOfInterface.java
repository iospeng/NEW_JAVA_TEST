package main.java.employee;

import main.java.employee.Interface.WoManOfInterface;

public class ExamleWoManOfInterface implements WoManOfInterface {
    @Override
    public void dog() {
        System.out.println("WoMan接口实现类，实现父类Dog接口的方法 dog");
    }

    @Override
    public void WoManName() {
        System.out.println("WoMan接口实现类，实现WoMan接口的方法 WoManName");
    }

    @Override
    public void eat() {
        System.out.println("WoMan接口实现类，实现Name接口的方法 eat");
    }

    @Override
    public void work() {
        System.out.println("WoMan接口实现类，实现Name接口的方法 eat");
    }
}
