package main.java.File_IO_test;

import javax.security.auth.login.CredentialNotFoundException;

/**
 * 题目：
 * 猴子第一天吃了若干个桃子，当即吃了一半，还不解馋，又多吃了一个；
 * * 第二天，吃剩下的桃子的一半，还不过瘾，又多吃了一个；
 * * 以后每天都吃前一天剩下的一半多一个，
 * * 到第10天想再吃时，只剩下一个桃子了。问第一天共摘了多少个桃子？
 *
 * 数学思路
 * 一共摘了x个桃子
 * 第一天吃了 x/2+1
 * 第一天剩下 x/2-1
 * x-(x/2+1)=x/2-1
 *
 * 递归思路公式
 *f(x) 递归方法 返回某一天的桃子数量
 * x 为第几天 x=1 就是第一天
 * 第10天 f(10) = 1
 * f(x=1)为第一天的桃子数量
 * f(x)/2-1=f(x+1)
 * f(x)-2=2f(x+1)
 * f(x)=2f(x+1)+2
 */

public class monkeyEatPeaches {
    public static void main(String[] args) {
        System.out.println(f(1));
    }
    public static int f(int x){
        if (x == 10) return 1;
        return  2 * f(x+1)+2;
        /**
         * 2*f(1+1)+2 = 2*766+2
         * 2*f(2+1)+2 = 2*382+2
         * 2*f(3+1)+2 = 2*190+2
         * 2*f(4+1)+2 = 2*94+2
         * 2*f(5+1)+2 = 2*46+2
         * 2*f(6+1)+2 = 2*22+2
         * 2*f(7+1)+2 = 2*10+2
         * 2*f(8+1)+2 = 2*4+2
         * 2*f(9+1)+2 = 2*1+2
         *f(10) = 1
         */
    }
}
