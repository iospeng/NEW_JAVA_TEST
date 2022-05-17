package main.java.ThreadTest.TheradPool;

import java.util.concurrent.*;

/**
 *创建线程池的几中方式
 *  方式二：
 *  概述：
 * 使用Executors(线程池的工具类)调用方法返回不同特点的线程池对象
 * 方法：
 * 1.public static ExecutorService newCachedThreadPool()：线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了一段时间则会被回收掉
 * 2.public static ExecutorService newFixedThreadPool(int nThreads):创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它
 * 3.public static ExecutorService newSingleThreadExecutor():创建只有一个线程的线程池对象，如果该线程池出现异常而结束，那么线程池会补充一个新线程
 * 4.public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize):创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务
 * 注意:Executors 的底层其实也是基于线程池的额实现类ThreadPoolExecutor创建线程池对象的
 * Executors使用可能存在的问题(不适合做大型互联网场景的线程方案)
 * 大型冰法系统环境中使用Executors如果不注意可能会出现系统风险
 * 1和2：允许请求的任务队列长度是Integer.MAX_VALUE,可能出现OOM错误（java.lang.OutOfMemoryError）
 * 3和4：创建的线程数量最大上限是Integer.MAX_VALUE，线程数可能会随着任务1:1增长，也可能出现OOM错误(java.lang.OutOfMemoryError)
 */

public class TheradPoolDemo3 {
    public static void main(String[] args) throws Exception {
        //创建固定线程数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());//该线程不会执行，因为线程池中只有三个线程
    }
    
}
