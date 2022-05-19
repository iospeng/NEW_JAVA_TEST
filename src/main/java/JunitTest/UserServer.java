package main.java.JunitTest;

public class UserServer {
    private String name = "admin";
    public String loginName(){
        if ("admin1".equals(name)){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }

    public void out(){
        System.out.println(10/0);
        System.out.println("无返回值方法测试");
    }
}
