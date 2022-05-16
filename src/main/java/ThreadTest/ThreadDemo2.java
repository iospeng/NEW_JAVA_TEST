package main.java.ThreadTest;

/**
 * 多线程 方式二
 * 方式二：实现Runnable接口
 * 实现
 * 定义一个线程任务类MyRunnable实现Runnable接口，重写runn()方法
 * 创建MyRunnable任务对象
 * 把Myrunnable任务对象交给Thread处理
 * 调用线程对象的start()方法启动线程
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建Runable任务对象
        Runnable ra = new MyRunnable();
        //创建线程对象，将Runable任务对象交给Thread对象处理
        Thread tr = new Thread(ra);
        tr.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行：" + i);
        }
    }
}
