package main.java.FactoryPattern;

public class Mac extends Computer{
    @Override
    public void start() {
        System.out.println(getName() + "启动了");
    }
}
