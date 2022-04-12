package main.java.employee.StreamDemo;

public class Employee {
    private String name;
    private String sec;
    private double salay;
    private double bonus;
    private String punish;

    public Employee() {
    }

    public Employee(String name, String sec, double salay, double bonus, String punish) {
        this.name = name;
        this.sec = sec;
        this.salay = salay;
        this.bonus = bonus;
        this.punish = punish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public double getSalay() {
        return salay;
    }

    public void setSalay(double salay) {
        this.salay = salay;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPunish() {
        return punish;
    }

    public void setPunish(String punish) {
        this.punish = punish;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sec='" + sec + '\'' +
                ", salay=" + salay +
                ", bonus=" + bonus +
                ", punish='" + punish + '\'' +
                '}';
    }
}
