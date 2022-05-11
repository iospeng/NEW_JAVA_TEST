package main.java.File_IO_test;

/**
 * 方法递归
 *  递归算法三要素
 *      递归的公式f(n)=f(n-1)*n
 *      递归终结点：f(1)
 *      递归的方向必须走向终结点
 *
 *      f(x)/2-1=f(x+1)
 *      f(x)-2=2f(x+1)
 *      f(x)=2f(x+1)+2
 *
 */

public class recursionDemo {
    public static void main(String[] args) {
        System.out.println(recurs(6));
    }
    public static int recurs(int n){
        if (n ==1){
            return 1;
        }else {
            return recurs(n-1) *n;
        }
    }
}
