package main.java.employee.StreamDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeTest {
    /*
        测试类
     */
    private static double sumMoney ;
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<>();
        li.add(new Employee("张三","男",2000.5,1000,null));
        li.add(new Employee("李四","女",30000,5000,null));
        li.add(new Employee("王五","女",8000.645,2000,"迟到"));
        li.add(new Employee("赵六","男",20000,3000,"旷工"));

        List<Employee> li2 = new ArrayList<>();
        li2.add(new Employee("红中","女",30000.23,10000,null));
        li2.add(new Employee("发财","男",20000,5000,null));
        li2.add(new Employee("白班","女",8000,5000,"迟到"));
        li2.add(new Employee("幺鸡","男",50000,20000,"旷工"));

        //找到工资加奖金最多的人
//        Employee el = li.stream().max((o1, o2) -> Double.compare(o1.getSalay() + o1.getBonus(), o2.getSalay() + o2.getBonus()))
//                .get();
//        System.out.println(el);
        //将工资最高的人封装到topProformer类中
        TopProformer topProformer = li.stream().max((o1, o2) -> Double.compare(o1.getSalay() + o1.getBonus(), o2.getSalay() + o2.getBonus()))
                .map(s -> new TopProformer(s.getName(), s.getSalay() + s.getBonus())).get();
        System.out.println(topProformer);

        //求平均工资，去掉最高工资和最低工资
        //先使用sorted从低到高排序，然后跳过第一个元素，再取出集合总个数-2个元素,再遍历求和
        li.stream().sorted((o1, o2) -> Double.compare(o1.getSalay() + o1.getBonus(), o2.getSalay() + o2.getBonus()))
                .skip(1).limit(li.size()-2).forEach(employee -> {
                    sumMoney += (employee.getSalay()+employee.getBonus());
        });
        //最后再求平均值
//        System.out.println("一队每月的平均薪水：" + sumMoney/());
        //使用BigDecimal解决精度问题
        BigDecimal a = BigDecimal.valueOf(sumMoney);
        BigDecimal b = BigDecimal.valueOf(li.size()-2);
        //使用Divide方法相除，保留两位数，且四舍五入
        System.out.println("一队每月的平均薪水：" + a.divide(b,2, RoundingMode.HALF_UP));
    }
}
