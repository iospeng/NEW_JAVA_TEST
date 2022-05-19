package main.java.employee.Reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
    反射测试类
 概述/作用
    反射是指对于任何一个Class类，在”运行的时候“都可以直接得到这个类的全部成分
    在运行是，可以直接得到这个累的构造器对象：Constructor
    在运行时可以直接得到这个类的成员变量对象：Field
    在运行是可以直接得到这个类的成员方法对象：Method
    这种运行时动态获取类信息一集动态调用雷总成分的能力称为java语言的反射机制
 反射的关键
    反射的第一步都是先得到编译后的Class类对象，然后就可以得到Class的全部成分
 方法：
     forName(”报名+类名“)：通过包地址（全类名）获取class对象
     class()：通过类名直接获取class对象，类名.class
     getClass()：通过对象获取class对象，对象名.getClass()

     getConstructors()：返回所有构造器对象的数组（只能拿public的）
     getDeclaredConstructors()：返回所有构造器对象的数组，存在就能拿到
     getConstructor(Class<?>... parameterTypes)：返回单个构造器对象（只能拿public的）
     getDelaredConstructor(Class<?>... parameterTypes)：返回单个构造器对象，存在就能拿到

     getFields()：发挥所有成员变量对象的数组（只拿public的）
     getDeclaredFields()：返回所有成员变量对象的数组，存在就能拿到
     getField(String name)：返回单个成员变量对象，（只能拿public的）
     getDeclaredField(String name)：返回单个成员变量对象，存在就能拿到

     git(Object obj)：获取对象的成员变量的值
     set(Object obj,object value)：给对象的某个成员变量赋值
     getName()：获取属性的名称

     getMethods()：返回所有成员方法对象的数组(只能拿public的)
     getDeclaredMethods()：返回所有成员方法对象的数组，存在就能拿到
     getMethod(String name,Class<?>... parameterTypes):返回单个成员方法对象(只能拿public的)
     getDeclaredMethod(String name,Class<?>... parameterTypes):返回单个成员方法对象，存在就能拿到
     Object invoke(Object obj,Object...args)：运行获取到的方法
     参数一：用object对象调用该方法
     参数二：调用方法传递的参数（没有就不写）
     返回值：有返回值就用Object接收，没有可以不接(返回的是null)

 Constructor类中用于创建对象的方法
     newInstance(Object...initargs)：根据指定的构造器创建对象
     setAccessible(boolean fiag)：设置为true，标识取消访问检查，进行暴力访问
     反射可以破坏封装性，私有的也可以执行
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
