package main;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import main.Book;

import java.util.logging.Logger;

import com.mysql.jdbc.PreparedStatement;

public class BooksDao {

    public BooksDao(){}
//    public BooksDao(Connection con){
//        this.con=con;
//    }
    private static  Connection conn=null;
    private static final String URL="jdbc:mysql://127.0.0.1:3306/loading?characterEncoding=utf8&useSSL=true";
    private static final String USER="root";
    private static final String PASSWORD="zengyujie1025";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USER, PASSWORD);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Book> getBook(String whereOption){
        List<Book> list=new ArrayList<Book>();
        String sql="select * from stu";
        ResultSet rs=null;
        if(!whereOption.equals("")){
            sql+=" where stuName like '%"+whereOption+"%'";
        }
        try {
            Statement statement=(Statement)conn.createStatement();
            rs=statement.executeQuery(sql); //执行sql语句
            Book book=null;
            while(rs.next()){
                book=new Book();
                book.setId(rs.getInt("id"));
                book.setBookname(rs.getString("stuName"));
                book.setPrice(rs.getFloat("price"));
                book.setAuthor(rs.getString("Author"));
                list.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    public void addbook(Book book){
        String sql="insert into book(id,bookname,author,price) VALUES(?,?,?,?)";
        PreparedStatement ps=null;
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            ps.setInt(1,book.getId());
            ps.setString(2,book.getBookname());
            ps.setString(3,book.getAuthor());
            ps.setFloat(4,book.getPrice());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void iddeletebook(int id){
        String sql="DELETE FROM book WHERE id=?";
        PreparedStatement ps=null;
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void namedeletebook(String bookname){
        String sql="DELETE FROM book WHERE bookname=?";
        PreparedStatement ps=null;
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1,bookname);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void pricedeletebook(float price){
        String sql="DELETE FROM book WHERE price=?";
        PreparedStatement ps=null;
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            ps.setFloat(1,price);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void authordelete(String author){
        String sql="DELETE FROM book WHERE author=?";
        PreparedStatement ps=null;
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            ps.setString(1,author);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void idchangebook(int id){

    }


    public void findbook(String boookname){

    }

    public void clearbook(){

    }

    public void borrowbook(){

    }
    public void getbook(Book book){
        String sql="select* from book(id,bookname,author,price) VALUES(?,?,?,?)";
        PreparedStatement pss=null;
        try {
            pss=(PreparedStatement) conn.prepareStatement(sql);
            pss.setInt(1,book.getId());
            pss.setString(2,book.getBookname());
            pss.setString(3,book.getAuthor());
            pss.setFloat(4,book.getPrice());
            pss.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
