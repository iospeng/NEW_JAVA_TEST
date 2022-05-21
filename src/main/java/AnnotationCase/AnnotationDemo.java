package main.java.AnnotationCase;

import org.junit.Test;

import java.lang.reflect.Method;

public class AnnotationDemo {
    @Test
    public void testMyBookType(){
        //获取使用注解的类对象
        Class c = useAnnotation.class;
        //判断是否使用注解
        if (c.isAnnotationPresent(MyBook.class)){
            //获取注解对象
            MyBook m = (MyBook) c.getDeclaredAnnotation(MyBook.class);
            //获取注解属性值
            System.out.println(m.value());
            System.out.println(m.author());
            System.out.println(m.price());
        }
    }
    @Test
    public void testMyBookMethod(){
        try {
            //获取使用注解的类的对象
            Class c = useAnnotation.class;
            //获取使用注解的方法的对象
            Method m = c.getDeclaredMethod("seeBook");
            //判断是否使用注解
            if (m.isAnnotationPresent(MyBook.class)){
                //获取注解对象
                MyBook myBook = m.getDeclaredAnnotation(MyBook.class);
                System.out.println(myBook.value());
                System.out.println(myBook.author());
                System.out.println(myBook.price());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
