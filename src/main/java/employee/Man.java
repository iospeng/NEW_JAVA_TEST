package main.java.employee;

public class Man extends Person {
    private int money;

    public Man(String name, String gender, int age, int money) {
        super(name, gender, age);
        this.money = money;
    }

    public void workMan() {
        System.out.println("男生工作,工资：" + money);
    }

    // 重写父类的方法
    public void sleeps() {
        System.out.println("Man正在睡觉");
        //在子类中，调用父类中被重写的方法
        super.sleeps();
    }
}
