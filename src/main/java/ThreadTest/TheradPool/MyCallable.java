package main.java.ThreadTest.TheradPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int a;

    public MyCallable(int a) {
        this.a = a;
    }

    @Override
    public String call() throws Exception {
        int num = 0;
        for (int i = 0; i <=a; i++) {
            num += i;
        }
        return Thread.currentThread().getName() + "线程执行结果" + num;
    }
}
