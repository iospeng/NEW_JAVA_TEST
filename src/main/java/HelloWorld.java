package main.java;

import main.java.customException.IntSizeOutException;
import main.java.employee.EmPloyee;
import main.java.employee.Man;
import main.java.employee.Person;
import main.java.employee.WoMan;

import java.io.IOException;

public class HelloWorld {
    static int a = 1;
    public static void main(String[] args) throws IOException {
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

        employ.dateTime();
        employ.input();
        employ.ioInput();
        try {
            employ.exceptions();
        }catch (IntSizeOutException e){
            System.out.println("第一个数小于第二个数：" + e.getNum());
            e.printStackTrace();
        }
        //继承
        Person ps = new Person("张三","男",26);
        ps.hello();
        Man man = new Man("王五","男",25,10000);
        man.hello();
        man.workMan();
        WoMan wm = new WoMan("李四","女",23);
        wm.hello();
        wm.woManCook();
    }
}
