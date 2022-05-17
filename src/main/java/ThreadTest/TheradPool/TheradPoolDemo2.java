package main.java.ThreadTest.TheradPool;

import java.util.Calendar;
import java.util.concurrent.*;

/**
 *创建线程池的几中方式
 *  方式一：
 *  线程池处理Callable任务
 */

public class TheradPoolDemo2 {
    public static void main(String[] args) throws Exception {
        //创建线程池
        ExecutorService pool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        //创建Callable线程任务对象
        Callable<String> ca1 = new MyCallable(100);
        Callable<String> ca2 = new MyCallable(100);
        Callable<String> ca3 = new MyCallable(100);
        Callable<String> ca4 = new MyCallable(100);

        //将Callable线程任务对象通过submit()方法交给线程池处理,并定义未来线程任务对象接收返回值
        Future<String> ft1 = pool.submit(ca1);
        Future<String> ft2 = pool.submit(ca2);
        Future<String> ft3 = pool.submit(ca3);
        Future<String> ft4 = pool.submit(ca4);

        System.out.println(ft1.get());
        System.out.println(ft2.get());
        System.out.println(ft3.get());
        System.out.println(ft4.get());
    }

}
