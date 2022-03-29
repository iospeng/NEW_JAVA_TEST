package main.java.employee.Sport;
/*
* 运动员抽象类，继承人类抽象类
* */

public abstract class Athletes extends Person {
    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }
    public abstract void AthletesStudy();
}
