package main.java.employee.StudentAdmin;

public class Students {
    private String number;
    private String name;
    private String age;
    private String ress;

    public Students() {
    }

    public Students(String number, String name, String age, String ress) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.ress = ress;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRess() {
        return ress;
    }

    public void setRess(String ress) {
        this.ress = ress;
    }
}
