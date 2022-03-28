package main.java.employee.Objects;
/*
    测试类
 */
public class ObjectTest {
    public static void main(String[] args) {
        ObjectDemo od = new ObjectDemo("张三",20);
        ObjectDemo od1 = new ObjectDemo("李四",21);

//        System.out.println(od.toString()); //不重写toString方法，默认打出来的是类对象的地址值
//        System.out.println(od); //不重写toString方法，默认打出来的是类对象的地址值，toString可以默认不写

//        System.out.println(od.toString()); //重写toString方法，打出来的是类对象的内容
        System.out.println(od); //重写toString方法，打出来的是类对象的内容toString可以默认不写
        System.out.println(od1); //重写toString方法，打出来的是类对象的内容toString可以默认不写

//        System.out.println(od.equals(od1)); //不重写equals方法，默认比较的是地址值
        System.out.println(od.equals(od1)); //不重写equals方法，默认比较的是地址值
//        System.out.println(ObjectTest.class); //获取类名 从包路径查找
//        System.out.println(ObjectDemo.class); //获取类名 从包路径查找


    }
}
