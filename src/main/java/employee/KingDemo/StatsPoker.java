package main.java.employee.KingDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StatsPoker {
    // 保存初始化好的牌
    private static List<Card> allCard = new ArrayList<>();
    private List<Card> oneCard = new ArrayList<>();
    private List<Card> twoCard = new ArrayList<>();
    private List<Card> kingCard = new ArrayList<>();
    private List<Card > stayCard = new ArrayList<>();

//    private static List<Card> allCard = new ArrayList<>();

    static {
        String[] poker = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"♠","♥","♣","♦"};
        int index = 0;
//        for (int i = 0; i < poker.length; i++) {
//            index++;
//            for (int j = 0; j < color.length; j++) {
//                Card car = new Card(poker[i],color[j],index);
//                allCard.add(car);
//            }
//        }
        for (String s : poker) {
            index++;
            for (String s1 : color) {
                Card car = new Card(s,s1,index);
                allCard.add(car);
            }
        }
        //将大小王放入牌对象集合中
        Collections.addAll(allCard,new Card("","小王",++index),new Card("","大王",++index));
        System.out.println("新牌：" + allCard);
    }

    public List<Card> getOneCard() {
        return oneCard;
    }

    public List<Card> getTwoCard() {
        return twoCard;
    }

    public List<Card> getKingCard() {
        return kingCard;
    }

    public List<Card> getStayCard() {
        return stayCard;
    }

    //洗牌
    public void shufflePoker(){
        Collections.shuffle(allCard);
        System.out.println("洗牌后：" + allCard);
    }
    //发牌
    public void goPoker(){
        int num = 0 ;
        for (int i = 0; i < allCard.size()-3; i++) {
//            if (num == 0){
//                kingCard.add(allCard.get(i));
//                num = 1;
//            }else if (num == 1){
//                oneCard.add(allCard.get(i));
//                num = 2;
//            }else {
//                twoCard.add(allCard.get(i));
//                num = 0;
//            }
            if (i % 3 == 0){
                kingCard.add(allCard.get(i));
            }else if (i % 3 == 1){
                oneCard.add(allCard.get(i));
            }else if(i % 3 == 2){
                twoCard.add(allCard.get(i));
            }
        }
        //底牌
//        for (int i = 0; i < 3; i++) {
//            stayArr.add(allCard.get(allCard.size()-1-i));
//        }
        //截取allCard集合的最后三个元素称为一个新的集合
        stayCard = allCard.subList(allCard.size()-3,allCard.size());

        //发牌后排序
        sortCard(kingCard);
        sortCard(oneCard);
        sortCard(twoCard);

    }
    //排序
    public void sortCard(List<Card> list){
        Collections.sort(list, (Card o1, Card o2) -> o2.getIndex() - o1.getIndex());
    }
}
