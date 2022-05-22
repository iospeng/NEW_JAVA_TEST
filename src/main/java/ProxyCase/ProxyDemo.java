package main.java.ProxyCase;

/**
 * 动态代理
 * 代理：
 * 概述：指某些场景下对昂会找一个代理对象，来辅助自己完成一些工作
 * Java创建代理对象
 * Java中代理的代表类时：java.lang.reflect.Proxy
 * Proxy提供了一个静态方法，用于为对象产生一个代理对象返回
 * 方法
 * newProxyIntance():创建代理对象
 * 参数一：(obj.getClass().getClasslassLoader())类加载器
 * 参数二：(obj.getClass().getInterfaces())被代理对象实现的接口
 * 参数三：(New InvocationHandler() )代理的核心处理流程
 * 实现流程
 * 创建接口：定义方法
 * 创建被对象：实现接口
 * 创建代理对象：指定被代理对象(参数二)；代理的核心流程也实现接口(参数三)
 */

public class ProxyDemo {
    public static void main(String[] args) {
        //创建被代理对象
        Star sr = new Star("张无忌");
        //创建代理经纪人对象
        StarInterface si = StarProxy.getProxy(sr);
        //用代理经纪人对象调用被代理人的方法，先走代理，然后在由代理经济人调用方法
        si.dance();
    }
}
