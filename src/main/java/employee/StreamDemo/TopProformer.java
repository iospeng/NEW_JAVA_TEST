package main.java.employee.StreamDemo;

public class TopProformer {
    private String name;
    private Double money;

    public TopProformer() {
    }

    public TopProformer(String name, Double money) {
        this.name = name;
        this.money = money;
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

    @Override
    public String toString() {
        return "TopProformer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
