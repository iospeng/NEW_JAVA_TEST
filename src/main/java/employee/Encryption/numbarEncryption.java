package main.java.employee.Encryption;

/*
    数字加密
    1、每一位数加5
    2、然后每一位数分别对10取余
    3、最后将数据反转保存
 */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class numbarEncryption {
    //加密    解密也是此方法
    public void numEncryption(String str){
        int [] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        //第一步、第二步
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
            arr[i] = arr[i] % 10;
        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (arr[i] + 5) %10;
//        }
//        //第三步反转数组
        for (int i = 0; i < arr.length/2; i++) {
            int num = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = num;
        }
//        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
//            int num = arr[j];
//            arr[j] = arr[i];
//            arr[i] = num;
//        }

        for (int i :arr) {
            System.out.print(i);
        }

    }

    //解密
    public void decrypt(String str){
        int [] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        //第三步反转数组
        for (int i = 0; i < arr.length/2; i++) {
            int num = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = num;
        }
        //第二步
        for (int i = 0; i < arr.length; i++) {
            int s = arr[i]*10;
            if (s -5 > 10){
                arr[i] = s%10-5;
            }else {
                arr[i] = arr[i]*10+arr[i]-5;
            }
        }
        for (int i : arr){
            System.out.println(i);
        }

    }

}
