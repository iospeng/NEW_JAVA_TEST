package main.java.employee.MapTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Mapdemo1 {
    /*
        案例
        统计80个ABCD分别出现次数，并用map集合存储
        1.使用随机数随机生成80次ABCD,使用StringBuilder拼接起来
        2.统计ABCD出现次数，存入Map集合
     */
    public static void main(String[] args) {
        String[] strArr = {"A","B","C","D"};
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        // 随机生成ABCD 并且拼接到Sb中
        for (int i = 0; i < 80; i++) {
            sb.append(strArr[r.nextInt(strArr.length)]);
        }
        System.out.println(sb);

        Map<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            // 判断Map集合中是否存在该键，如果存在则改键的值+1
            // 若不存在，则把该键放进集合中，切值复为1；
            if (mp.containsKey(ch)){
                mp.put(ch,mp.get(ch) + 1);
            }else {
                mp.put(ch,1);
            }
        }
        System.out.println(mp);

    }
}
