package main.java.employee.Objects;
/*
    Object类
    重写Object类的toString方法，输入类对象的内容
    重写Object类的equals方法，比较两个对象的内容是否相同
 */

import java.util.Objects;

public class ObjectDemo {
    private String name;
    private int age;

    public ObjectDemo() {
    }

    public ObjectDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectDemo that = (ObjectDemo) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
