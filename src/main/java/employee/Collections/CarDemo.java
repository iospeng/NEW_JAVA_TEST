package main.java.employee.Collections;

public class CarDemo implements Comparable<CarDemo> {
    private String name;
    private Double money;
    private int weight;

    public CarDemo() {
    }

    public CarDemo(String name, Double money, int weight) {
        this.name = name;
        this.money = money;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CarDemo{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(CarDemo o) {
//        return this.weight - o.weight; // 重量升序排序
        return o.weight - this.weight; // 重量降序序排序
    }
}
