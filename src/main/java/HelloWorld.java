package main.java;

import main.java.SingleInstence.hungrySingleInstence;
import main.java.SingleInstence.lazySingleInstence;
import main.java.customException.IntSizeOutException;
import main.java.employee.*;
import main.java.employee.Generics.GenericsClass;
import main.java.employee.Generics.GenericsTest;
import main.java.employee.HttpInterface.GreetingServer;
import main.java.employee.HttpInterface.SocketServer;
import main.java.employee.HttpInterface.TestController;
import main.java.employee.StudentAdmin.StudentOperation;
import main.java.employee.TestTree.MyTreeClient;

import java.io.IOException;

public class HelloWorld {
    static int a = 1;

    public static void main(String[] args) throws IOException {
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
//        lt.HashMapList();
//        TestCase tc = new TestCase();
//        tc.sum();
        //学生管理系统相关
//        StudentOperation sop = new StudentOperation();
//        sop.home();
//        GenericsClass<String> gc = new GenericsClass<String>();
//        gc.printT("123");
//        GenericsClass<Integer> gcInt = new GenericsClass<Integer>();
//        gcInt.printT(123);
//        int port = Integer.parseInt(args[0]);
//        try {
//            Thread t = new GreetingServer(port);
//            t.run();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        TestController tcl = new TestController();
//        tcl.testInetAddress();
        // Socket
//        SocketServer sks = new SocketServer();
//        sks.serverS();
//        MyTreeClient mtc = new MyTreeClient();
//        mtc.treeClient();
        //单例
        hungrySingleInstence hsi = hungrySingleInstence.hsi;
        hsi.print();
        lazySingleInstence lsi = lazySingleInstence.getLazy();
        lsi.print();
    }
}
