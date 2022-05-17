package main.java.ThreadTest.TheradPool;

import java.util.concurrent.*;

/**
 * 创建线程池的几中方式
 * 方式一：
 * 线程池处理Runnable任务
 * 使用ExecutorService的实现类ThreadPoolExecutor创建一个线程池对象
 * ThreadPollExecutor构造器的参数说明
 *      ThreadPollExecutor(int corePoolSize,
 *                  int maximumPoolSiez,
 *  	            long keepAliveTime,
 *  	            TimeUnit unit,
 *  	            BlockingQueue<Runnable> workQueue,
 *  	            ThreadFactory threadFactory,
 *  	            RejectedExecutionHandler handler)
 *      参数一：指定线程池的线程数量(核心线程)：corePoolSiez   不能小于0
 *      参数二：指定线程池可支持的最大线程数：maximumPoolSize  最大数量>=核心线程数
 *      参数三：指定临时线程的最大存活时间：KeepAliveTime  不能小于0
 *      参数四：指定存活时间的单位(天、时、分、秒)：unit   时间单位
 *      参数五：指定任务队列：workQueue   不能为Null
 *      参数六：指定用哪个线程工厂创建线程：ThreadFactory   不能为Null
 *      参数七：指定线程忙，任务满的时候，新任务来了怎么办：handler   不能为null
 * 临时任务什么时候创建
 *      新任务提交时发现核心任务都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时任务
 * 什么时候开始拒绝任务
 *      核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始任务拒绝。
 * 新任务拒绝策略
 *      ThreadPoolExecutor.AbortPolicy：丢弃任务并抛出RejectedExecutionException异常。是默认的策略
 *      ThreadPoolExecutor.DiscardPolicy：丢弃任务，但是不抛出异常，不推荐这种
 *      ThreadPoolExecutor.DisCardOldestPolicy：抛弃队列中等待最久的任务 然后把当前任务加入队列中
 *      ThreadPoolExecutor.CallerRunsPolicy：由主线程负责调用任务的run()
 * ExecutorService的常用方法
 *      execute(Runnable command)：执行任务/命令，没有返回值，一般用来执行Runnable任务
 *      Future<T> submit(Callable<T> task)：执行任务，返回未来任务对象获取线程结果，一般用来执行Callable任务
 *      shutdown()：等任务执行完毕，关闭线程池
 *      List<Runnable> shutdownNow()：立刻关闭，停止正在执行的任务，，并返回队列中未执行的任务
 */

public class TheradPoolDemo {
    public static void main(String[] args) {
        //创建线程池
    /*
    public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler)
     */
        ExecutorService es = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        //创建行程任务对象
        Runnable ra = new MyRunnable();
        //将任务交给线程池
        es.execute(ra);
        es.execute(ra);
        es.execute(ra);
        es.execute(ra);
        es.execute(ra);
        es.execute(ra);
        es.execute(ra);
        es.execute(ra);
        //核心线程都在忙，且任务队列超出了，开始创建临时线程
        es.execute(ra);
        es.execute(ra);
        //核心线程都在忙，临时线程也在忙，任务队列又满了，开始拒绝任务，抛异常
        es.execute(ra);
    }
}
