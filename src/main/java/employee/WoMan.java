package main.java.employee;

public class WoMan extends Person {
    public WoMan(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void woManCook() {
        System.out.println("女生做饭");
    }

    //重载父类的方法
    public void woManCook(String name){
        System.out.println(name + "正在睡觉");
    }
}
