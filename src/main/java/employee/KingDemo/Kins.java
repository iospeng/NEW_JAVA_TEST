package main.java.employee.KingDemo;

import java.util.List;

public class Kins {
    private String name;
    private List<String> poker;

    public Kins() {
    }

    public Kins(String name, List<String> poker) {
        this.name = name;
        this.poker = poker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPoker() {
        return poker;
    }

    public void setPoker(List<String> poker) {
        this.poker = poker;
    }

    @Override
    public String toString() {
        return "PersonTwo{" +
                "name='" + name + '\'' +
                ", poker=" + poker +
                '}';
    }
}
