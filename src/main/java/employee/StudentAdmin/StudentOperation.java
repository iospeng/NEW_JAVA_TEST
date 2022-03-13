package main.java.employee.StudentAdmin;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentOperation {
    ArrayList<Students> array = new ArrayList<Students>();

    public void home() {
        while (true) {
            System.out.println("--------欢迎使用学生管理系统--------");
            System.out.println("请选择您要进行的操作：");
            System.out.println("1.添加学生信息");
            System.out.println("2.修改学生信息");
            System.out.println("3.删除学生信息");
            System.out.println("4.查看所有学生信息");
            System.out.println("5.查看所有学生信息");
            System.out.println("请输入：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    addStudent();
                    break;
                case "2":
//                    System.out.println("修改学生");
                    setStudent(array);
                    break;
                case "3":
//                    System.out.println("删除学生");
                    delStudent(array);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    lockStudent(array);
                    break;
                case "5":
                    System.out.println("已退出！！！");
                    return;
                default:
                    System.out.println("请选择给出的选项：");
            }
        }


    }

    //添加学生方法
    public void addStudent() {
        //获取录入数据，复制给学生类
        Scanner sc = new Scanner(System.in);
        //请输入学生编号
        System.out.println("请输入学生编号：");
        String number = sc.nextLine();
        //请输入学生姓名
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        //请输入学生年龄
        System.out.println("请输入学生年龄“");
        String age = sc.nextLine();
        //请输入学生住址
        System.out.println("请输入学生住址：");
        String ress = sc.nextLine();

        //实例化学生类
        Students student = new Students();
        //将获取到的数据复制给学生类
        if (number.equals(student.getNumber())) {
            System.out.println("该学号已存在，请重新选择操作！！！");
            return;
        }
        student.setNumber(number);
        student.setName(name);
        student.setAge(age);
        student.setRess(ress);
        //将学生类添加到集合中
        array.add(student);
        System.out.println("添加成功");

    }

    //修改学生信息
    public void setStudent(ArrayList<Students> array) {
        //获取录入数据，复制给学生类
        Scanner sc = new Scanner(System.in);
        //请输入将需要修改信息的学生编号
        System.out.println("请输入需要修改信息的学生编号：");
        String setNumber = sc.nextLine();
        int noNum = 0;
        for (int i = 0; i < array.size(); i++) {
            Students s = array.get(i);
            if (setNumber.equals(s.getNumber())) {
                //请输入学生新编号
                System.out.println("请输入新学生编号：");
                String number = sc.nextLine();
                //请输入学生新姓名
                System.out.println("请输入新学生姓名：");
                String name = sc.nextLine();
                //请输入学生新年龄
                System.out.println("请输入新学生年龄“");
                String age = sc.nextLine();
                //请输入学生新住址
                System.out.println("请输入新学生住址：");
                String ress = sc.nextLine();
                //实例化学生类
                Students student = new Students();
                //遍历集合，如果输入的新编号与集合中的任意一个编号重复则无法添加
                for (Students ss : array) {
                    //将获取到的数据复制给学生类
                    if (number.equals(ss.getNumber())) {
                        System.out.println("该学号已存在，请重新选择操作！！！");
                        return;
                    }
                }
                student.setNumber(number);
                student.setName(name);
                student.setAge(age);
                student.setRess(ress);
                //修改集合数据
                array.set(i, student);
                System.out.println("修改成功");
            } else {
                noNum++;
            }
        }
        if (noNum == array.size()) {
            System.out.println("您输入的学号不存在，请重新选择操作！！！");
        }
    }

    //删除学生信息
    public void delStudent(ArrayList<Students> array) {
        //获取录入的学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的学号：");
        String number = sc.nextLine();
        int num  = array.size();
        for (int i = 0; i < array.size(); i++) {
            Students s = array.get(i);
            if (number.equals(s.getNumber())) {
                array.remove(i);
                System.out.println("删除成功");
            }
        }
        if (num == array.size()){
            System.out.println("您输入的学号不存在，请重新选择操作！！！");
        }
    }

    // 查看所有学生
    public void lockStudent(ArrayList<Students> array) {
        if (array.size() == 0) {
            System.out.println("暂无数据，请先添加学生数据！！！");
            return;
        }
        System.out.println("学号\t姓名\t年龄\t住址");
        for (Students s : array) {
            System.out.println(s.getNumber() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getRess());
        }

    }
}
