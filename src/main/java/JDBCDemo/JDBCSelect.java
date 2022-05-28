package main.java.JDBCDemo;

import main.java.JDBCDemo.pojo.score;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCSelect {
    public static void main(String[] args) throws Exception {
        //注册驱动 JDK5以后可以省略
//        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://121.199.61.136:3306/db1?useSSL=false";
        String userName = "username";
        String passWord = "username";
        //获取连接
        Connection conn = DriverManager.getConnection(url,userName,passWord);
        //定义sql
        String sql1 = "SELECT * FROM score";
        //获取执行SQL的对象
        Statement stmt = conn.createStatement();
        //执行sql
        ResultSet resultSet = stmt.executeQuery(sql1);
        //创建集合存放查询到的用户对象
        List<score> ls = new ArrayList<>();
        //循环获取执行SQL查询到的数据
        while (resultSet.next()){
            //创建用户对象，用于封装数据
            score score = new score();
            //获取数据
            int id = resultSet.getInt("id");
            int user_id = resultSet.getInt("user_id");
            String name = resultSet.getString("name");
            String languagescore = resultSet.getString("languagescore");
            //赋值
            score.setId(id);
            score.setUser_id(user_id);
            score.setName(name);
            score.setScore(languagescore);
            ls.add(score);
        }
        System.out.println(ls);
        //释放资源
        resultSet.close();
        stmt.close();
        conn.close();
    }
}
