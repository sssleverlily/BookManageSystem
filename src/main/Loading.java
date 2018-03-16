package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Loading {
    private static final String URL="jdbc:mysql://127.0.0.1:3306/loading?characterEncoding=utf8&useSSL=true";
    private static final String USER="root";
    private static final String PASSWORD="zengyujie1025";
    private static Connection conn=null;//静态代码块（将加载驱动、连接数据库放入静态块中）
    static{
        try {
            //1.加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //2.获得数据库的连接
            conn = DriverManager.getConnection(URL,USER, PASSWORD);
            System.out.println("数据库连接成功！" + conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

       protected void pipi()
       {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //对外提供一个方法来获取数据库连接
    public static Connection getConnection(){
        // TODO Auto-generated method stub
        return conn;
    }
}
