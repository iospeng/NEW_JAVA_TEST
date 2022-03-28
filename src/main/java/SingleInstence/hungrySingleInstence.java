package main.java.SingleInstence;
/**
 * 饿汉单例
 * 在类的内部直接创建内对象，在编译时直接创建好
 * 使用静态变量接受内对象，用的时候直接使用
 * static修饰成为静态变量后，只会加载一次，所以类也只会创建一次
 * 优点：就运行速度而言，比懒汉单例快
 * 缺点：就内存而言，比懒汉单例要浪费内存，因为对象是最开始就创建好放在内存中的
 */

public class hungrySingleInstence {
    public static hungrySingleInstence hsi = new hungrySingleInstence();

    private hungrySingleInstence() {
    }
    public void print(){
        System.out.println("饿汉单例输出方法");
    }
}
