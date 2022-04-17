package main.java.customException;
/**
 * 自定义异常类，并调用，捕捉到异常后抛出异常
 * 1、继承Exception
 * 2、重写构造器
 * */
public class IntSizeOutException extends Exception {
    private double num;

    public IntSizeOutException(String message) {
        super(message);
    }

    public IntSizeOutException(double maxnum){
        this.num = maxnum;
    }
    public double getNum(){
        return num;
    }
}
