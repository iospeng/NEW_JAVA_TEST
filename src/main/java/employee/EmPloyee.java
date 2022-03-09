package main.java.employee;

import main.java.customException.IntSizeOutException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EmPloyee {
    String name;
    int age;
    String designation;
    double salary;
    int a = 0146;
    int b = 0x64;
    char c = 'a';
    public static int sta = 1;
    String[][] sArr = {{"abc", "cdf"}, {"123", "456"}};
    String[] arrS = new String[3];

    public EmPloyee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public int empPr() {
        return age;
    }

    public void printEmployee() {
        System.out.println("employee:name:" + name);
        System.out.println("employee:age:" + age);
        System.out.println("employee:designation:" + designation);
        System.out.println("employee:salary:" + salary);
        System.out.println("8进制：a(0146) = " + a);
        System.out.println("16进制：b(0x64) = " + b);
        System.out.println("char: c = " + c);

    }

    public void testWhile() {
        Integer w = 0;
        while (w < 5) {
            System.out.println("while++前：" + w);
            w++;
            System.out.println("while++后:" + w);
        }

        do {
            System.out.println("do..while--前" + w);
            w--;
            System.out.println("do...while--后" + w);
        } while (w >= 0);

        for (int i = 5; i > w; ) {
            System.out.println("for++前" + w);
            w++;
            System.out.println("for++后" + w);
        }
        //增强for循环
        int[] x = {1, 2, 3, 4, 5};
        for (int i : x) {
            System.out.println("x = " + x[i - 1]);
            System.out.println("i = " + i);
            if (i == 3) {
                break;
            }
        }

        do {
            w++;
            if (w == 7) {
                continue;
            }
            System.out.println("coutinue: w = " + w);
        } while (w < 10);

        switch (w) {
            case 7: {
                System.out.println("switch case : " + w);
            }
            case 9: {
                System.out.println("switch case : " + w);
            }
            case 10: {
                System.out.println("switch case : " + w);
                break;
            }
            default: {
                System.out.println("switch default : " + w);
            }
        }
    }

    public void testString() {
        sArr[1][1] = "1";
        arrS[0] = "2";
        char[] str = {'a', 'b', 'c'};
        String strArr = new String(str);
        String strAnd = "Ab123";
        int ingStr = 1;
        System.out.println("字符数组转String:" + strArr);
        System.out.println("字符串长度strArr：" + strArr.length());
        System.out.println("字符串拼接：strArr+strAnd : " + strArr.concat(strAnd));
        System.out.println("使用 + 拼接字符串strArr+strAnd ： " + strArr + strAnd);
        System.out.println("输出int：%f" + "输出字符串：%d" + ingStr + strArr);
        System.out.format("使用format输出int：%d " + "输出字符串：%s\n", ingStr, strArr);
        System.out.printf("使用pringf输出int: %d " + "输出字符串：%s\n", ingStr, strArr);
        System.out.println("返回字符串strArrd的第二个字符：" + strArr.charAt(1));
        System.out.println("比较两个字符串的ASCLL码值大小：" + strArr.compareTo(strAnd));
        System.out.println("比较两个字符串是否相同：" + strArr.contentEquals("abc"));
        System.out.println("判断字符串是否以指定字符串结尾：" + strAnd.endsWith("23"));
        System.out.println("equals比较两个字符串是否相同区分大小写：" + strAnd.equals("A123"));
        System.out.println("equalsIgnoreCase比较两个字符串是否相同不区分大小写：" + strAnd.equalsIgnoreCase("A123"));
        System.out.println("将字符串Ab123转换为小写：" + strAnd.toLowerCase());
        System.out.println("将字符串Ab123转换为大写" + strAnd.toUpperCase());
        System.out.println("判断字符串：strAnd是否包含字符串ab:" + strAnd.contains("123"));
        System.out.println("判断字符串是否为空：" + strAnd.isEmpty());
        System.out.println("多维数组：" + sArr[1][1]);
        System.out.println("数组追加数据：arrS = " + arrS[1]);
        System.out.println("-----------");

        int[] Iarr = {5, 3, 3, 3, 5, 6, 2};
        int time = 2;
        int num = 0;
        // 可变数组 ArrayList
        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        for (int i = 0; i < Iarr.length; i++) {
            num++;
            int l = num - time;
            int r = Iarr.length - num - time;
            if (l >= 0 & r >= 0) {
                for (int j = 0; j < Iarr.length / 2; j++) {
                    int lj = Iarr[j];
                    int rj = Iarr[j + 1];
                    int ln = Iarr[Iarr.length - num];
                    int rn = Iarr[Iarr.length - (num + 1)];

                    if (lj > rj & ln > rn) {
                        System.out.println("第" + num + "天适合打劫，当天守卫人数为：" + Iarr[num - 1]);
                        intArrList.add(num);
                    }
                }
            }
        }
        System.out.println("适合打劫的天数数组：" + intArrList);
        int nums = 8;
        for (int i = 0; i < Iarr.length; i++) {
            for (int j = i + 1; j < Iarr.length; j++)
                if (Iarr[i] + Iarr[j] == nums) {
                    System.out.println(i + "," + j);
                }
        }
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

        String dateStr = "2022-03-28 15:34:01";
        String dateTwo = "2022-02-28 15:34:01";
        try {
            // parse 将字符串解析成日期格式
            Date deOne = sdf.parse(dateStr);
            Date deTwo = sdf.parse(dateTwo);
            System.out.println(sdf.format(deOne));
            System.out.println("时间格式转换为时间戳(毫秒级)" + deOne.getTime());
            int comPare = deOne.compareTo(deTwo);

            if (comPare > 0) {
                System.out.println("compareTo时间比较：deOne > deTwo");
            } else if (comPare < 0) {
                System.out.println("compareTo时间比较：deOne < deTwo");
            } else {
                System.out.println("compareTo时间比较：deOne = deTwo");
            }

            if (deOne.after(deTwo)) {
                System.out.println("after时间比较(deOne必须大于deTwo)：deOne > deTwo");
            } else {
                System.out.println("after时间比较(deOne必须大于deTwo)：deOne <= deTwo");
            }

            if (deOne.before(deTwo)) {
                System.out.println("before时间比较(deOne必须小于deTwo)：deOne < deTwo");
            } else {
                System.out.println("before时间比较(deOne必须小于deTwo)：deOne >= deTwo");
            }

        } catch (ParseException ignored) {
            System.out.println("时间格式错误：" + sdf);
        }

        try {
            // System.currentTimeMillis 获取当前时间的时间戳，或将时间格式转换为时间戳
            long startDate = System.currentTimeMillis();
            Thread.sleep(5 * 60 * 10);
            long endDate = System.currentTimeMillis();
            long resultDate = endDate - startDate;
//            System.out.println("时间差计算："+ sdf.format(resultDate));
            System.out.println("时间差计算sleep3秒：" + resultDate / 1000);
            System.out.println("时间戳转换为时间：" + sdf.format(endDate));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bak:
        for (int i = 0; i < 10; i++) {
            System.out.println("外循环：" + i);
            for (int n = 0; n < 10; n++) {
                System.out.println("内循环：" + n);
                if (n > 5 & i > 2) {
                    System.out.println("break取别名跳出外循环");
                    break bak;
                }
            }
        }
        System.out.println("----------------");
    }

    public void input() throws IOException {
        /**
         * 两种获取控制台输入的方式
         * 1.ByfferedReader类
         * 2.Scanner类
         * */
        // read readLine 不能同时使用
//        BufferedReader BufDer = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("请输入字符：");
//        char c = (char)BufDer.read();
//        System.out.println(c);
//        System.out.print("请输入字符串：");
//        String str = BufDer.readLine();
//        System.out.println(str);

//        Scanner scan = new Scanner(System.in);
//        String str1 = null;
//        System.out.println("请输入类容：");
//        if (scan.hasNextLine()){
//            str1 = scan.nextLine();
//            System.out.println("您输入的内容：" + str1);
//        }
//        System.out.println("请输入整数：");
//        if (scan.hasNextInt()){
//            int i = scan.nextInt();
//            System.out.println("您输入的整数：" + i);
//        }else {
//            System.out.println("请输入整数");
//        }

    }

    public void ioInput() throws IOException {
        String filestr = "123456";
        // 构建FileOutputStream对象,文件不存在会自动新建
        FileOutputStream fops = new FileOutputStream("test.txt");
        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        OutputStreamWriter writer = new OutputStreamWriter(fops, StandardCharsets.UTF_8);
        //调用append写入缓冲区
        writer.append(filestr);
        writer.append("\nhelloword");
        //关闭输入流，并将缓冲区内容写入文件
        writer.close();
        // 关闭输出流,释放系统资源
        fops.close();

        // 构建FileInputStream对象,指定读取文件路径
        FileInputStream fips = new FileInputStream("test.txt");
        // 构建InputStreamReader对象,编码与写入相同，设置读取格式
        InputStreamReader Ipsr = new InputStreamReader(fips, StandardCharsets.UTF_8);
        // 创建StringBuffer 字符串对象，用于存储读取内容
        StringBuffer strB = new StringBuffer();
        /**
         * 循环读取文件内容，并放入StrB中，读取一次只读取一个字符
         * ready（）返回布尔值，文件不为空返回true，否则返回false
         */

        while (Ipsr.ready()) {
            strB.append((char) Ipsr.read());
        }
        System.out.println(strB);
        Ipsr.close();
        fips.close();

    }

    public void exceptions() throws IntSizeOutException {
        int[] arrInt = {1, 2, 3};
        try {
            System.out.println(arrInt[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        //调用自定义异常类
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        double numOne = scan.nextDouble();
        System.out.println("请输入第二个整数");
        double numTwo = scan.nextDouble();
        if (numOne >= numTwo) {
            System.out.println("第一个数小于等于第二个数");
        } else {
            double needs = numOne - numTwo;
            // 使用throw 抛出异常
            throw new IntSizeOutException(needs);
        }
    }

}
