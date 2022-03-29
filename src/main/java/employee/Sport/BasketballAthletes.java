package main.java.employee.Sport;
/*
* 篮球运动员类，继承运动员抽象类
* */
public class BasketballAthletes extends Athletes {
    public BasketballAthletes() {
    }

    public BasketballAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void AthletesStudy() {
        System.out.println("篮球运动员学习打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭！");
    }
}
