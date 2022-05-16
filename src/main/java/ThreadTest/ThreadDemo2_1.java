package main.java.ThreadTest;

/**
 * 多线程
 * 方式二简化：实现Runnable（匿名内部类形式）
 * 实现
 * 创建Runnable的匿名内部类对象
 * 交给Thread处理
 * 调用线程对象的Start()启动线程
 */

public class ThreadDemo2_1 {
    public static void main(String[] args) {
        Thread tr = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1执行：" + i);
                }
            }
        });
        tr.start();
        //继续简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2执行：" + i);
                }
            }
        }).start();
        //再次简化
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程3执行：" + i);
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程执行：" + i);
        }
    }
}
