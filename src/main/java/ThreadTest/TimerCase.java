package main.java.ThreadTest;

import java.util.Timer;
import java.util.TimerTask;

/**
 * timer 定时器
 */

public class TimerCase {
    public static void main(String[] args) {
        //创建定时器
        Timer times = new Timer(); //定时器本身就是一个单线程
        //调用定时器，处理任务
        times.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "定时器执行了一次");
            }
        },3000,2000);
    }
}
