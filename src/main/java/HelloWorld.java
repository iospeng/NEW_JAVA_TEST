package main.java;

import main.java.employee.EmPloyee;

public class HelloWorld {
    static int a = 1;
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("修改前的a: " + a);
        a = 2;
        System.out.println("修改后的a: " + a);
        //实例化对象
        EmPloyee employ = new EmPloyee("张三");
        EmPloyee employ1 = new EmPloyee("李四");
        employ.sta = 100;
        employ1.sta = 50;

        System.out.println("对象1的sta: " + employ.sta);
        System.out.println("对象2的sta: " + employ1.sta);

        employ.empAge(25);
        employ.empDesignation("员工");
        employ.empSalary(1000);
        employ.printEmployee();
        System.out.println("return:"+employ.empPr());

        employ1.empAge(30);
        employ1.empDesignation("经理");
        employ1.empSalary(10000);
        employ1.printEmployee();
        System.out.println("return:"+employ1.empPr());
        employ1.testWhile();
        employ1.testString();


    }
}
