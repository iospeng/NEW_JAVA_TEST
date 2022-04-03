package main.java.employee.KingDemo;

public class StatsKing {
    /*
    斗地主游戏
        1. 初始化54张牌，使用静态代码块
        2.打乱牌的顺序
        3.定义三个玩家，发牌
        4.给玩家的牌排序
        5.输出三个玩家的牌和底牌
     */

    public static void main(String[] args) {
        StatsPoker sp = new StatsPoker();
        //调用洗牌方法洗牌
        sp.shufflePoker();
        //调用发牌方法发牌
        sp.goPoker();

        System.out.println("地主手牌：" + sp.getKingCard());
        System.out.println("农民1手牌：" + sp.getOneCard());
        System.out.println("农民2手牌：" + sp.getTwoCard());
        System.out.println("底牌：" + sp.getStayCard());

        //初始化地主对象
//        Kins ks = new Kins("地主",sp.getKingCard());
//        //初始化农民1对象
//        Kins ks1 = new Kins("农民1",sp.getOneCard());
//        //初始化农民2
//        Kins ks2 = new Kins("农民2",sp.getTwoPokerArr());
//        System.out.println(ks);
//        System.out.println(ks1);
//        System.out.println(ks2);
//        System.out.println("底牌：" + sp.getStayArr());

    }
}
