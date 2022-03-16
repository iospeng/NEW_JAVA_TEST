package main.java.employee.HttpInterface;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestController {
    /**
     * getByName 获取指定主机的IP地址
     * */
    public void testInetAddress() {
        InetAddress Iadd = null;
        try {
            Iadd = InetAddress.getByName("www.baidu.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println("设置的地址：" + Iadd);
        System.out.println("getHostName仅仅输入设置的域名:" + Iadd.getHostName()+ "getHostAddress输出设置的域名及IP地址" + Iadd.getHostAddress());
    }
}
