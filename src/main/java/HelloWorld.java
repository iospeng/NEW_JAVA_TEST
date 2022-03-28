package main.java;

import main.java.customException.IntSizeOutException;
import main.java.employee.*;
import main.java.employee.Reflex.ReflexCase;
import main.java.employee.Reflex.testPersongReflex;
import main.java.employee.Sport.testCase;
import main.java.employee.StudentAdmin.StudentOperation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    int a = 1;
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello World");
//        System.out.println("修改前的a: " + a);
//        a = 2;
//        System.out.println("修改后的a: " + a);
//        //实例化对象
//        EmPloyee employ = new EmPloyee("张三");
//        EmPloyee employ1 = new EmPloyee("李四");
//        employ.sta = 100;
//        employ1.sta = 50;
//
//        System.out.println("对象1的sta: " + employ.sta);
//        System.out.println("对象2的sta: " + employ1.sta);
//
//        employ.empAge(25);
//        employ.empDesignation("员工");
//        employ.empSalary(1000);
//        employ.printEmployee();
//        System.out.println("return:" + employ.empPr());
//
//        employ1.empAge(30);
//        employ1.empDesignation("经理");
//        employ1.empSalary(10000);
//        employ1.printEmployee();
//        System.out.println("return:" + employ1.empPr());
//        employ1.testWhile();
//        employ1.testInt();
//        employ1.testString();
//
//        employ.dateTime();
//        employ.input();
//        employ.ioInput();
//        try {
//            employ.exceptions();
//        } catch (IntSizeOutException e) {
//            System.out.println("第一个数小于第二个数：" + e.getNum());
//            e.printStackTrace();
//        }
//        //继承
//        Person ps = new Person("张三", "男", 26);
//        ps.hello();
//        Man man = new Man("王五", "男", 25, 10000);
//        man.hello();
//        man.sleeps();
//        man.workMan();
//        WoMan wm = new WoMan("李四", "女", 23);
//        wm.hello();
//        wm.woManCook();
//        wm.woManCook();
//        wm.woManCook("woman");
//        //接口类
//        ExamleOfInterface eoi = new ExamleOfInterface();
//        eoi.eat();
//        ExamlePersonOfInterface person = new ExamlePersonOfInterface();
//        person.personName("person");
//        person.eat();
//        person.work();
//        ExamleManOfInterface mans = new ExamleManOfInterface();
//        mans.manName("man");
//        mans.personName("man person");
//        mans.eat();
//        mans.work();
//        // 接口实现类中重载方法
//        mans.gitMax("String");
//        mans.gitMax(1, 2);
//        ExamleWoManOfInterface WoMan = new ExamleWoManOfInterface();
//        WoMan.WoManName();
//        WoMan.dog();
//        WoMan.work();
//        WoMan.eat();
//        ColorTest ct = new ColorTest();
//        ct.choice();
//        ListTest lt = new ListTest();
//        lt.LinkedTests();
//        lt.ArrayListTest();
//        lt.HashSetTest();
//
//
//        TestCase tc = new TestCase();
//        tc.sum();
//        StudentOperation sop = new StudentOperation();
//        sop.home();
        //运动员学习功能 运用接口、抽象类
//        testCase tc = new testCase();
//        tc.TableTennisCoach();
//        tc.TableTennisAthletes();
//        tc.BasketballCoach();
//        tc.BasketballAthletes();
//        testPersongReflex tpr = new testPersongReflex();
//        tpr.testReflex();
        //反射实例
//        ReflexCase rc = new ReflexCase();
//        rc.testCase();
        String num = "";
        Random sc = new Random();
        String date = "abcdefg123456";
        for (int i = 0; i < 5; i++) {
            int index = sc.nextInt(date.length());
            num += date.charAt(index);
        }
        System.out.println(num);

        String strss = "123@qq.com";
        System.out.println(strss.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}"));

    }
}