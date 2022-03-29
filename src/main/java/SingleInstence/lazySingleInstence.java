package main.java.SingleInstence;

/*
  懒汉单例
  调用方法创建对象，在需要是调用创建对象的方法创建对象
  创建方法需要是静态的，只被加载一次，保证不会重复创建对象
  优点：节省内存空间，只在需要时才创建对象
  缺点：就运行速度而言，比饿汉单例要慢，因为使用时需要重新创建
 */

public class lazySingleInstence {
    private static lazySingleInstence lsi;

    private lazySingleInstence() {
    }
    public static lazySingleInstence getLazy(){
        if (lsi == null){
            lsi = new lazySingleInstence();
        }
        return lsi;
    }
    public void print(){
        System.out.println("懒汉单例输出方法");
    }
}
