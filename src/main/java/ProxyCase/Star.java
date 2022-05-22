package main.java.ProxyCase;

public class Star implements StarInterface{
    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println(name  + "被经纪人叫去开始跳舞");
    }

    @Override
    public void sing() {
        System.out.println(name  + "被经纪人叫去开始唱歌");

    }
}
