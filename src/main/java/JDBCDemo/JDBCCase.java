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
 * JDBC API
 * DriverManager:驱动管理类
 * 注册驱动
 * 获取数据库连接
 * Connection：连接数据库对象
 * 获取执行SQL的对象
 * 方法
 * createStatement()：普通执行SQL对象
 * prepareStatement(sql)：预编译SQL的执行SQL对象，防止SQL注入
 * prepareCall(sql)：执行存储过程的对象
 * 管理事务
 * 开启事务
 * setAutoCommit(Boolean autoCommit)：true为自动提交事务；false为手动提交事务，即为开启事务
 * 提交事务
 * commit()
 * 回滚事务
 * rollback()
 * Statement：执行SQL语句
 * 方法
 * executeUpdate(sql):执行dml、ddl语句
 * 返回值：1、dml语句影响的行数；2、ddl语句执行后，成功也可能返回0
 *  executeQuery(sql)：执行DQL语句、
 * 返回值：ResultSet结果集对象
 * ResultSet：结果集对象，封装了dql查询语句的结果
 * 方法：
 * next():查询一行数据
 * 1、将光标从当前位置向前移动一行
 * 2、判断当前行是否有效
 * 返回值
 * true：有效行，当前行数据
 * false：无效行，当前行没有数据
 * getxxx(参数)：获取数据（从next查询到的一行数据中获取）
 * xxx：代表数据类型
 * 参数：
 * int：列的编号，从1开始
 * String：列的名称
 * PreparedStatement
 */
public class JDBCCase {
    public static void main(String[] args) throws Exception {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://121.199.61.136:3306/db1?useSSL=false";
        String userName = "username";
        String passWord = "username";
        //获取连接
        Connection conn = DriverManager.getConnection(url,userName,passWord);
        //定义sql
        String sql1 = "UPDATE score SET languagescore = 80 WHERE ID = 1";
        String sql2 = "UPDATE score SET languagescore = 70 WHERE ID = 2";
        //获取执行SQL的对象
        Statement stmt = conn.createStatement();
        try {
            //开启事务
            conn.setAutoCommit(false);
            //执行sql
            int num1 = stmt.executeUpdate(sql1);
            //处理返回结果
            System.out.println(num1);
            //执行sql
            int num2 = stmt.executeUpdate(sql2);
            //处理返回结果
            System.out.println(num2);
            //执行事务
            conn.commit();
        } catch (Exception e) {
            //回滚事务
            conn.rollback();
            e.printStackTrace();
        }

        //释放资源
        stmt.close();
        conn.close();
    }
}
