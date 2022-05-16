package main.java.ThreadTest.safatyCase1;

/**
 * 解决线程安全问题的几种方式
 * 方法二：同步方法
 * 原理：使用synchronized修饰核心方法
 * 底层原理
 * 同步方法其实底层也是有隐式锁对象的，只是所得范围是整个方法代码
 * 如果方法是实例方法：同步方法默认用this作为锁的对象。但是代码要高度面向对象
 * 如果方法是静态方法：同步方法默认用 类名.class作为锁的对象
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
    public synchronized void drawMoney(double money){
        //获取线程名字
        String name = Thread.currentThread().getName();
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
