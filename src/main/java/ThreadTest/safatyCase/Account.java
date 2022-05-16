package main.java.ThreadTest.safatyCase;

/**
 * 解决线程安全问题的几种方式
 * 方法一： 线程同步
 * 核心思想
 * 加锁：把共享资源进行上锁，每次只能一个线程进入，访问完毕后解锁，然后其他线程才能进来
 * 加锁方式一：同步代码块（synchronized）
 * 作用：把出现线程安全问题的核心代码给上锁
 * 原理：每次只能一个线程进入，执行完毕后自动解锁，其他线程才可以进来执行
 * 格式
 * synchronized(this){需要上锁的代码}
 * 锁对象的规范：
 * 建议使用共享资源作为对象
 * 对于实例方法建议使用this作为锁对象
 * 对于静态方法建议使用字节码（类名.class）作为锁对象
 * 注意：
 * 锁对象不能用任意唯一的对象，会影响其他无关的线程
 */

public class Account {
    private String cardID;
    private double money;

    public Account() {
    }

    public Account(String cardID, double money) {
        this.cardID = cardID;
        this.money = money;
    }

    //取钱
    public void drawMoney(double money){
        //获取线程名字
        String name = Thread.currentThread().getName();
        synchronized (this) {
            //判断账户余额是否足够
            if (this.money >= money){
                System.out.println(name + "成功取出：" + money);
                this.money -= money;
                System.out.println(name + "账户剩余：" + this.money);
            }else {
                System.out.println(name + "取钱账户余额不足");
            }
        }

    }

}
