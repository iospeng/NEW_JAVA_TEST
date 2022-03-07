package main.java.employee;

public class Person {
    private String name;
    private String gender;
    private int age;
    public Person(String name,String gender ,int age){
        this.name = name;
        this.gender = gender;
        this.age    = age;
    }
    public void eat(){
        System.out.println("正在吃。。。。");
    }
    public void sleeps(){
        System.out.println("正在睡觉");
    }
    public void hello(){
        System.out.println("我是" + name + "今年" + age);
    }

}
