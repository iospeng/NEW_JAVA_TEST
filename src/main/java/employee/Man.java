package main.java.employee;

public class Man extends Person{
    public Man(String name, String gender, int age) {
        super(name, gender, age);
    }
    public void workMan(){
        System.out.println("男生工作");
    }
}
