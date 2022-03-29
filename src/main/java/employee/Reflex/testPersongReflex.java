package main.java.employee.Reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
    反射测试类
 */
public class testPersongReflex {
    public void testReflex() throws Exception {
        //通过全路径的方式获取类对象
        Class a = Class.forName("main.java.employee.Reflex.persong");

        // 通过类名.class的方式获取类对象
        Class persongClass = persong.class;

        // 通过类对象.getClass（）的方式获取类对象
        persong p = new persong();
        Class aClass = p.getClass();
        System.out.println(a);
        System.out.println(persongClass);
        System.out.println(aClass);

//        Field[] getFields()  获取修饰符为public的成员变量
        Field[] fields = a.getFields();
        // Field getFields() 获取指定的修饰符为public的成员变量
        Field age = a.getField("age");
        for (Field field : fields) {
            System.out.println(field);
        }
        // get方法获取成员变量
        Object o = age.get(p);
        // set方法设置成员变量值
        age.set(p,12);
        System.out.println(p);

//        Fields[] getDeclaredField(String name) 获取所有成员变量，任何类型修饰符修饰的都可以
        Field[] fs = persongClass.getDeclaredFields();
        for (Field f : fs) {
            System.out.println(f);
        }
        Field name = persongClass.getDeclaredField("name");

        //暴力反射 setAccessible(true/false) 忽略访问修饰符的安全检查
        name.setAccessible(true);
        Object o1 = name.get(p);
        name.set(p,"张三");
        System.out.println(p);

        // 获取构造方法，使用newInstance 创建对象
        Constructor persons = persongClass.getConstructor(String.class, int.class);
        Object person1 = persons.newInstance("王五", 30);
        System.out.println(person1);

        // 获取成员方法getMethod("方法名","参数类型 如String.class")
        Method eatMethod = persongClass.getMethod("eat");
        //执行方法，使用Mathod类中的invoke(对象，参数列表)方法
        eatMethod.invoke(p);
        //获取所有public修饰的方法
        Method[] getmethods = persongClass.getMethods();
        for (Method getmethod : getmethods) {
            System.out.println(getmethod);
            //获取方法名
            String name1 = eatMethod.getName();
            System.out.println(name1);
        }

        //获取类名
        String className1 = persongClass.getName();
        System.out.println(className1);

    }
}
