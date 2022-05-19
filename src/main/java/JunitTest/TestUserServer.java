package main.java.JunitTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * 测试类
 * 将JUnit的jar导入项目中
 * IDEA通常整合好了JUnit框架，一般不需要导入
 * 如果IDEA没有整合好，需要自己手工导入如下两个Junit的jar包到模块
 * 编写测试方法：该测试方法必须是公共的无参数无返回值的非静态方法
 * 在测试方法上使用@Test注解：标注该方法是测试方法
 * 在测试方法中完成被测试方法的预期正确性测试
 * 选中测试方法，选中“JUnit运行",如果测试良好是绿色，失败时红色
 * 单元测试的常用注解
 * @Test：测试方法
 * @Before：用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次
 * @After：用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次
 * @BeforeClass：用来修饰静态方法，该方法会在所有测试方法之前执行一次
 * @AfterClass：用来修饰静态方法，该方法会在所有测试方法之后执行一直
 * 作用
 * 开始执行的方法：初始化资源
 * 执行完之后的方法：释放资源
 */

public class TestUserServer {
    @Test
    public void testLoginName(){
        UserServer us = new UserServer();
        String str = us.loginName();
        //断言
        Assert.assertEquals("方法有问题","登录成功",str);
    }
    @Test
    public void testOut(){
        UserServer us = new UserServer();
        us.out();
    }
}
