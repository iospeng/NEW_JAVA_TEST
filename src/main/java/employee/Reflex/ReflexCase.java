package main.java.employee.Reflex;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflexCase {
    public void testCase() throws Exception {
        //1.加载配置文件
        //1.1创建properties对象，即配置文件对象
        Properties per = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader loader = ReflexCase.class.getClassLoader();
        InputStream is = loader.getResourceAsStream("pro.properties");
        try {
            per.load(is);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        //2.获取配置文件中的数据
        String ClassName = per.getProperty("className");
        String MethodName = per.getProperty("methodName");

        //3.加载该类进内存
        Class cls = Class.forName(ClassName);

        // 4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(MethodName);
        //6.调用方法
        method.invoke(obj);

    }
}
