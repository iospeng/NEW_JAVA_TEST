package main.java;

import main.java.employee.EmPloyee;

public class HelloWorld {
    static int a = 1;
    public static void main(String[] args) {
        System.out.println("Hello World");
        //实例化对象
        EmPloyee employ = new EmPloyee("张三");
        EmPloyee employ1 = new EmPloyee("李四");

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

    }
}
