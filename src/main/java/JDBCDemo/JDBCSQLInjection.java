package main.java.JDBCDemo;

import com.sun.org.apache.xerces.internal.dom.PSVIElementNSImpl;

import java.sql.*;

/**
 * PreparedStatement
 * 预编译SQL语句并执行：去放SQL注入问题
 * SQL注入
 * SQL注入是通过操作输入来修改实现定义好的SQL语句，用以达到执行代码对服务进行攻击的方法
 * 使用步骤
 * 获取PreparedStatement对象
 * SQL语句中的参数值，使用？占位符代替
 * String sql = “select * from user where username= ?”;
 * 通过Connection对象获取，并传入对应的SQL语句
 * PreparedStatement pstme = conn.prepareStatement(sql);
 * 设置参数
 * PreparedStatement对象：setxx(参数1，参数2): 给？赋值
 * xxx:shuju leixing :ru setInt(参数1，参数2):
 * 参数：
 * 参数1：?的位置编号，从1开始
 * 参数2：？的值
 * 执行SQL
 * executeUpdate()；/excuteQuery();不需要再传递sql
 */
public class JDBCSQLInjection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://121.199.61.136:3306/db1?useSSL=false";
        String username = "username";
        String passWord = "username";
        //获取数据库连接
        Connection conn = DriverManager.getConnection(url,username,passWord);
        //创建sql
        String sql = "SELECT * FROM `user` WHERE `name` = ? AND `password` = ?";
        //创建执行SQL对象 PreparedStatement 解决SQL注入问题
        PreparedStatement prstmt = conn.prepareStatement(sql);
        //设置SQL中？的值
        prstmt.setString(1,"张三");
        prstmt.setString(2,"123456");
        //执行SQL
        ResultSet resultSet = prstmt.executeQuery();

        //判断是否查询到数据
        if (resultSet.next()){
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("password"));
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
        //释放资源
        resultSet.close();
        prstmt.close();
        conn.close();
    }
}
