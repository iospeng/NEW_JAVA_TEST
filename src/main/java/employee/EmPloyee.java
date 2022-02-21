package main.java.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EmPloyee {
    String name;
    int age;
    String designation;
    double salary;
    int a = 0146;
    int b = 0x64;
    char c = 'a';
    public static int sta = 1;
    String [][] sArr = {{"abc","cdf"},{"123","456"}};
    String [] arrS = new String[3];
    public EmPloyee(String name){
        this.name = name;
    }
    public void empAge(int empAge){
        age = empAge;
    }
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    public int empPr(){
        return age;
    }
    public void printEmployee(){
        System.out.println("employee:name:" + name);
        System.out.println("employee:age:" + age);
        System.out.println("employee:designation:" + designation);
        System.out.println("employee:salary:" + salary);
        System.out.println("8进制：a(0146) = " + a);
        System.out.println("16进制：b(0x64) = " + b);
        System.out.println("char: c = " + c);

    }
    public void testWhile(){
        Integer w = 0;
        while (w < 5){
            System.out.println("while++前：" + w);
            w++;
            System.out.println("while++后:" + w);
        }

        do{
            System.out.println("do..while--前" + w);
            w--;
            System.out.println("do...while--后" + w);
        }while (w>=0);

        for(int i = 5; i > w;){
            System.out.println("for++前" + w);
            w++;
            System.out.println("for++后" + w);
        }
        //增强for循环
        int [] x = {1,2,3,4,5};
        for(int i : x){
            System.out.println("x = " + x[i-1]);
            System.out.println("i = " + i);
            if (i == 3){
                break;
            }
        }

        do{
            w++;
            if (w == 7){
                continue;
            }
            System.out.println("coutinue: w = " + w);
        }while (w<10);

        switch (w){
            case 7 : {
                System.out.println("switch case : " + w);
            }
            case 9 : {
                System.out.println("switch case : " + w);
            }
            case 10 : {
                System.out.println("switch case : " + w);
                break;
            }
            default:{
                System.out.println("switch default : " + w);
            }
        }
    }
    public void testString(){
        sArr[1][1] = "1";
        arrS[0] = "2";
        char [] str = {'a','b','c'};
        String strArr = new String(str);
        String strAnd = "Ab123";
        int ingStr = 1;
        System.out.println("字符数组转String:" + strArr);
        System.out.println("字符串长度strArr：" + strArr.length());
        System.out.println("字符串拼接：strArr+strAnd : " + strArr.concat(strAnd));
        System.out.println("使用 + 拼接字符串strArr+strAnd ： " + strArr + strAnd);
        System.out.println("输出int：%f" + "输出字符串：%d" + ingStr + strArr);
        System.out.format("使用format输出int：%d " + "输出字符串：%s\n" , ingStr , strArr);
        System.out.printf("使用pringf输出int: %d " + "输出字符串：%s\n" , ingStr, strArr);
        System.out.println("返回字符串strArrd的第二个字符：" + strArr.charAt(1));
        System.out.println("比较两个字符串的ASCLL码值大小：" + strArr.compareTo(strAnd));
        System.out.println("比较两个字符串是否相同：" + strArr.contentEquals("abc"));
        System.out.println("判断字符串是否以指定字符串结尾：" + strAnd.endsWith("23"));
        System.out.println("equals比较两个字符串是否相同区分大小写：" + strAnd.equals("A123"));
        System.out.println("equalsIgnoreCase比较两个字符串是否相同不区分大小写：" + strAnd.equalsIgnoreCase("A123"));
        System.out.println("将字符串Ab123转换为小写：" + strAnd.toLowerCase());
        System.out.println("将字符串Ab123转换为大写" + strAnd.toUpperCase());
        System.out.println("判断字符串是否为空：" + strAnd.isEmpty());
        System.out.println("多维数组：" + sArr[1][1]);
        System.out.println("数组追加数据：arrS = " + arrS[1]);
        System.out.println("-----------");
    }
    public void dateTime() {
        Date date = new Date();
        // 使用SimpleDateFormat的format 格式化时间字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("使用SimpleDateFormat的format 格式化时间字符串-当前时间为：" + sdf.format(date));
        // 使用printf格式化字符串
        System.out.printf("tc包含全部日期信息-当前时间为：%tc\n", date);
        System.out.printf("tF'年-月-日'格式，只展示日期-当前时间为：%tF\n", date);
        System.out.printf("tD'年/月/日'格式，只展示日期-当前时间为：%tD\n", date);
        System.out.printf("tr'HH:MM:SS PM'格式，以12小时制展示且只展示时间-当前时间为：%tr\n", date);
        System.out.printf("tT'HH:MM:SS'格式，以24小时制展示且只展示时间-当前时间为：%tT\n", date);
        System.out.printf("tR'HH:MM'格式，以24小时制展示且只展示时分-当前时间为：%tR\n", date);

        String dateStr = "2022-03-01 15:34:01";
        try {
            // parse 将字符串解析成日期格式
            Date de = sdf.parse(dateStr);
            System.out.println(sdf.format(de));
        } catch (ParseException ignored){
            System.out.println("时间格式错误：" + sdf);
        }

        try {
            // System.currentTimeMillis 获取当前时间的时间戳，或将时间格式转换为时间戳
            long startDate = System.currentTimeMillis();
            Thread.sleep(5*60*10);
            long endDate = System.currentTimeMillis();
            long resultDate = endDate-startDate;
//            System.out.println("时间差计算："+ sdf.format(resultDate));
            System.out.println("时间差计算：" + resultDate);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
