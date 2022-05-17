package main.java.ThreadTest.TheradPool;

/**
 * 线程池
 *
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "输出了：" + i);
        }
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
