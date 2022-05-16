package main.java.ThreadTest;

/**
 * 多线程
 * 方式一：继承Thread类
 * 构造器
 * Thread(String name)：可以为当前线程指定名称
 * Thread(Runnable target)：封装Runnable对象成为线程对象
 * Thread(Runnable target, String name)：封装Runnable对象成为线程对象，并制定线程名称
 * 定义一个子类MyThread继承线程类java.lang.Thread,重写run()方法
 * 创建MyThread类的对象
 * 调用线程对象的start()方法启动现场（启动后还是执行的run方法）
 * 优缺点：
 * 优点：编码简单
 * 缺点：线程类已经继承Thread，无法继承其他类，不利于扩展
 * 为什么不直接调用run方法启动现场，而是调用start方法再调用run
 * 直接调用run方法会当成普通方法执行，此时相当于还是单线程执行
 * 只有调用start方法才是启动一个新的线程执行
 * 注意：不要把主线程的任务放在子线程之前
 * 主线程放在前面会出现：一直是先把主线程跑完，就相当于是一个单线程的效果了
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread tr = new MyThread();
        tr.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行：" + i);
        }
    }
}
