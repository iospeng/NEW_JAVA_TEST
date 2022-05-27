package main.java.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * JDBC(java DataBase Connectivity)
 * 概述：Java语言操作关系型数据库的一套api
 * 本质：
 * 官方(sun公司)定义的一套操作所有关系型数据库的规则，既接口
 * 各个数据库厂商趋势线这套接口，提供数据库驱动jar包
 * 我们可以使用这套接口(JDBC)编程，真正执行的代码是驱动jar包中的实现类
 * 好处：
 * 个数据库厂商使用相同的接口，Java代码不需要针对不同数据库本别开发
 * 可随时替换底层数据库，访问数据库的Java代码基本不变
 * 使用步骤
 * 导入mysql jar包
 * jar包下载地址：https://dev.mysql.com/downloads/connector/j/
 * 注册驱动
 * class.forName("com.mysql.jdbc.Driver");该名称是固定的“com.mysql.jdbc.Driver”
 * 获取连接
 * connection conn = DriverManager.getConnection(url,username,password);
 * 定义SQL语句
 * String SQL= “select * from ...”
 * 获取执行SQL对象
 * Statement stmt = conn.createStatement();
 * 执行SQL
 * stmt.executeUpdate(sql);
 * 处理返回结果，返回的是受影响的行数
 * 释放资源
 * close()
 */
public class JDBCCase {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://121.199.61.136:3306/db1";
        String userName = "username";
        String passWord = "username";
        //获取连接
        Connection conn = DriverManager.getConnection(url,userName,passWord);
        //定义sql
        String sql = "INSERT INTO score VALUES(3,3,'王五',93)";
        //获取执行SQL的对象
        Statement stmt = conn.createStatement();
        //执行sql
        int num = stmt.executeUpdate(sql);
        //处理返回结果
        System.out.println(num);
        //释放资源
        stmt.close();
        conn.close();
    }
}
