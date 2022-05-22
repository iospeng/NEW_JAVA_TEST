package main.java.ProxyCase;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy {
    public static StarInterface getProxy(Object obj){
        return (StarInterface) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理经纪人开始工作。。。");
                Object rs = method.invoke(obj,args);
                System.out.println("代理经纪人开始收尾");
                return rs;
            }
        });
    }
}
