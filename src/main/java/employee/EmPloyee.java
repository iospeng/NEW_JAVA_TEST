package main.java.employee;

public class EmPloyee {
    String name;
    int age;
    String designation;
    double salary;
    int a = 0146;
    int b = 0x64;
    char c = 'a';

    public EmPloyee(String name){
        this.name = name;
    }
    public void empAge(int empAge){
        age = empAge;
    }
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    public int empPr(){
        return age;
    }
    public void printEmployee(){
        System.out.println("employee:name:"+ name);
        System.out.println("employee:age:"+ age);
        System.out.println("employee:designation:"+ designation);
        System.out.println("employee:salary:"+ salary);
        System.out.println("8进制：a(0146) = "+ a);
        System.out.println("16进制：b(0x64) = "+ b);
        System.out.println("char: c = "+c);

    }

}
