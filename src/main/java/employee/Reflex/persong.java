package main.java.employee.Reflex;

public class persong {
    private String name;
    public  int age;
    protected String a;
    String b;

    public persong() {
    }

    public persong(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "persong{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("eat...");
    }
}
