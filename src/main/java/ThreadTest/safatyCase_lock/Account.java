package main.java.ThreadTest.safatyCase_lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的几种方式
 * 方法三：Lock锁
 * api
 * lock()：上锁
 * unlock()：解锁
 * 格式
 * 建议锁对象定义成实例成员变量，并用final修饰成唯一不可修改的
 * public final Lock lock = new ReentrantLock();
 * lock.lock();//上锁
 * lock.unlock();//解锁
 */

public class Account {
    private String cardID;
    private double money;
    //唯一的不可修改的锁
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    //取钱
    public void drawMoney(double money) {
        //获取线程名字
        String name = Thread.currentThread().getName();
        lock.lock();//上锁
        try {
            //判断账户余额是否足够
            if (this.money >= money) {
                System.out.println(name + "成功取出：" + money);
                this.money -= money;
                System.out.println(name + "账户剩余：" + this.money);
            } else {
                System.out.println(name + "取钱账户余额不足");
            }
        } finally {
            lock.unlock();//解锁
        }
    }

}
