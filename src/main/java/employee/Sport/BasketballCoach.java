package main.java.employee.Sport;
/*
* 篮球教练类，继承教练抽象类
* */

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void CoachTeaching() {
        System.out.println("篮球教练教篮球！");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃饭");
    }
}
