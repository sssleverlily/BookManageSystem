package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Operater {
    public boolean addBook(String bookname,String author,float price,int id)
    {
        try {
                Connection conn = Loading.getConnection();
                Statement stmt = conn.createStatement();
                String sql = "insert into book(bookname,author,price,id) values('"+bookname+"','"+author+"',"+price+",'"+id+"')";
                stmt.execute(sql);
                stmt.close();
                return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteBook(int id,String bookname)
    {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql;
            if(id != -1)
            {
                sql = "delete from book where id ='" + id+"';";
            }
            else
            {
                sql = "delete from book where bookname ='" + bookname+"';";
            }
            stmt.execute(sql);
            stmt.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
    public void iddeletebook(int id) {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql;
            sql = "delete from book where id ='" + id+"';";
            stmt.execute(sql);
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void namedeletebook(String bookname) {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql;
            sql = "delete from book where bookname ='" + bookname+"';";
            stmt.execute(sql);
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public boolean changeBook(int id,String bookname,String changename)
    {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql;
            if (id != -1)
            {
                sql = "update book set bookname='"+changename+"'"+" where id="+id;
            }
            else
            {
                sql = "update book set bookname='"+changename+"'"+" where bookname='"+bookname+"'";
            }
            stmt.execute(sql);
            stmt.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public void findBook(int id,String bookname)
    {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql;
//            if (id != -1)
//            {
//                sql = "select id,bookname,author,price from book"+" where id="+id;
//                System.out.println(sql);
//            }
//            else
//            {
                sql = "select id,bookname,author,price from book"+" where bookname='"+bookname+"'";
//            }
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("查找成功！您查找的结果为：\n");
            while(rs.next()){//如果对象中有数据，就会循环打印出来
                System.out.println("编号："+rs.getInt("id")+" 书名："+rs.getString("bookname")+",作者："+rs.getString("author")+",价格："+rs.getFloat("price"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void printAllbook()
    {
        //3.通过数据库的连接操作数据库，实现增删改查
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select id,bookname,author,price from book");//选择import java.sql.ResultSet;
            while(rs.next()){//如果对象中有数据，就会循环打印出来
                System.out.println("编号："+rs.getInt("id")+" 书名："+rs.getString("bookname")+",作者："+rs.getString("author")+",价格："+rs.getFloat("price"));
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public boolean clearBook()
    {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "truncate table book";
            stmt.execute(sql);
            stmt.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean borrowBook(int year,int month,int day)
    {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "insert into book(year,month,day) values('"+year+"','"+month+"',"+day+")";
            stmt.execute(sql);
            stmt.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean returnBook(String bookname,int id)
    {
        try {
            Connection conn = Loading.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "insert into book(bookname,id) values('"+bookname+"','"+id+"')";
            stmt.execute(sql);
            stmt.close();
            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
}
