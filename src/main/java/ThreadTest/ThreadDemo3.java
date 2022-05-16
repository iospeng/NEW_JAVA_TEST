package main.java.ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * 多线程
 *方式三：实现Callable、FutureTask接口，jdk5.0以后
 * 作用目的：
 * 让run方法可以直接返回结果
 * 实现
 * 得到任务对象
 * 定义类实现Callable接口，重写call方法，封装要做的事情，应该声明线程任务执行完毕后的结果数据类型
 * 用FutureTask把Callable对象封装成线程任务对象
 * 把线程任务对象交给Thread处理
 * 调用Thread的Start方法启动线程，执行任务
 * 线程执行完毕后，通过FutureTask的get方法去获取任务执行的结果，get()方法会等待线程结束之后再取结果
 * 注：FutureTask对象的作用：
 * 是runnable对象（实现了Runnbale接口），可以交给Thread
 * 可以在现场执行完毕之后通过调用get方法得到线程执行完成的结果
 * 优缺点
 * 优点：
 * 线程任务类只是实现接口，可以继续继承类和实现接口，扩展性抢
 * 可以再线程执行完毕后去获取线程执行的结果
 * 缺点：编码复杂一点
 */

public class ThreadDemo3 {
    public static void main(String[] args) {
        //创建Callable任务对象
        Callable<String> callable= new MyCallable(100);
        //用Callable对象创建FutureTask对象
        FutureTask<String> fut = new FutureTask<>(callable);
        //用FutureTask对象创建Runnbale对象，使用Thread处理线程
        Thread tr = new Thread(fut);
        //然后再启动线程
        tr.start();

        Callable<String> callable1= new MyCallable(200);
        FutureTask<String> fut1 = new FutureTask<>(callable1);
        Thread tr1 = new Thread(fut1);
        tr1.start();

        //使用futureTask 的get方法获取线程执行结束后的结果，该方法会等待线程结束后再获取结果
        try {
            String str = fut.get();
            System.out.println("第一个" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String str = fut1.get();
            System.out.println("第二个" + str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
