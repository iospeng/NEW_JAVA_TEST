package main.java.ThreadTest;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 定时任务
 * 方式二
 * ScheduledExecutorService定时器
 * 概述
 * jdk1.5中引用了并发包，目的是为了弥补Timer的缺陷，ScheduledExecutorService内部为线程池
 * 方法
 * ScheduledExecutorService newScheduledThreadPool（int corePoolSize）：得到线程池对象
 * ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period,TimeUnit unit):周期调度方法
 * 优点
 * 基于线程池，某个任务的执行情况不会影响其他定时任务的执行
 */

public class ThreadTimerCase {
    public static void main(String[] args) {
        //创建定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        //启动定时器
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程开始AAA");
            }
        },0,3, TimeUnit.SECONDS);
    }
}
