package main.java.ThreadTest.safatyCase;

public class mainDamon {
    public static void main(String[] args) {
        //定义线程类，创建一个共享的账户对象
        Account acc = new Account("ID123",100);
        //创建两个线程对象，代表两个用户同时过来取钱
        new TheradClass(acc,"小明").start();
        new TheradClass(acc,"小红").start();

        //定义线程类，创建一个共享的账户对象
        Account acc1 = new Account("ID124",100);
        //创建两个线程对象，代表两个用户同时过来取钱
        new TheradClass(acc1,"小黑").start();
        new TheradClass(acc1,"小白").start();
    }
}
