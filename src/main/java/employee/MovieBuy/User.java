package main.java.employee.MovieBuy;
/*
    用户类，作为商家、用户的父类
 */

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;

public class User {
    private String loginName; // 登陆名，不能重复
    private String passWord;  // 登陆密码
    private String name;      // 真实姓名
    private String gender;    // 性别
    private String phone;       // 手机号
    private double money;     // 账户余额

    public User() {
    }

    public User(String loginName, String passWord, String name, String gender, String phone, double money) {
        this.loginName = loginName;
        this.passWord = passWord;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.money = money;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.money, money) == 0 && Objects.equals(loginName, user.loginName) && Objects.equals(passWord, user.passWord) && Objects.equals(name, user.name) && Objects.equals(gender, user.gender) && Objects.equals(phone, user.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginName, passWord, name, gender, phone, money);
    }
}
