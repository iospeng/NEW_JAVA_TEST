package main.java.FactoryPattern;

public class HUAWEI extends Computer{
    @Override
    public void start() {
        System.out.println(getName() + "启动了");
    }
}
