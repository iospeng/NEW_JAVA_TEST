package main.java.employee.Sport;

/*
* 教练抽象类，继承人类抽象类
*  */

public abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void CoachTeaching();
}
