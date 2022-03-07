package main.java.employee;

public class Man extends Person{
    private int money;
    public Man(String name, String gender, int age,int money) {
        super(name, gender, age);
        this.money = money;
    }
    public void workMan(){
        System.out.println("男生工作,工资：" + money);
    }
}
