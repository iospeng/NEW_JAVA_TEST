package main.java.File_IO_test;

/**
 * ⽬标：⾮规律化递归
 * 啤酒问题
 * ⼀个⼈有10元钱，⼀瓶啤酒2元，2个瓶⼦可以换⼀瓶酒，4个盖⼦可以换⼀瓶酒，
 * 问:喝酒总数和剩余瓶⼦数和剩余盖⼦数
 * 答案 15 1 3
 */

public class buyWine {
    //定义静态变量保存 买酒数，剩余瓶子数，剩余瓶盖数
    public static int totalNumber;//酒的总数
    public static int lastBottelNumber;//剩余瓶子数
    public static int lastCoverNumber;//剩余瓶盖数

    public static void main(String[] args) {
        buy(10);
        System.out.println("总数：" + totalNumber);
        System.out.println("剩余瓶子数：" + lastBottelNumber);
        System.out.println("剩余瓶盖数：" + lastCoverNumber);
    }
    public static void buy(int money){
        //计算10块钱可以卖多少瓶酒，并记录买酒数，本轮瓶子数，本轮瓶盖数
        int bugNumber = money / 2;
        totalNumber += bugNumber;
        int bottelNumber = bugNumber + lastBottelNumber;
        int CoverNumber = bugNumber + lastCoverNumber;

        //将剩余的瓶子、瓶盖换算成钱,并记录所有换算的钱
        int allMoney = 0;
        if (bottelNumber >= 2){
            allMoney += (bottelNumber / 2) * 2;
        }
        //记录没有换算完的瓶子数
        lastBottelNumber = bottelNumber % 2;
        if (CoverNumber >= 4){
            allMoney += (CoverNumber / 4) * 2;
        }
        //记录没有换算完的盖子数
        lastCoverNumber = CoverNumber % 4;

        //如果，换算后的钱大于等于一瓶就的钱则开始递归
        if (allMoney >= 2){
            buy(allMoney);
        }
    }
}
